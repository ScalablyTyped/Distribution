package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.AutoReleaseWorkerPoolOptions
import typings.babylonjs.BABYLON.WorkerInfo
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AutoReleaseWorkerPool")
@js.native
open class AutoReleaseWorkerPool protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AutoReleaseWorkerPool {
  def this(maxWorkers: Double, createWorkerAsync: js.Function0[js.Promise[Worker]]) = this()
  def this(
    maxWorkers: Double,
    createWorkerAsync: js.Function0[js.Promise[Worker]],
    options: AutoReleaseWorkerPoolOptions
  ) = this()
  
  /* private */ /* CompleteClass */
  override val _createWorkerAsync: Any = js.native
  
  /* protected */ /* CompleteClass */
  override def _execute(
    workerInfo: WorkerInfo,
    action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]
  ): Unit = js.native
  
  /* protected */ /* CompleteClass */
  override def _executeOnIdleWorker(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Boolean = js.native
  
  /* private */ /* CompleteClass */
  override val _maxWorkers: Any = js.native
  
  /* private */ /* CompleteClass */
  override val _options: Any = js.native
  
  /* protected */ /* CompleteClass */
  var _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]] = js.native
  
  /* protected */ /* CompleteClass */
  var _workerInfos: js.Array[WorkerInfo] = js.native
  
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
  /* CompleteClass */
  override def push(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Unit = js.native
}
/* static members */
object AutoReleaseWorkerPool {
  
  @JSGlobal("BABYLON.AutoReleaseWorkerPool")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default options for the constructor.
    * Override to change the defaults.
    */
  @JSGlobal("BABYLON.AutoReleaseWorkerPool.DefaultOptions")
  @js.native
  def DefaultOptions: AutoReleaseWorkerPoolOptions = js.native
  inline def DefaultOptions_=(x: AutoReleaseWorkerPoolOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultOptions")(x.asInstanceOf[js.Any])
}
