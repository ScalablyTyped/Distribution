package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DebugModelMatrixPrimitive")
@js.native
class DebugModelMatrixPrimitive () extends js.Object {
  def this(options: cesiumLib.Anon_Id) = this()
  var id: js.Any = js.native
  var length: scala.Double = js.native
  var modelMatrix: Matrix4 = js.native
  var show: scala.Boolean = js.native
  var width: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

