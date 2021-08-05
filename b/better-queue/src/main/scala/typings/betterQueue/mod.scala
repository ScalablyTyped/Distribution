package typings.betterQueue

import org.scalablytyped.runtime.StringDictionary
import typings.betterQueue.betterQueueStrings.task_failed
import typings.betterQueue.betterQueueStrings.task_finish
import typings.betterQueue.betterQueueStrings.task_progress
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("better-queue", JSImport.Namespace)
  @js.native
  class ^[T, K] protected () extends BetterQueue[T, K] {
    def this(options: QueueOptions[T, K]) = this()
    def this(process: ProcessFunction[T, K]) = this()
    def this(process: ProcessFunction[T, K], options: Partial[QueueOptions[T, K]]) = this()
  }
  
  @JSImport("better-queue", "Ticket")
  @js.native
  class Ticket () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def on(event: TicketEvent, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  }
  
  @js.native
  trait BetterQueue[T, K] extends EventEmitter {
    
    def cancel(taskId: js.Any): Unit = js.native
    def cancel(taskId: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def destroy(cb: js.Function0[Unit]): Unit = js.native
    
    def getStats(): QueueStats = js.native
    
    def on(event: QueueEvent, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_taskfailed(event: task_failed, listener: js.Function2[/* taskId */ js.Any, /* errorMessage */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_taskfinish(event: task_finish, listener: js.Function2[/* taskId */ js.Any, /* result */ K, Unit]): this.type = js.native
    @JSName("on")
    def on_taskprogress(
      event: task_progress,
      listener: js.Function3[/* taskId */ js.Any, /* completed */ Double, /* total */ Double, Unit]
    ): this.type = js.native
    
    def pause(): Unit = js.native
    
    def push(task: T): Ticket = js.native
    def push(task: T, cb: js.Function2[/* err */ js.Any, /* result */ K, Unit]): Ticket = js.native
    
    def resetStats(): Unit = js.native
    
    def resume(): Unit = js.native
    
    def use(store: Store[T]): Unit = js.native
  }
  
  // TODO reflect task types somehow (task: T | T[])
  type ProcessFunction[T, K] = js.Function2[/* task */ js.Any, /* cb */ ProcessFunctionCb[K], Unit]
  
  type ProcessFunctionCb[K] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[K], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.betterQueue.betterQueueStrings.task_queued
    - typings.betterQueue.betterQueueStrings.task_accepted
    - typings.betterQueue.betterQueueStrings.task_started
    - typings.betterQueue.betterQueueStrings.task_finish
    - typings.betterQueue.betterQueueStrings.task_failed
    - typings.betterQueue.betterQueueStrings.task_progress
    - typings.betterQueue.betterQueueStrings.batch_finish
    - typings.betterQueue.betterQueueStrings.batch_failed
    - typings.betterQueue.betterQueueStrings.batch_progress
    - typings.betterQueue.betterQueueStrings.drain
    - typings.betterQueue.betterQueueStrings.empty
    - typings.betterQueue.betterQueueStrings.error
  */
  trait QueueEvent extends StObject
  object QueueEvent {
    
    inline def batch_failed: typings.betterQueue.betterQueueStrings.batch_failed = "batch_failed".asInstanceOf[typings.betterQueue.betterQueueStrings.batch_failed]
    
    inline def batch_finish: typings.betterQueue.betterQueueStrings.batch_finish = "batch_finish".asInstanceOf[typings.betterQueue.betterQueueStrings.batch_finish]
    
    inline def batch_progress: typings.betterQueue.betterQueueStrings.batch_progress = "batch_progress".asInstanceOf[typings.betterQueue.betterQueueStrings.batch_progress]
    
    inline def drain: typings.betterQueue.betterQueueStrings.drain = "drain".asInstanceOf[typings.betterQueue.betterQueueStrings.drain]
    
    inline def empty: typings.betterQueue.betterQueueStrings.empty = "empty".asInstanceOf[typings.betterQueue.betterQueueStrings.empty]
    
    inline def error: typings.betterQueue.betterQueueStrings.error = "error".asInstanceOf[typings.betterQueue.betterQueueStrings.error]
    
    inline def task_accepted: typings.betterQueue.betterQueueStrings.task_accepted = "task_accepted".asInstanceOf[typings.betterQueue.betterQueueStrings.task_accepted]
    
    inline def task_failed: typings.betterQueue.betterQueueStrings.task_failed = "task_failed".asInstanceOf[typings.betterQueue.betterQueueStrings.task_failed]
    
    inline def task_finish: typings.betterQueue.betterQueueStrings.task_finish = "task_finish".asInstanceOf[typings.betterQueue.betterQueueStrings.task_finish]
    
    inline def task_progress: typings.betterQueue.betterQueueStrings.task_progress = "task_progress".asInstanceOf[typings.betterQueue.betterQueueStrings.task_progress]
    
    inline def task_queued: typings.betterQueue.betterQueueStrings.task_queued = "task_queued".asInstanceOf[typings.betterQueue.betterQueueStrings.task_queued]
    
    inline def task_started: typings.betterQueue.betterQueueStrings.task_started = "task_started".asInstanceOf[typings.betterQueue.betterQueueStrings.task_started]
  }
  
  trait QueueOptions[T, K] extends StObject {
    
    var afterProcessDelay: js.UndefOr[Double] = js.undefined
    
    var autoResume: js.UndefOr[Boolean] = js.undefined
    
    var batchDelay: js.UndefOr[Double] = js.undefined
    
    var batchDelayTimeout: js.UndefOr[Double] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var cancelIfRunning: js.UndefOr[Boolean] = js.undefined
    
    var concurrent: js.UndefOr[Double] = js.undefined
    
    var failTaskOnProcessException: js.UndefOr[Boolean] = js.undefined
    
    var filo: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[
        js.Function2[/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* task */ T, Unit], Unit]
      ] = js.undefined
    
    var id: js.UndefOr[
        (/* keyof T */ String) | (js.Function2[
          /* task */ T, 
          /* cb */ js.Function2[/* error */ js.Any, /* keyof T */ /* id */ String, Unit], 
          Unit
        ])
      ] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var maxTimeout: js.UndefOr[Double] = js.undefined
    
    var merge: js.UndefOr[
        js.Function3[
          /* oldTask */ T, 
          /* newTask */ T, 
          /* cb */ js.Function2[/* error */ js.Any, /* mergedTask */ T, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var precondition: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* error */ js.Any, /* passOrFail */ Boolean, Unit], Unit]
      ] = js.undefined
    
    var preconditionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var priority: js.UndefOr[
        js.Function2[
          /* task */ T, 
          /* cb */ js.Function2[/* error */ js.Any, /* priority */ Double, Unit], 
          Unit
        ]
      ] = js.undefined
    
    def process(task: js.Any, cb: ProcessFunctionCb[K]): Unit
    @JSName("process")
    var process_Original: ProcessFunction[T, K]
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var store: js.UndefOr[String | StoreOptions | Store[T]] = js.undefined
    
    var storeMaxRetries: js.UndefOr[Double] = js.undefined
    
    var storeRetryTimeout: js.UndefOr[Double] = js.undefined
  }
  object QueueOptions {
    
    inline def apply[T, K](process: (/* task */ js.Any, /* cb */ ProcessFunctionCb[K]) => Unit): QueueOptions[T, K] = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
      __obj.asInstanceOf[QueueOptions[T, K]]
    }
    
    extension [Self <: QueueOptions[?, ?], T, K](x: Self & (QueueOptions[T, K])) {
      
      inline def setAfterProcessDelay(value: Double): Self = StObject.set(x, "afterProcessDelay", value.asInstanceOf[js.Any])
      
      inline def setAfterProcessDelayUndefined: Self = StObject.set(x, "afterProcessDelay", js.undefined)
      
      inline def setAutoResume(value: Boolean): Self = StObject.set(x, "autoResume", value.asInstanceOf[js.Any])
      
      inline def setAutoResumeUndefined: Self = StObject.set(x, "autoResume", js.undefined)
      
      inline def setBatchDelay(value: Double): Self = StObject.set(x, "batchDelay", value.asInstanceOf[js.Any])
      
      inline def setBatchDelayTimeout(value: Double): Self = StObject.set(x, "batchDelayTimeout", value.asInstanceOf[js.Any])
      
      inline def setBatchDelayTimeoutUndefined: Self = StObject.set(x, "batchDelayTimeout", js.undefined)
      
      inline def setBatchDelayUndefined: Self = StObject.set(x, "batchDelay", js.undefined)
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setCancelIfRunning(value: Boolean): Self = StObject.set(x, "cancelIfRunning", value.asInstanceOf[js.Any])
      
      inline def setCancelIfRunningUndefined: Self = StObject.set(x, "cancelIfRunning", js.undefined)
      
      inline def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      inline def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      inline def setFailTaskOnProcessException(value: Boolean): Self = StObject.set(x, "failTaskOnProcessException", value.asInstanceOf[js.Any])
      
      inline def setFailTaskOnProcessExceptionUndefined: Self = StObject.set(x, "failTaskOnProcessException", js.undefined)
      
      inline def setFilo(value: Boolean): Self = StObject.set(x, "filo", value.asInstanceOf[js.Any])
      
      inline def setFiloUndefined: Self = StObject.set(x, "filo", js.undefined)
      
      inline def setFilter(value: (/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setId(
        value: (/* keyof T */ String) | (js.Function2[
              /* task */ T, 
              /* cb */ js.Function2[/* error */ js.Any, /* keyof T */ /* id */ String, Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction2(
        value: (/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* keyof T */ /* id */ String, Unit]) => Unit
      ): Self = StObject.set(x, "id", js.Any.fromFunction2(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      inline def setMerge(
        value: (/* oldTask */ T, /* newTask */ T, /* cb */ js.Function2[/* error */ js.Any, /* mergedTask */ T, Unit]) => Unit
      ): Self = StObject.set(x, "merge", js.Any.fromFunction3(value))
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setPrecondition(value: /* cb */ js.Function2[/* error */ js.Any, /* passOrFail */ Boolean, Unit] => Unit): Self = StObject.set(x, "precondition", js.Any.fromFunction1(value))
      
      inline def setPreconditionRetryTimeout(value: Double): Self = StObject.set(x, "preconditionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setPreconditionRetryTimeoutUndefined: Self = StObject.set(x, "preconditionRetryTimeout", js.undefined)
      
      inline def setPreconditionUndefined: Self = StObject.set(x, "precondition", js.undefined)
      
      inline def setPriority(
        value: (/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* priority */ Double, Unit]) => Unit
      ): Self = StObject.set(x, "priority", js.Any.fromFunction2(value))
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setProcess(value: (/* task */ js.Any, /* cb */ ProcessFunctionCb[K]) => Unit): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setStore(value: String | StoreOptions | Store[T]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreMaxRetries(value: Double): Self = StObject.set(x, "storeMaxRetries", value.asInstanceOf[js.Any])
      
      inline def setStoreMaxRetriesUndefined: Self = StObject.set(x, "storeMaxRetries", js.undefined)
      
      inline def setStoreRetryTimeout(value: Double): Self = StObject.set(x, "storeRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setStoreRetryTimeoutUndefined: Self = StObject.set(x, "storeRetryTimeout", js.undefined)
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait QueueStats extends StObject {
    
    var average: Double
    
    var peak: Double
    
    var successRate: Double
    
    var total: Double
  }
  object QueueStats {
    
    inline def apply(average: Double, peak: Double, successRate: Double, total: Double): QueueStats = {
      val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any], successRate = successRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueStats]
    }
    
    extension [Self <: QueueStats](x: Self) {
      
      inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      inline def setPeak(value: Double): Self = StObject.set(x, "peak", value.asInstanceOf[js.Any])
      
      inline def setSuccessRate(value: Double): Self = StObject.set(x, "successRate", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store[T] extends StObject {
    
    def connect(cb: js.Function2[/* error */ js.Any, /* length */ Double, Unit]): Unit
    
    def deleteTask(taskId: js.Any, cb: js.Function0[Unit]): Unit
    
    def getLock(lockId: String, cb: js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]): Unit
    
    def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, Unit]): Unit
    
    def putTask(taskId: js.Any, task: T, priority: Double, cb: js.Function1[/* error */ js.Any, Unit]): Unit
    
    def releaseLock(lockId: String, cb: js.Function1[/* error */ js.Any, Unit]): Unit
    
    def takeFirstN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit
    
    def takeLastN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit
  }
  object Store {
    
    inline def apply[T](
      connect: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit,
      deleteTask: (js.Any, js.Function0[Unit]) => Unit,
      getLock: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit,
      getTask: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit,
      putTask: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit,
      releaseLock: (String, js.Function1[/* error */ js.Any, Unit]) => Unit,
      takeFirstN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit,
      takeLastN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit
    ): Store[T] = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), deleteTask = js.Any.fromFunction2(deleteTask), getLock = js.Any.fromFunction2(getLock), getTask = js.Any.fromFunction2(getTask), putTask = js.Any.fromFunction4(putTask), releaseLock = js.Any.fromFunction2(releaseLock), takeFirstN = js.Any.fromFunction2(takeFirstN), takeLastN = js.Any.fromFunction2(takeLastN))
      __obj.asInstanceOf[Store[T]]
    }
    
    extension [Self <: Store[?], T](x: Self & Store[T]) {
      
      inline def setConnect(value: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setDeleteTask(value: (js.Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "deleteTask", js.Any.fromFunction2(value))
      
      inline def setGetLock(value: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit): Self = StObject.set(x, "getLock", js.Any.fromFunction2(value))
      
      inline def setGetTask(value: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit): Self = StObject.set(x, "getTask", js.Any.fromFunction2(value))
      
      inline def setPutTask(value: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = StObject.set(x, "putTask", js.Any.fromFunction4(value))
      
      inline def setReleaseLock(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction2(value))
      
      inline def setTakeFirstN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self = StObject.set(x, "takeFirstN", js.Any.fromFunction2(value))
      
      inline def setTakeLastN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self = StObject.set(x, "takeLastN", js.Any.fromFunction2(value))
    }
  }
  
  trait StoreOptions
    extends StObject
       with // store-specific options
  /* key */ StringDictionary[js.Any] {
    
    var `type`: String
  }
  object StoreOptions {
    
    inline def apply(`type`: String): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreOptions]
    }
    
    extension [Self <: StoreOptions](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TickerProgress extends StObject {
    
    var complete: Double
    
    var eta: String
    
    var message: String
    
    var pct: Double
    
    var total: Double
  }
  object TickerProgress {
    
    inline def apply(complete: Double, eta: String, message: String, pct: Double, total: Double): TickerProgress = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TickerProgress]
    }
    
    extension [Self <: TickerProgress](x: Self) {
      
      inline def setComplete(value: Double): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.betterQueue.betterQueueStrings.accept
    - typings.betterQueue.betterQueueStrings.queued
    - typings.betterQueue.betterQueueStrings.started
    - typings.betterQueue.betterQueueStrings.progress
    - typings.betterQueue.betterQueueStrings.finish
    - typings.betterQueue.betterQueueStrings.failed
    - typings.betterQueue.betterQueueStrings.error
  */
  trait TicketEvent extends StObject
  object TicketEvent {
    
    inline def accept: typings.betterQueue.betterQueueStrings.accept = "accept".asInstanceOf[typings.betterQueue.betterQueueStrings.accept]
    
    inline def error: typings.betterQueue.betterQueueStrings.error = "error".asInstanceOf[typings.betterQueue.betterQueueStrings.error]
    
    inline def failed: typings.betterQueue.betterQueueStrings.failed = "failed".asInstanceOf[typings.betterQueue.betterQueueStrings.failed]
    
    inline def finish: typings.betterQueue.betterQueueStrings.finish = "finish".asInstanceOf[typings.betterQueue.betterQueueStrings.finish]
    
    inline def progress: typings.betterQueue.betterQueueStrings.progress = "progress".asInstanceOf[typings.betterQueue.betterQueueStrings.progress]
    
    inline def queued: typings.betterQueue.betterQueueStrings.queued = "queued".asInstanceOf[typings.betterQueue.betterQueueStrings.queued]
    
    inline def started: typings.betterQueue.betterQueueStrings.started = "started".asInstanceOf[typings.betterQueue.betterQueueStrings.started]
  }
}
