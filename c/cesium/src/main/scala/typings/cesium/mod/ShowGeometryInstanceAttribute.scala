package typings.cesium.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute () extends js.Object {
  def this(show: Boolean) = this()
  var componentDatatype: ComponentDatatype = js.native
  var componentsPerAttribute: Double = js.native
  var normalize: Boolean = js.native
  var value: Uint8Array = js.native
}

/* static members */
@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
object ShowGeometryInstanceAttribute extends js.Object {
  def toValue(show: Boolean): Uint8Array = js.native
  def toValue(show: Boolean, result: Uint8Array): Uint8Array = js.native
}

