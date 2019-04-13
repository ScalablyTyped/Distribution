package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TaskProcessor")
@js.native
class TaskProcessor protected () extends js.Object {
  def this(workerName: java.lang.String) = this()
  def this(workerName: java.lang.String, maximumActiveTasks: scala.Double) = this()
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def scheduleTask(parameters: js.Any): js.Promise[_] = js.native
  def scheduleTask(parameters: js.Any, transferableObjects: js.Array[_]): js.Promise[_] = js.native
}

