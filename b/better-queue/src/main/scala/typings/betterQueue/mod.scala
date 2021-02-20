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
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def batch_failed: typings.betterQueue.betterQueueStrings.batch_failed = "batch_failed".asInstanceOf[typings.betterQueue.betterQueueStrings.batch_failed]
    
    @scala.inline
    def batch_finish: typings.betterQueue.betterQueueStrings.batch_finish = "batch_finish".asInstanceOf[typings.betterQueue.betterQueueStrings.batch_finish]
    
    @scala.inline
    def batch_progress: typings.betterQueue.betterQueueStrings.batch_progress = "batch_progress".asInstanceOf[typings.betterQueue.betterQueueStrings.batch_progress]
    
    @scala.inline
    def drain: typings.betterQueue.betterQueueStrings.drain = "drain".asInstanceOf[typings.betterQueue.betterQueueStrings.drain]
    
    @scala.inline
    def empty: typings.betterQueue.betterQueueStrings.empty = "empty".asInstanceOf[typings.betterQueue.betterQueueStrings.empty]
    
    @scala.inline
    def error: typings.betterQueue.betterQueueStrings.error = "error".asInstanceOf[typings.betterQueue.betterQueueStrings.error]
    
    @scala.inline
    def task_accepted: typings.betterQueue.betterQueueStrings.task_accepted = "task_accepted".asInstanceOf[typings.betterQueue.betterQueueStrings.task_accepted]
    
    @scala.inline
    def task_failed: typings.betterQueue.betterQueueStrings.task_failed = "task_failed".asInstanceOf[typings.betterQueue.betterQueueStrings.task_failed]
    
    @scala.inline
    def task_finish: typings.betterQueue.betterQueueStrings.task_finish = "task_finish".asInstanceOf[typings.betterQueue.betterQueueStrings.task_finish]
    
    @scala.inline
    def task_progress: typings.betterQueue.betterQueueStrings.task_progress = "task_progress".asInstanceOf[typings.betterQueue.betterQueueStrings.task_progress]
    
    @scala.inline
    def task_queued: typings.betterQueue.betterQueueStrings.task_queued = "task_queued".asInstanceOf[typings.betterQueue.betterQueueStrings.task_queued]
    
    @scala.inline
    def task_started: typings.betterQueue.betterQueueStrings.task_started = "task_started".asInstanceOf[typings.betterQueue.betterQueueStrings.task_started]
  }
  
  @js.native
  trait QueueOptions[T, K] extends StObject {
    
    var afterProcessDelay: js.UndefOr[Double] = js.native
    
    var autoResume: js.UndefOr[Boolean] = js.native
    
    var batchDelay: js.UndefOr[Double] = js.native
    
    var batchDelayTimeout: js.UndefOr[Double] = js.native
    
    var batchSize: js.UndefOr[Double] = js.native
    
    var cancelIfRunning: js.UndefOr[Boolean] = js.native
    
    var concurrent: js.UndefOr[Double] = js.native
    
    var failTaskOnProcessException: js.UndefOr[Boolean] = js.native
    
    var filo: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[
        js.Function2[/* task */ T, /* cb */ js.Function2[/* error */ js.Any, /* task */ T, Unit], Unit]
      ] = js.native
    
    var id: js.UndefOr[
        (/* keyof T */ String) | (js.Function2[
          /* task */ T, 
          /* cb */ js.Function2[/* error */ js.Any, /* keyof T */ /* id */ String, Unit], 
          Unit
        ])
      ] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var maxTimeout: js.UndefOr[Double] = js.native
    
    var merge: js.UndefOr[
        js.Function3[
          /* oldTask */ T, 
          /* newTask */ T, 
          /* cb */ js.Function2[/* error */ js.Any, /* mergedTask */ T, Unit], 
          Unit
        ]
      ] = js.native
    
    var precondition: js.UndefOr[
        js.Function1[/* cb */ js.Function2[/* error */ js.Any, /* passOrFail */ Boolean, Unit], Unit]
      ] = js.native
    
    var preconditionRetryTimeout: js.UndefOr[Double] = js.native
    
    var priority: js.UndefOr[
        js.Function2[
          /* task */ T, 
          /* cb */ js.Function2[/* error */ js.Any, /* priority */ Double, Unit], 
          Unit
        ]
      ] = js.native
    
    def process(task: js.Any, cb: ProcessFunctionCb[K]): Unit = js.native
    @JSName("process")
    var process_Original: ProcessFunction[T, K] = js.native
    
    var retryDelay: js.UndefOr[Double] = js.native
    
    var store: js.UndefOr[String | StoreOptions | Store[T]] = js.native
    
    var storeMaxRetries: js.UndefOr[Double] = js.native
    
    var storeRetryTimeout: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait QueueStats extends StObject {
    
    var average: Double = js.native
    
    var peak: Double = js.native
    
    var successRate: Double = js.native
    
    var total: Double = js.native
  }
  object QueueStats {
    
    @scala.inline
    def apply(average: Double, peak: Double, successRate: Double, total: Double): QueueStats = {
      val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any], successRate = successRate.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueStats]
    }
    
    @scala.inline
    implicit class QueueStatsMutableBuilder[Self <: QueueStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeak(value: Double): Self = StObject.set(x, "peak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessRate(value: Double): Self = StObject.set(x, "successRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Store[T] extends StObject {
    
    def connect(cb: js.Function2[/* error */ js.Any, /* length */ Double, Unit]): Unit = js.native
    
    def deleteTask(taskId: js.Any, cb: js.Function0[Unit]): Unit = js.native
    
    def getLock(lockId: String, cb: js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]): Unit = js.native
    
    def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, Unit]): Unit = js.native
    
    def putTask(taskId: js.Any, task: T, priority: Double, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def releaseLock(lockId: String, cb: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def takeFirstN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit = js.native
    
    def takeLastN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit = js.native
  }
  object Store {
    
    @scala.inline
    def apply[T](
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
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store[_], T] (val x: Self with Store[T]) extends AnyVal {
      
      @scala.inline
      def setConnect(value: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteTask(value: (js.Any, js.Function0[Unit]) => Unit): Self = StObject.set(x, "deleteTask", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetLock(value: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Unit): Self = StObject.set(x, "getLock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetTask(value: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Unit): Self = StObject.set(x, "getTask", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPutTask(value: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = StObject.set(x, "putTask", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReleaseLock(value: (String, js.Function1[/* error */ js.Any, Unit]) => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTakeFirstN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self = StObject.set(x, "takeFirstN", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTakeLastN(value: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Unit): Self = StObject.set(x, "takeLastN", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait StoreOptions
    extends // store-specific options
  /* key */ StringDictionary[js.Any] {
    
    var `type`: String = js.native
  }
  object StoreOptions {
    
    @scala.inline
    def apply(`type`: String): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreOptions]
    }
    
    @scala.inline
    implicit class StoreOptionsMutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TickerProgress extends StObject {
    
    var complete: Double = js.native
    
    var eta: String = js.native
    
    var message: String = js.native
    
    var pct: Double = js.native
    
    var total: Double = js.native
  }
  object TickerProgress {
    
    @scala.inline
    def apply(complete: Double, eta: String, message: String, pct: Double, total: Double): TickerProgress = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[TickerProgress]
    }
    
    @scala.inline
    implicit class TickerProgressMutableBuilder[Self <: TickerProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Double): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def accept: typings.betterQueue.betterQueueStrings.accept = "accept".asInstanceOf[typings.betterQueue.betterQueueStrings.accept]
    
    @scala.inline
    def error: typings.betterQueue.betterQueueStrings.error = "error".asInstanceOf[typings.betterQueue.betterQueueStrings.error]
    
    @scala.inline
    def failed: typings.betterQueue.betterQueueStrings.failed = "failed".asInstanceOf[typings.betterQueue.betterQueueStrings.failed]
    
    @scala.inline
    def finish: typings.betterQueue.betterQueueStrings.finish = "finish".asInstanceOf[typings.betterQueue.betterQueueStrings.finish]
    
    @scala.inline
    def progress: typings.betterQueue.betterQueueStrings.progress = "progress".asInstanceOf[typings.betterQueue.betterQueueStrings.progress]
    
    @scala.inline
    def queued: typings.betterQueue.betterQueueStrings.queued = "queued".asInstanceOf[typings.betterQueue.betterQueueStrings.queued]
    
    @scala.inline
    def started: typings.betterQueue.betterQueueStrings.started = "started".asInstanceOf[typings.betterQueue.betterQueueStrings.started]
  }
}
