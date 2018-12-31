package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class to push actions to a pool of workers.
  */
@JSGlobal("BABYLON.WorkerPool")
@js.native
class WorkerPool protected () extends IDisposable {
  /**
    * Constructor
    * @param workers Array of workers to use for actions
    */
  def this(workers: js.Array[stdLib.Worker]) = this()
  var _execute: js.Any = js.native
  var _pendingActions: js.Any = js.native
  var _workerInfos: js.Any = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Pushes an action to the worker pool. If all the workers are active, the action will be
    * pended until a worker has completed its action.
    * @param action The action to perform. Call onComplete when the action is complete.
    */
  def push(
    action: js.Function2[/* worker */ stdLib.Worker, /* onComplete */ js.Function0[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

