package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "createTaskProcessorWorker")
@js.native
object createTaskProcessorWorker extends js.Object {
  def apply(workerFunction: WorkerFunction): TaskProcessorWorkerFunction = js.native
  type TaskProcessorWorkerFunction = js.Function1[/* event */ js.Any, Unit]
  type WorkerFunction = js.Function2[/* parameters */ js.Any, /* transferableObjects */ js.Array[js.Any], js.Any]
}

