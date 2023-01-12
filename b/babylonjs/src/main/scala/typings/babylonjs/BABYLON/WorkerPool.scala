package typings.babylonjs.BABYLON

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerPool
  extends StObject
     with IDisposable {
  
  /* protected */ def _execute(
    workerInfo: WorkerInfo,
    action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]
  ): Unit
  
  /* protected */ def _executeOnIdleWorker(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Boolean
  
  /* protected */ var _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]]
  
  /* protected */ var _workerInfos: js.Array[WorkerInfo]
  
  /**
    * Pushes an action to the worker pool. If all the workers are active, the action will be
    * pended until a worker has completed its action.
    * @param action The action to perform. Call onComplete when the action is complete.
    */
  def push(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Unit
}
object WorkerPool {
  
  inline def apply(
    _execute: (WorkerInfo, js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => Unit,
    _executeOnIdleWorker: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Boolean,
    _pendingActions: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]],
    _workerInfos: js.Array[WorkerInfo],
    dispose: () => Unit,
    push: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Unit
  ): WorkerPool = {
    val __obj = js.Dynamic.literal(_execute = js.Any.fromFunction2(_execute), _executeOnIdleWorker = js.Any.fromFunction1(_executeOnIdleWorker), _pendingActions = _pendingActions.asInstanceOf[js.Any], _workerInfos = _workerInfos.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[WorkerPool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerPool] (val x: Self) extends AnyVal {
    
    inline def setPush(value: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def set_execute(
      value: (WorkerInfo, js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]) => Unit
    ): Self = StObject.set(x, "_execute", js.Any.fromFunction2(value))
    
    inline def set_executeOnIdleWorker(value: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Boolean): Self = StObject.set(x, "_executeOnIdleWorker", js.Any.fromFunction1(value))
    
    inline def set_pendingActions(value: js.Array[js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]]): Self = StObject.set(x, "_pendingActions", value.asInstanceOf[js.Any])
    
    inline def set_pendingActionsVarargs(value: (js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit])*): Self = StObject.set(x, "_pendingActions", js.Array(value*))
    
    inline def set_workerInfos(value: js.Array[WorkerInfo]): Self = StObject.set(x, "_workerInfos", value.asInstanceOf[js.Any])
    
    inline def set_workerInfosVarargs(value: WorkerInfo*): Self = StObject.set(x, "_workerInfos", js.Array(value*))
  }
}
