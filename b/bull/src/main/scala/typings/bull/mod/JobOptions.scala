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
    * Prevents JSON data from being parsed.
    */
  var preventParsingData: js.UndefOr[Boolean] = js.undefined
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
    attempts: js.UndefOr[Double] = js.undefined,
    backoff: Double | BackoffOptions = null,
    delay: js.UndefOr[Double] = js.undefined,
    jobId: JobId = null,
    lifo: js.UndefOr[Boolean] = js.undefined,
    preventParsingData: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    removeOnComplete: Boolean | Double = null,
    removeOnFail: Boolean | Double = null,
    repeat: CronRepeatOptions | EveryRepeatOptions = null,
    stackTraceLimit: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): JobOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attempts)) __obj.updateDynamic("attempts")(attempts.get.asInstanceOf[js.Any])
    if (backoff != null) __obj.updateDynamic("backoff")(backoff.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (!js.isUndefined(lifo)) __obj.updateDynamic("lifo")(lifo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventParsingData)) __obj.updateDynamic("preventParsingData")(preventParsingData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (removeOnComplete != null) __obj.updateDynamic("removeOnComplete")(removeOnComplete.asInstanceOf[js.Any])
    if (removeOnFail != null) __obj.updateDynamic("removeOnFail")(removeOnFail.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (!js.isUndefined(stackTraceLimit)) __obj.updateDynamic("stackTraceLimit")(stackTraceLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOptions]
  }
}

