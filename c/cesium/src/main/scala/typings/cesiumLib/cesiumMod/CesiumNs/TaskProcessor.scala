package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskProcessor extends js.Object {
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def scheduleTask(parameters: js.Any): stdLib.Promise[_] = js.native
  def scheduleTask(parameters: js.Any, transferableObjects: js.Array[_]): stdLib.Promise[_] = js.native
}

