package typings.bull.bullMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedSettings extends js.Object {
  /**
    * Define a custom backoff strategy
    */
  var backoffStrategies: js.UndefOr[
    StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ Error, Double]]
  ] = js.undefined
  /**
    * A timeout for when the queue is in `drained` state (empty waiting for jobs).
    * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
    */
  var drainDelay: js.UndefOr[Double] = js.undefined
  /**
    * Poll interval for delayed jobs and added jobs
    */
  var guardInterval: js.UndefOr[Double] = js.undefined
  /**
    * Key expiration time for job locks
    */
  var lockDuration: js.UndefOr[Double] = js.undefined
  /**
    * Interval in milliseconds on which to acquire the job lock.
    */
  var lockRenewTime: js.UndefOr[Double] = js.undefined
  /**
    * Max amount of times a stalled job will be re-processed
    */
  var maxStalledCount: js.UndefOr[Double] = js.undefined
  /**
    * Delay before processing next job in case of internal error
    */
  var retryProcessDelay: js.UndefOr[Double] = js.undefined
  /**
    * How often check for stalled jobs (use 0 for never checking)
    */
  var stalledInterval: js.UndefOr[Double] = js.undefined
}

object AdvancedSettings {
  @scala.inline
  def apply(
    backoffStrategies: StringDictionary[js.Function2[/* attemptsMade */ Double, /* err */ Error, Double]] = null,
    drainDelay: Int | Double = null,
    guardInterval: Int | Double = null,
    lockDuration: Int | Double = null,
    lockRenewTime: Int | Double = null,
    maxStalledCount: Int | Double = null,
    retryProcessDelay: Int | Double = null,
    stalledInterval: Int | Double = null
  ): AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    if (backoffStrategies != null) __obj.updateDynamic("backoffStrategies")(backoffStrategies.asInstanceOf[js.Any])
    if (drainDelay != null) __obj.updateDynamic("drainDelay")(drainDelay.asInstanceOf[js.Any])
    if (guardInterval != null) __obj.updateDynamic("guardInterval")(guardInterval.asInstanceOf[js.Any])
    if (lockDuration != null) __obj.updateDynamic("lockDuration")(lockDuration.asInstanceOf[js.Any])
    if (lockRenewTime != null) __obj.updateDynamic("lockRenewTime")(lockRenewTime.asInstanceOf[js.Any])
    if (maxStalledCount != null) __obj.updateDynamic("maxStalledCount")(maxStalledCount.asInstanceOf[js.Any])
    if (retryProcessDelay != null) __obj.updateDynamic("retryProcessDelay")(retryProcessDelay.asInstanceOf[js.Any])
    if (stalledInterval != null) __obj.updateDynamic("stalledInterval")(stalledInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSettings]
  }
}

