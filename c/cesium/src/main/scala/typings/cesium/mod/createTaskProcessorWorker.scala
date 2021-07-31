package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTaskProcessorWorker {
  
  @scala.inline
  def apply(workerFunction: WorkerFunction): TaskProcessorWorkerFunction = ^.asInstanceOf[js.Dynamic].apply(workerFunction.asInstanceOf[js.Any]).asInstanceOf[TaskProcessorWorkerFunction]
  
  @JSImport("cesium", "createTaskProcessorWorker")
  @js.native
  val ^ : js.Any = js.native
  
  type TaskProcessorWorkerFunction = js.Function1[/* event */ js.Any, Unit]
  
  type WorkerFunction = js.Function2[/* parameters */ js.Any, /* transferableObjects */ js.Array[js.Any], js.Any]
}
