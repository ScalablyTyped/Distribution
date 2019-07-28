package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TaskProcessor")
@js.native
class TaskProcessor protected () extends js.Object {
  def this(workerName: String) = this()
  def this(workerName: String, maximumActiveTasks: Double) = this()
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def scheduleTask(parameters: js.Any): js.Promise[_] = js.native
  def scheduleTask(parameters: js.Any, transferableObjects: js.Array[_]): js.Promise[_] = js.native
}

