package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedSettings extends js.Object {
  /**
    * Define a custom backoff strategy
    */
  var backoffStrategies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* attemptsMade */ scala.Double, /* err */ stdLib.Error, scala.Double]
    ]
  ] = js.undefined
  /**
    * A timeout for when the queue is in `drained` state (empty waiting for jobs).
    * It is used when calling `queue.getNextJob()`, which will pass it to `.brpoplpush` on the Redis client.
    */
  var drainDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Poll interval for delayed jobs and added jobs
    */
  var guardInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key expiration time for job locks
    */
  var lockDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Interval in milliseconds on which to acquire the job lock.
    */
  var lockRenewTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Max amount of times a stalled job will be re-processed
    */
  var maxStalledCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Delay before processing next job in case of internal error
    */
  var retryProcessDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * How often check for stalled jobs (use 0 for never checking)
    */
  var stalledInterval: js.UndefOr[scala.Double] = js.undefined
}

object AdvancedSettings {
  @scala.inline
  def apply(
    backoffStrategies: org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* attemptsMade */ scala.Double, /* err */ stdLib.Error, scala.Double]
    ] = null,
    drainDelay: scala.Int | scala.Double = null,
    guardInterval: scala.Int | scala.Double = null,
    lockDuration: scala.Int | scala.Double = null,
    lockRenewTime: scala.Int | scala.Double = null,
    maxStalledCount: scala.Int | scala.Double = null,
    retryProcessDelay: scala.Int | scala.Double = null,
    stalledInterval: scala.Int | scala.Double = null
  ): AdvancedSettings = {
    val __obj = js.Dynamic.literal()
    if (backoffStrategies != null) __obj.updateDynamic("backoffStrategies")(backoffStrategies)
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

