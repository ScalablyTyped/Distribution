package typings.babylonjs

import typings.babylonjs.anon.TypeofsetTimeout
import typings.babylonjs.sceneMod.IDisposable
import typings.std.ReturnType
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscWorkerPoolMod {
  
  @JSImport("babylonjs/Misc/workerPool", "AutoReleaseWorkerPool")
  @js.native
  open class AutoReleaseWorkerPool protected () extends WorkerPool {
    def this(maxWorkers: Double, createWorkerAsync: js.Function0[js.Promise[Worker]]) = this()
    def this(
      maxWorkers: Double,
      createWorkerAsync: js.Function0[js.Promise[Worker]],
      options: AutoReleaseWorkerPoolOptions
    ) = this()
    
    /* private */ val _createWorkerAsync: Any = js.native
    
    /* private */ val _maxWorkers: Any = js.native
    
    /* private */ val _options: Any = js.native
  }
  /* static members */
  object AutoReleaseWorkerPool {
    
    @JSImport("babylonjs/Misc/workerPool", "AutoReleaseWorkerPool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default options for the constructor.
      * Override to change the defaults.
      */
    @JSImport("babylonjs/Misc/workerPool", "AutoReleaseWorkerPool.DefaultOptions")
    @js.native
    def DefaultOptions: AutoReleaseWorkerPoolOptions = js.native
    inline def DefaultOptions_=(x: AutoReleaseWorkerPoolOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/workerPool", "WorkerPool")
  @js.native
  open class WorkerPool protected ()
    extends StObject
       with IDisposable {
    /**
      * Constructor
      * @param workers Array of workers to use for actions
      */
    def this(workers: js.Array[Worker]) = this()
    
    /* protected */ def _execute(
      workerInfo: WorkerInfo,
      action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]
    ): Unit = js.native
    
    /* protected */ def _executeOnIdleWorker(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Boolean = js.native
    
    /* protected */ var _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]] = js.native
    
    /* protected */ var _workerInfos: js.Array[WorkerInfo] = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Pushes an action to the worker pool. If all the workers are active, the action will be
      * pended until a worker has completed its action.
      * @param action The action to perform. Call onComplete when the action is complete.
      */
    def push(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Unit = js.native
  }
  
  trait AutoReleaseWorkerPoolOptions extends StObject {
    
    /**
      * Idle time elapsed before workers are terminated.
      */
    var idleTimeElapsedBeforeRelease: Double
  }
  object AutoReleaseWorkerPoolOptions {
    
    inline def apply(idleTimeElapsedBeforeRelease: Double): AutoReleaseWorkerPoolOptions = {
      val __obj = js.Dynamic.literal(idleTimeElapsedBeforeRelease = idleTimeElapsedBeforeRelease.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoReleaseWorkerPoolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoReleaseWorkerPoolOptions] (val x: Self) extends AnyVal {
      
      inline def setIdleTimeElapsedBeforeRelease(value: Double): Self = StObject.set(x, "idleTimeElapsedBeforeRelease", value.asInstanceOf[js.Any])
    }
  }
  
  /** @ignore */
  trait WorkerInfo extends StObject {
    
    var idle: Boolean
    
    var timeoutId: js.UndefOr[ReturnType[TypeofsetTimeout]] = js.undefined
    
    var workerPromise: js.Promise[Worker]
  }
  object WorkerInfo {
    
    inline def apply(idle: Boolean, workerPromise: js.Promise[Worker]): WorkerInfo = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], workerPromise = workerPromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkerInfo] (val x: Self) extends AnyVal {
      
      inline def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setTimeoutId(value: ReturnType[TypeofsetTimeout]): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
      
      inline def setTimeoutIdUndefined: Self = StObject.set(x, "timeoutId", js.undefined)
      
      inline def setWorkerPromise(value: js.Promise[Worker]): Self = StObject.set(x, "workerPromise", value.asInstanceOf[js.Any])
    }
  }
}
