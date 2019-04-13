package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute () extends js.Object {
  def this(show: scala.Boolean) = this()
  var componentDatatype: ComponentDatatype = js.native
  var componentsPerAttribute: scala.Double = js.native
  var normalize: scala.Boolean = js.native
  var value: stdLib.Uint8Array = js.native
}

/* static members */
@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
object ShowGeometryInstanceAttribute extends js.Object {
  def toValue(show: scala.Boolean): stdLib.Uint8Array = js.native
  def toValue(show: scala.Boolean, result: stdLib.Uint8Array): stdLib.Uint8Array = js.native
}

