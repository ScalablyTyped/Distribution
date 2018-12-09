package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProcessor extends js.Object {
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def scheduleTask(parameters: js.Any): js.Promise[_] = js.native
  def scheduleTask(parameters: js.Any, transferableObjects: js.Array[_]): js.Promise[_] = js.native
}

