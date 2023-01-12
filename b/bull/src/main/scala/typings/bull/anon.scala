package typings.bull

import typings.bull.mod.BackoffOptions
import typings.bull.mod.JobId
import typings.bull.mod.JobOptions
import typings.bull.mod.KeepJobsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttemptsMade[T] extends StObject {
    
    var attemptsMade: Double
    
    var data: T
    
    var delay: Double
    
    var failedReason: Any
    
    var finishedOn: Double | Null
    
    var id: JobId
    
    var name: String
    
    var opts: JobOptions
    
    var processedOn: Double | Null
    
    var progress: Double
    
    var returnvalue: Any
    
    var stacktrace: js.Array[String] | Null
    
    var timestamp: Double
  }
  object AttemptsMade {
    
    inline def apply[T](
      attemptsMade: Double,
      data: T,
      delay: Double,
      failedReason: Any,
      id: JobId,
      name: String,
      opts: JobOptions,
      progress: Double,
      returnvalue: Any,
      timestamp: Double
    ): AttemptsMade[T] = {
      val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], finishedOn = null, processedOn = null, stacktrace = null)
      __obj.asInstanceOf[AttemptsMade[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttemptsMade[?], T] (val x: Self & AttemptsMade[T]) extends AnyVal {
      
      inline def setAttemptsMade(value: Double): Self = StObject.set(x, "attemptsMade", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setFailedReason(value: Any): Self = StObject.set(x, "failedReason", value.asInstanceOf[js.Any])
      
      inline def setFinishedOn(value: Double): Self = StObject.set(x, "finishedOn", value.asInstanceOf[js.Any])
      
      inline def setFinishedOnNull: Self = StObject.set(x, "finishedOn", null)
      
      inline def setId(value: JobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: JobOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setProcessedOn(value: Double): Self = StObject.set(x, "processedOn", value.asInstanceOf[js.Any])
      
      inline def setProcessedOnNull: Self = StObject.set(x, "processedOn", null)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setReturnvalue(value: Any): Self = StObject.set(x, "returnvalue", value.asInstanceOf[js.Any])
      
      inline def setStacktrace(value: js.Array[String]): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceNull: Self = StObject.set(x, "stacktrace", null)
      
      inline def setStacktraceVarargs(value: String*): Self = StObject.set(x, "stacktrace", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var logs: js.Array[String]
  }
  object Count {
    
    inline def apply(count: Double, logs: js.Array[String]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[String]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsVarargs(value: String*): Self = StObject.set(x, "logs", js.Array(value*))
    }
  }
  
  /* Inlined bull.bull.CronRepeatOptions & {  jobId :bull.bull.JobId | undefined} */
  trait CronRepeatOptionsjobIdJob extends StObject {
    
    /**
      * Cron pattern specifying when the job should execute
      */
    var cron: String
    
    /**
      * End date when the repeat job should stop repeating
      */
    var endDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    var jobId: js.UndefOr[JobId] = js.undefined
    
    /**
      * Number of times the job should repeat at max.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Start date when the repeat job should start repeating (only with cron).
      */
    var startDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * Timezone
      */
    var tz: js.UndefOr[String] = js.undefined
  }
  object CronRepeatOptionsjobIdJob {
    
    inline def apply(cron: String): CronRepeatOptionsjobIdJob = {
      val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronRepeatOptionsjobIdJob]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CronRepeatOptionsjobIdJob] (val x: Self) extends AnyVal {
      
      inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: js.Date | String | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setStartDate(value: js.Date | String | Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
    }
  }
  
  trait Data[T] extends StObject {
    
    var data: T
    
    var name: js.UndefOr[String] = js.undefined
    
    var opts: js.UndefOr[OmitJobOptionsrepeat] = js.undefined
  }
  object Data {
    
    inline def apply[T](data: T): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data[?], T] (val x: Self & Data[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpts(value: OmitJobOptionsrepeat): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
  
  /* Inlined bull.bull.EveryRepeatOptions & {  jobId :bull.bull.JobId | undefined} */
  trait EveryRepeatOptionsjobIdJo extends StObject {
    
    /**
      * End date when the repeat job should stop repeating
      */
    var endDate: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * Repeat every millis (cron setting cannot be used together with this setting.)
      */
    var every: Double
    
    var jobId: js.UndefOr[JobId] = js.undefined
    
    /**
      * Number of times the job should repeat at max.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Timezone
      */
    var tz: js.UndefOr[String] = js.undefined
  }
  object EveryRepeatOptionsjobIdJo {
    
    inline def apply(every: Double): EveryRepeatOptionsjobIdJo = {
      val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
      __obj.asInstanceOf[EveryRepeatOptionsjobIdJo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EveryRepeatOptionsjobIdJo] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Date | String | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
    }
  }
  
  trait Force extends StObject {
    
    var force: Boolean
  }
  object Force {
    
    inline def apply(force: Boolean): Force = {
      val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Force]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Force] (val x: Self) extends AnyVal {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<bull.bull.JobOptions, 'repeat'> */
  trait OmitJobOptionsrepeat extends StObject {
    
    var attempts: js.UndefOr[Double] = js.undefined
    
    var backoff: js.UndefOr[Double | BackoffOptions] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var jobId: js.UndefOr[JobId] = js.undefined
    
    var lifo: js.UndefOr[Boolean] = js.undefined
    
    var preventParsingData: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var removeOnComplete: js.UndefOr[Boolean | Double | KeepJobsOptions] = js.undefined
    
    var removeOnFail: js.UndefOr[Boolean | Double | KeepJobsOptions] = js.undefined
    
    var stackTraceLimit: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object OmitJobOptionsrepeat {
    
    inline def apply(): OmitJobOptionsrepeat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitJobOptionsrepeat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitJobOptionsrepeat] (val x: Self) extends AnyVal {
      
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
      
      inline def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
      
      inline def setStackTraceLimitUndefined: Self = StObject.set(x, "stackTraceLimit", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
