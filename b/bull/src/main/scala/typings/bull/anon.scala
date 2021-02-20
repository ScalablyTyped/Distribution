package typings.bull

import typings.bull.mod.JobOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AttemptsMade[T] extends StObject {
    
    var attemptsMade: Double = js.native
    
    var data: T = js.native
    
    var delay: Double = js.native
    
    var failedReason: js.Any = js.native
    
    var finishedOn: Double | Null = js.native
    
    var id: typings.bull.mod.JobId = js.native
    
    var name: String = js.native
    
    var opts: JobOptions = js.native
    
    var processedOn: Double | Null = js.native
    
    var progress: Double = js.native
    
    var returnvalue: js.Any = js.native
    
    var stacktrace: js.Array[String] | Null = js.native
    
    var timestamp: Double = js.native
  }
  object AttemptsMade {
    
    @scala.inline
    def apply[T](
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
      val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttemptsMade[T]]
    }
    
    @scala.inline
    implicit class AttemptsMadeMutableBuilder[Self <: AttemptsMade[_], T] (val x: Self with AttemptsMade[T]) extends AnyVal {
      
      @scala.inline
      def setAttemptsMade(value: Double): Self = StObject.set(x, "attemptsMade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedReason(value: js.Any): Self = StObject.set(x, "failedReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishedOn(value: Double): Self = StObject.set(x, "finishedOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinishedOnNull: Self = StObject.set(x, "finishedOn", null)
      
      @scala.inline
      def setId(value: typings.bull.mod.JobId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: JobOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessedOn(value: Double): Self = StObject.set(x, "processedOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessedOnNull: Self = StObject.set(x, "processedOn", null)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnvalue(value: js.Any): Self = StObject.set(x, "returnvalue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStacktrace(value: js.Array[String]): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStacktraceNull: Self = StObject.set(x, "stacktrace", null)
      
      @scala.inline
      def setStacktraceVarargs(value: String*): Self = StObject.set(x, "stacktrace", js.Array(value :_*))
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var logs: js.Array[String] = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, logs: js.Array[String]): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogs(value: js.Array[String]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsVarargs(value: String*): Self = StObject.set(x, "logs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Data[T] extends StObject {
    
    var data: T = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var opts: js.UndefOr[JobOptions] = js.native
  }
  object Data {
    
    @scala.inline
    def apply[T](data: T): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpts(value: JobOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    }
  }
  
  @js.native
  trait JobId extends StObject {
    
    var jobId: js.UndefOr[typings.bull.mod.JobId] = js.native
  }
  object JobId {
    
    @scala.inline
    def apply(): JobId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobId]
    }
    
    @scala.inline
    implicit class JobIdMutableBuilder[Self <: JobId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJobId(value: typings.bull.mod.JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
