package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobOptions extends js.Object {
  /**
    * The total number of attempts to try the job until it completes
    */
  var attempts: js.UndefOr[Double] = js.native
  /**
    * Backoff setting for automatic retries if the job fails
    */
  var backoff: js.UndefOr[Double | BackoffOptions] = js.native
  /**
    * An amount of miliseconds to wait until this job can be processed.
    * Note that for accurate delays, both server and clients should have their clocks synchronized. [optional]
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Override the job ID - by default, the job ID is a unique
    * integer, but you can use this setting to override it.
    * If you use this option, it is up to you to ensure the
    * jobId is unique. If you attempt to add a job with an id that
    * already exists, it will not be added.
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    * A boolean which, if true, adds the job to the right
    * of the queue instead of the left (default false)
    */
  var lifo: js.UndefOr[Boolean] = js.native
  /**
    * Prevents JSON data from being parsed.
    */
  var preventParsingData: js.UndefOr[Boolean] = js.native
  /**
    * Optional priority value. ranges from 1 (highest priority) to MAX_INT  (lowest priority).
    * Note that using priorities has a slight impact on performance, so do not use it if not required
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * A boolean which, if true, removes the job when it successfully completes.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the failed set.
    */
  var removeOnComplete: js.UndefOr[Boolean | Double] = js.native
  /**
    * A boolean which, if true, removes the job when it fails after all attempts.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the completed set.
    */
  var removeOnFail: js.UndefOr[Boolean | Double] = js.native
  /**
    * Repeat job according to a cron specification
    */
  var repeat: js.UndefOr[CronRepeatOptions | EveryRepeatOptions] = js.native
  /**
    * Limits the amount of stack trace lines that will be recorded in the stacktrace.
    */
  var stackTraceLimit: js.UndefOr[Double] = js.native
  /**
    *  The number of milliseconds after which the job should be fail with a timeout error
    */
  var timeout: js.UndefOr[Double] = js.native
}

object JobOptions {
  @scala.inline
  def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  @scala.inline
  implicit class JobOptionsOps[Self <: JobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    @scala.inline
    def setBackoff(value: Double | BackoffOptions): Self = this.set("backoff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setLifo(value: Boolean): Self = this.set("lifo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifo: Self = this.set("lifo", js.undefined)
    @scala.inline
    def setPreventParsingData(value: Boolean): Self = this.set("preventParsingData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventParsingData: Self = this.set("preventParsingData", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setRemoveOnComplete(value: Boolean | Double): Self = this.set("removeOnComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnComplete: Self = this.set("removeOnComplete", js.undefined)
    @scala.inline
    def setRemoveOnFail(value: Boolean | Double): Self = this.set("removeOnFail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnFail: Self = this.set("removeOnFail", js.undefined)
    @scala.inline
    def setRepeat(value: CronRepeatOptions | EveryRepeatOptions): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setStackTraceLimit(value: Double): Self = this.set("stackTraceLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackTraceLimit: Self = this.set("stackTraceLimit", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

