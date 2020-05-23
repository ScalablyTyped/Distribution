package typings.babylonjs.BABYLON

import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPool extends IDisposable {
  var _execute: js.Any
  var _pendingActions: js.Any
  var _workerInfos: js.Any
  /**
    * Pushes an action to the worker pool. If all the workers are active, the action will be
    * pended until a worker has completed its action.
    * @param action The action to perform. Call onComplete when the action is complete.
    */
  def push(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Unit
}

object WorkerPool {
  @scala.inline
  def apply(
    _execute: js.Any,
    _pendingActions: js.Any,
    _workerInfos: js.Any,
    dispose: () => Unit,
    push: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Unit
  ): WorkerPool = {
    val __obj = js.Dynamic.literal(_execute = _execute.asInstanceOf[js.Any], _pendingActions = _pendingActions.asInstanceOf[js.Any], _workerInfos = _workerInfos.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[WorkerPool]
  }
}

