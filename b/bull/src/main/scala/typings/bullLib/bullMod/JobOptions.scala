package typings
package bullLib.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOptions extends js.Object {
  /**
    * The total number of attempts to try the job until it completes
    */
  var attempts: js.UndefOr[scala.Double] = js.undefined
  /**
    * Backoff setting for automatic retries if the job fails
    */
  var backoff: js.UndefOr[scala.Double | BackoffOptions] = js.undefined
  /**
    * An amount of miliseconds to wait until this job can be processed.
    * Note that for accurate delays, both server and clients should have their clocks synchronized. [optional]
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Override the job ID - by default, the job ID is a unique
    * integer, but you can use this setting to override it.
    * If you use this option, it is up to you to ensure the
    * jobId is unique. If you attempt to add a job with an id that
    * already exists, it will not be added.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    * A boolean which, if true, adds the job to the right
    * of the queue instead of the left (default false)
    */
  var lifo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional priority value. ranges from 1 (highest priority) to MAX_INT  (lowest priority).
    * Note that using priorities has a slight impact on performance, so do not use it if not required
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /**
    * A boolean which, if true, removes the job when it successfully completes.
    * Default behavior is to keep the job in the completed set.
    */
  var removeOnComplete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean which, if true, removes the job when it fails after all attempts
    * Default behavior is to keep the job in the completed set.
    */
  var removeOnFail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Repeat job according to a cron specification
    */
  var repeat: js.UndefOr[CronRepeatOptions | EveryRepeatOptions] = js.undefined
  /**
    * Limits the amount of stack trace lines that will be recorded in the stacktrace.
    */
  var stackTraceLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    *  The number of milliseconds after which the job should be fail with a timeout error
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object JobOptions {
  @scala.inline
  def apply(
    attempts: scala.Int | scala.Double = null,
    backoff: scala.Double | BackoffOptions = null,
    delay: scala.Int | scala.Double = null,
    jobId: JobId = null,
    lifo: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null,
    removeOnComplete: js.UndefOr[scala.Boolean] = js.undefined,
    removeOnFail: js.UndefOr[scala.Boolean] = js.undefined,
    repeat: CronRepeatOptions | EveryRepeatOptions = null,
    stackTraceLimit: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): JobOptions = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (!js.isUndefined(lifo)) __obj.updateDynamic("lifo")(lifo)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOnComplete)) __obj.updateDynamic("removeOnComplete")(removeOnComplete)
    if (!js.isUndefined(removeOnFail)) __obj.updateDynamic("removeOnFail")(removeOnFail)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (stackTraceLimit != null) __obj.updateDynamic("stackTraceLimit")(stackTraceLimit.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOptions]
  }
}

