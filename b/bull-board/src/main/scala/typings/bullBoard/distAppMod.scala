package typings.bullBoard

import typings.bullBoard.anon.Delay
import typings.bullBoard.anon.RecordStatusnumber
import typings.bullBoard.distQueueAdaptersBaseMod.BaseAdapter
import typings.bullBoard.distUiComponentsConstantsMod.Status
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppMod {
  
  trait AppJob extends StObject {
    
    var attempts: Double
    
    var data: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['data'] */ js.Any
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var failedReason: String
    
    var finishedOn: js.UndefOr[Double | Null] = js.undefined
    
    var id: js.UndefOr[String | Double | Null] = js.undefined
    
    var name: String
    
    var opts: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['opts'] */ js.Any
    
    var processedOn: js.UndefOr[Double | Null] = js.undefined
    
    var progress: Double | js.Object
    
    var returnValue: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['returnvalue'] */ js.Any
    
    var stacktrace: js.Array[String]
    
    var timestamp: Double
  }
  object AppJob {
    
    inline def apply(
      attempts: Double,
      data: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['data'] */ js.Any,
      failedReason: String,
      name: String,
      opts: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['opts'] */ js.Any,
      progress: Double | js.Object,
      returnValue: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['returnvalue'] */ js.Any,
      stacktrace: js.Array[String],
      timestamp: Double
    ): AppJob = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], stacktrace = stacktrace.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppJob]
    }
    
    extension [Self <: AppJob](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['data'] */ js.Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFailedReason(value: String): Self = StObject.set(x, "failedReason", value.asInstanceOf[js.Any])
      
      inline def setFinishedOn(value: Double): Self = StObject.set(x, "finishedOn", value.asInstanceOf[js.Any])
      
      inline def setFinishedOnNull: Self = StObject.set(x, "finishedOn", null)
      
      inline def setFinishedOnUndefined: Self = StObject.set(x, "finishedOn", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpts(
        value: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['opts'] */ js.Any
      ): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setProcessedOn(value: Double): Self = StObject.set(x, "processedOn", value.asInstanceOf[js.Any])
      
      inline def setProcessedOnNull: Self = StObject.set(x, "processedOn", null)
      
      inline def setProcessedOnUndefined: Self = StObject.set(x, "processedOn", js.undefined)
      
      inline def setProgress(value: Double | js.Object): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setReturnValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: bull-board.bull-board/dist/app.QueueJobJson['returnvalue'] */ js.Any
      ): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setStacktrace(value: js.Array[String]): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceVarargs(value: String*): Self = StObject.set(x, "stacktrace", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppQueue extends StObject {
    
    var counts: RecordStatusnumber
    
    var jobs: js.Array[AppJob]
    
    var name: String
    
    var readOnlyMode: Boolean
  }
  object AppQueue {
    
    inline def apply(counts: RecordStatusnumber, jobs: js.Array[AppJob], name: String, readOnlyMode: Boolean): AppQueue = {
      val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnlyMode = readOnlyMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppQueue]
    }
    
    extension [Self <: AppQueue](x: Self) {
      
      inline def setCounts(value: RecordStatusnumber): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
      
      inline def setJobs(value: js.Array[AppJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setJobsVarargs(value: AppJob*): Self = StObject.set(x, "jobs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyMode(value: Boolean): Self = StObject.set(x, "readOnlyMode", value.asInstanceOf[js.Any])
    }
  }
  
  type BullBoardQueues = Map[String, BaseAdapter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bullBoard.bullBoardStrings.completed
    - typings.bullBoard.bullBoardStrings.wait
    - typings.bullBoard.bullBoardStrings.active
    - typings.bullBoard.bullBoardStrings.delayed
    - typings.bullBoard.bullBoardStrings.failed
  */
  trait JobCleanStatus extends StObject
  object JobCleanStatus {
    
    inline def active: typings.bullBoard.bullBoardStrings.active = "active".asInstanceOf[typings.bullBoard.bullBoardStrings.active]
    
    inline def completed: typings.bullBoard.bullBoardStrings.completed = "completed".asInstanceOf[typings.bullBoard.bullBoardStrings.completed]
    
    inline def delayed: typings.bullBoard.bullBoardStrings.delayed = "delayed".asInstanceOf[typings.bullBoard.bullBoardStrings.delayed]
    
    inline def failed: typings.bullBoard.bullBoardStrings.failed = "failed".asInstanceOf[typings.bullBoard.bullBoardStrings.failed]
  }
  
  /* Inlined std.Record<bull-board.bull-board/dist/app.JobStatus, number> */
  trait JobCounts extends StObject {
    
    var active: Double
    
    var completed: Double
    
    var delayed: Double
    
    var failed: Double
    
    var latest: Double
    
    var paused: Double
    
    var waiting: Double
  }
  object JobCounts {
    
    inline def apply(
      active: Double,
      completed: Double,
      delayed: Double,
      failed: Double,
      latest: Double,
      paused: Double,
      waiting: Double
    ): JobCounts = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], delayed = delayed.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobCounts]
    }
    
    extension [Self <: JobCounts](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setDelayed(value: Double): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setLatest(value: Double): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setPaused(value: Double): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: Double): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    }
  }
  
  type JobStatus = Status
  
  trait QueueActions extends StObject {
    
    def cleanAllCompleted(queueName: String): js.Function0[js.Promise[Unit]]
    
    def cleanAllDelayed(queueName: String): js.Function0[js.Promise[Unit]]
    
    def cleanAllFailed(queueName: String): js.Function0[js.Promise[Unit]]
    
    def cleanJob(queueName: String): js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]
    
    def getJobLogs(queueName: String): js.Function1[/* job */ AppJob, js.Function0[js.Promise[js.Array[String]]]]
    
    def promoteJob(queueName: String): js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]
    
    def retryAll(queueName: String): js.Function0[js.Promise[Unit]]
    
    def retryJob(queueName: String): js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]
  }
  object QueueActions {
    
    inline def apply(
      cleanAllCompleted: String => js.Function0[js.Promise[Unit]],
      cleanAllDelayed: String => js.Function0[js.Promise[Unit]],
      cleanAllFailed: String => js.Function0[js.Promise[Unit]],
      cleanJob: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]],
      getJobLogs: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[js.Array[String]]]],
      promoteJob: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]],
      retryAll: String => js.Function0[js.Promise[Unit]],
      retryJob: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]
    ): QueueActions = {
      val __obj = js.Dynamic.literal(cleanAllCompleted = js.Any.fromFunction1(cleanAllCompleted), cleanAllDelayed = js.Any.fromFunction1(cleanAllDelayed), cleanAllFailed = js.Any.fromFunction1(cleanAllFailed), cleanJob = js.Any.fromFunction1(cleanJob), getJobLogs = js.Any.fromFunction1(getJobLogs), promoteJob = js.Any.fromFunction1(promoteJob), retryAll = js.Any.fromFunction1(retryAll), retryJob = js.Any.fromFunction1(retryJob))
      __obj.asInstanceOf[QueueActions]
    }
    
    extension [Self <: QueueActions](x: Self) {
      
      inline def setCleanAllCompleted(value: String => js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "cleanAllCompleted", js.Any.fromFunction1(value))
      
      inline def setCleanAllDelayed(value: String => js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "cleanAllDelayed", js.Any.fromFunction1(value))
      
      inline def setCleanAllFailed(value: String => js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "cleanAllFailed", js.Any.fromFunction1(value))
      
      inline def setCleanJob(value: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]): Self = StObject.set(x, "cleanJob", js.Any.fromFunction1(value))
      
      inline def setGetJobLogs(value: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[js.Array[String]]]]): Self = StObject.set(x, "getJobLogs", js.Any.fromFunction1(value))
      
      inline def setPromoteJob(value: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]): Self = StObject.set(x, "promoteJob", js.Any.fromFunction1(value))
      
      inline def setRetryAll(value: String => js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "retryAll", js.Any.fromFunction1(value))
      
      inline def setRetryJob(value: String => js.Function1[/* job */ AppJob, js.Function0[js.Promise[Unit]]]): Self = StObject.set(x, "retryJob", js.Any.fromFunction1(value))
    }
  }
  
  trait QueueAdapterOptions extends StObject {
    
    var readOnlyMode: Boolean
  }
  object QueueAdapterOptions {
    
    inline def apply(readOnlyMode: Boolean): QueueAdapterOptions = {
      val __obj = js.Dynamic.literal(readOnlyMode = readOnlyMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueAdapterOptions]
    }
    
    extension [Self <: QueueAdapterOptions](x: Self) {
      
      inline def setReadOnlyMode(value: Boolean): Self = StObject.set(x, "readOnlyMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueJob extends StObject {
    
    var opts: Delay
    
    def promote(): js.Promise[Unit]
    
    def remove(): js.Promise[Unit]
    
    def retry(): js.Promise[Unit]
    
    def toJSON(): QueueJobJson
  }
  object QueueJob {
    
    inline def apply(
      opts: Delay,
      promote: () => js.Promise[Unit],
      remove: () => js.Promise[Unit],
      retry: () => js.Promise[Unit],
      toJSON: () => QueueJobJson
    ): QueueJob = {
      val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], promote = js.Any.fromFunction0(promote), remove = js.Any.fromFunction0(remove), retry = js.Any.fromFunction0(retry), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[QueueJob]
    }
    
    extension [Self <: QueueJob](x: Self) {
      
      inline def setOpts(value: Delay): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setPromote(value: () => js.Promise[Unit]): Self = StObject.set(x, "promote", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRetry(value: () => js.Promise[Unit]): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
      
      inline def setToJSON(value: () => QueueJobJson): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait QueueJobJson extends StObject {
    
    var attemptsMade: Double
    
    var data: Any
    
    var failedReason: String
    
    var finishedOn: js.UndefOr[Double | Null] = js.undefined
    
    var id: js.UndefOr[String | Double | Null] = js.undefined
    
    var name: String
    
    var opts: Any
    
    var parentKey: js.UndefOr[String] = js.undefined
    
    var processedOn: js.UndefOr[Double | Null] = js.undefined
    
    var progress: Double | js.Object
    
    var returnvalue: Any
    
    var stacktrace: js.Array[String] | Null
    
    var timestamp: Double
  }
  object QueueJobJson {
    
    inline def apply(
      attemptsMade: Double,
      data: Any,
      failedReason: String,
      name: String,
      opts: Any,
      progress: Double | js.Object,
      returnvalue: Any,
      timestamp: Double
    ): QueueJobJson = {
      val __obj = js.Dynamic.literal(attemptsMade = attemptsMade.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], failedReason = failedReason.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], returnvalue = returnvalue.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], stacktrace = null)
      __obj.asInstanceOf[QueueJobJson]
    }
    
    extension [Self <: QueueJobJson](x: Self) {
      
      inline def setAttemptsMade(value: Double): Self = StObject.set(x, "attemptsMade", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFailedReason(value: String): Self = StObject.set(x, "failedReason", value.asInstanceOf[js.Any])
      
      inline def setFinishedOn(value: Double): Self = StObject.set(x, "finishedOn", value.asInstanceOf[js.Any])
      
      inline def setFinishedOnNull: Self = StObject.set(x, "finishedOn", null)
      
      inline def setFinishedOnUndefined: Self = StObject.set(x, "finishedOn", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpts(value: Any): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setParentKey(value: String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
      
      inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
      
      inline def setProcessedOn(value: Double): Self = StObject.set(x, "processedOn", value.asInstanceOf[js.Any])
      
      inline def setProcessedOnNull: Self = StObject.set(x, "processedOn", null)
      
      inline def setProcessedOnUndefined: Self = StObject.set(x, "processedOn", js.undefined)
      
      inline def setProgress(value: Double | js.Object): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setReturnvalue(value: Any): Self = StObject.set(x, "returnvalue", value.asInstanceOf[js.Any])
      
      inline def setStacktrace(value: js.Array[String]): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      inline def setStacktraceNull: Self = StObject.set(x, "stacktrace", null)
      
      inline def setStacktraceVarargs(value: String*): Self = StObject.set(x, "stacktrace", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectedStatuses = Record[String, Status]
  
  trait ValidMetrics extends StObject {
    
    var blocked_clients: String
    
    var connected_clients: String
    
    var mem_fragmentation_ratio: String
    
    var redis_version: String
    
    var total_system_memory: String
    
    var used_memory: String
  }
  object ValidMetrics {
    
    inline def apply(
      blocked_clients: String,
      connected_clients: String,
      mem_fragmentation_ratio: String,
      redis_version: String,
      total_system_memory: String,
      used_memory: String
    ): ValidMetrics = {
      val __obj = js.Dynamic.literal(blocked_clients = blocked_clients.asInstanceOf[js.Any], connected_clients = connected_clients.asInstanceOf[js.Any], mem_fragmentation_ratio = mem_fragmentation_ratio.asInstanceOf[js.Any], redis_version = redis_version.asInstanceOf[js.Any], total_system_memory = total_system_memory.asInstanceOf[js.Any], used_memory = used_memory.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidMetrics]
    }
    
    extension [Self <: ValidMetrics](x: Self) {
      
      inline def setBlocked_clients(value: String): Self = StObject.set(x, "blocked_clients", value.asInstanceOf[js.Any])
      
      inline def setConnected_clients(value: String): Self = StObject.set(x, "connected_clients", value.asInstanceOf[js.Any])
      
      inline def setMem_fragmentation_ratio(value: String): Self = StObject.set(x, "mem_fragmentation_ratio", value.asInstanceOf[js.Any])
      
      inline def setRedis_version(value: String): Self = StObject.set(x, "redis_version", value.asInstanceOf[js.Any])
      
      inline def setTotal_system_memory(value: String): Self = StObject.set(x, "total_system_memory", value.asInstanceOf[js.Any])
      
      inline def setUsed_memory(value: String): Self = StObject.set(x, "used_memory", value.asInstanceOf[js.Any])
    }
  }
}
