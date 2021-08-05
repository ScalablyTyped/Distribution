package typings.bull

import typings.bull.mod.JobOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttemptsMade[T] extends StObject {
    
    var attemptsMade: Double
    
    var data: T
    
    var delay: Double
    
    var failedReason: js.Any
    
    var finishedOn: Double | Null
    
    var id: typings.bull.mod.JobId
    
    var name: String
    
    var opts: JobOptions
    
    var processedOn: Double | Null
    
    var progress: Double
    
    var returnvalue: js.Any
    
    var stacktrace: js.Array[String] | Null
    
    var timestamp: Double
  }
  object AttemptsMade {
    
    inline def apply[T](
      attemptsMade: Double,
      data: T,
      delay: Double,
      failedReason: js.Any,
      id: typings.bull.mod.JobId,
      name: String,
      opts: JobOptions,
      progress: Double,
      returnvalue: js.Any,
      timestamp: Double
    ): AttemptsMade[T] = {
      val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], finishedOn = null, processedOn = null, stacktrace = null)
      __obj.asInstanceOf[AttemptsMade[T]]
    }
    
    extension [Self <: AttemptsMade[?], T](x: Self & AttemptsMade[T]) {
      
      inline def setAttemptsMade(value: Double): Self = StObject.set(x, "attemptsMade", value.asInstanceOf[js.Any])
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setFailedReason(value: js.Any): Self = StObject.set(x, "failedReason", value.asInstanceOf[js.Any])
      
      inline def setFinishedOn(value: Double): Self = StObject.set(x, "finishedOn", value.asInstanceOf[js.Any])
      
      inline def setFinishedOnNull: Self = StObject.set(x, "finishedOn", null)
      
      inline def setId(value: typings.bull.mod.JobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: JobOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setProcessedOn(value: Double): Self = StObject.set(x, "processedOn", value.asInstanceOf[js.Any])
      
      inline def setProcessedOnNull: Self = StObject.set(x, "processedOn", null)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setReturnvalue(value: js.Any): Self = StObject.set(x, "returnvalue", value.asInstanceOf[js.Any])
      
      inline def setStacktrace(value: js.Array[String]): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceNull: Self = StObject.set(x, "stacktrace", null)
      
      inline def setStacktraceVarargs(value: String*): Self = StObject.set(x, "stacktrace", js.Array(value :_*))
      
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
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[String]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsVarargs(value: String*): Self = StObject.set(x, "logs", js.Array(value :_*))
    }
  }
  
  trait Data[T] extends StObject {
    
    var data: T
    
    var name: js.UndefOr[String] = js.undefined
    
    var opts: js.UndefOr[JobOptions] = js.undefined
  }
  object Data {
    
    inline def apply[T](data: T): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    extension [Self <: Data[?], T](x: Self & Data[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpts(value: JobOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
  
  trait JobId extends StObject {
    
    var jobId: js.UndefOr[typings.bull.mod.JobId] = js.undefined
  }
  object JobId {
    
    inline def apply(): JobId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobId]
    }
    
    extension [Self <: JobId](x: Self) {
      
      inline def setJobId(value: typings.bull.mod.JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
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
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
