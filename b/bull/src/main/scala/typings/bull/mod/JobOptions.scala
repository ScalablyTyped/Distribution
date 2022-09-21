package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOptions extends StObject {
  
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
    * Default behavior is to keep the job in the completed set.
    * See KeepJobsOptions if using that interface instead.
    */
  var removeOnComplete: js.UndefOr[Boolean | Double | KeepJobsOptions] = js.undefined
  
  /**
    * A boolean which, if true, removes the job when it fails after all attempts.
    * When a number, it specifies the amount of jobs to keep.
    * Default behavior is to keep the job in the failed set.
    * See KeepJobsOptions if using that interface instead.
    */
  var removeOnFail: js.UndefOr[Boolean | Double | KeepJobsOptions] = js.undefined
  
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
  
  inline def apply(): JobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOptions]
  }
  
  extension [Self <: JobOptions](x: Self) {
    
    inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    
    inline def setBackoff(value: Double | BackoffOptions): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
    
    inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLifo(value: Boolean): Self = StObject.set(x, "lifo", value.asInstanceOf[js.Any])
    
    inline def setLifoUndefined: Self = StObject.set(x, "lifo", js.undefined)
    
    inline def setPreventParsingData(value: Boolean): Self = StObject.set(x, "preventParsingData", value.asInstanceOf[js.Any])
    
    inline def setPreventParsingDataUndefined: Self = StObject.set(x, "preventParsingData", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRemoveOnComplete(value: Boolean | Double | KeepJobsOptions): Self = StObject.set(x, "removeOnComplete", value.asInstanceOf[js.Any])
    
    inline def setRemoveOnCompleteUndefined: Self = StObject.set(x, "removeOnComplete", js.undefined)
    
    inline def setRemoveOnFail(value: Boolean | Double | KeepJobsOptions): Self = StObject.set(x, "removeOnFail", value.asInstanceOf[js.Any])
    
    inline def setRemoveOnFailUndefined: Self = StObject.set(x, "removeOnFail", js.undefined)
    
    inline def setRepeat(value: CronRepeatOptions | EveryRepeatOptions): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
    
    inline def setStackTraceLimitUndefined: Self = StObject.set(x, "stackTraceLimit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
