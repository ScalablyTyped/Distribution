package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.WorkerInfo
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WorkerPool")
@js.native
open class WorkerPool protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WorkerPool {
  /**
    * Constructor
    * @param workers Array of workers to use for actions
    */
  def this(workers: js.Array[Worker]) = this()
  
  /* protected */ /* CompleteClass */
  override def _execute(
    workerInfo: WorkerInfo,
    action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]
  ): Unit = js.native
  
  /* protected */ /* CompleteClass */
  override def _executeOnIdleWorker(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Boolean = js.native
  
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
