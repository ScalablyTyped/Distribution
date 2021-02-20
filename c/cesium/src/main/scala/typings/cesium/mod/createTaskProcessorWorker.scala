package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTaskProcessorWorker {
  
  @JSImport("cesium", "createTaskProcessorWorker")
  @js.native
  def apply(workerFunction: WorkerFunction): TaskProcessorWorkerFunction = js.native
  
  type TaskProcessorWorkerFunction = js.Function1[/* event */ js.Any, Unit]
  
  type WorkerFunction = js.Function2[/* parameters */ js.Any, /* transferableObjects */ js.Array[js.Any], js.Any]
}
