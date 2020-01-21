package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOptions extends js.Object {
  /**
    * The total number of attempts to try the job until it completes
    */
  var attempts: js.UndefOr[Double] = js.undefined
  /**
    * Backoff setting for automatic retries if the job fails
    */
  var backoff: js.UndefOr[Double | BackoffOptions] = js.undefined
  /**
    * An amount of miliseconds to wait until this job can be processed.
    * Note that for accurate delays, both server and clients should have their clocks synchronized. [optional]
    */
  var delay: js.UndefOr[Double] = js.undefined
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
  var lifo: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional priority value. ranges from 1 (highest priority) to MAX_INT  (lowest priority).
    * Note that using priorities has a slight impact on performance, so do not use it if not required
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * A boolean which, if true, removes the job when it successfully completes.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the failed set.
    */
  var removeOnComplete: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * A boolean which, if true, removes the job when it fails after all attempts.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the completed set.
    */
  var removeOnFail: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Repeat job according to a cron specification
    */
  var repeat: js.UndefOr[CronRepeatOptions | EveryRepeatOptions] = js.undefined
  /**
    * Limits the amount of stack trace lines that will be recorded in the stacktrace.
    */
  var stackTraceLimit: js.UndefOr[Double] = js.undefined
  /**
    *  The number of milliseconds after which the job should be fail with a timeout error
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object JobOptions {
  @scala.inline
  def apply(
    attempts: Int | Double = null,
    backoff: Double | BackoffOptions = null,
    delay: Int | Double = null,
    jobId: JobId = null,
    lifo: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    removeOnComplete: Boolean | Double = null,
    removeOnFail: Boolean | Double = null,
    repeat: CronRepeatOptions | EveryRepeatOptions = null,
    stackTraceLimit: Int | Double = null,
    timeout: Int | Double = null
  ): JobOptions = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (!js.isUndefined(lifo)) __obj.updateDynamic("lifo")(lifo.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (removeOnComplete != null) __obj.updateDynamic("removeOnComplete")(removeOnComplete.asInstanceOf[js.Any])
    if (removeOnFail != null) __obj.updateDynamic("removeOnFail")(removeOnFail.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (stackTraceLimit != null) __obj.updateDynamic("stackTraceLimit")(stackTraceLimit.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOptions]
  }
}

