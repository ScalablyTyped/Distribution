package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createTaskProcessorWorkerNs {
  type TaskProcessorWorkerFunction = js.Function1[/* event */ js.Any, Unit]
  type WorkerFunction = js.Function2[/* parameters */ js.Any, /* transferableObjects */ js.Array[js.Any], js.Any]
}
