package typings.cesium.cesiumMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
class ColorGeometryInstanceAttribute () extends js.Object {
  def this(red: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  var componentDatatype: ComponentDatatype = js.native
  var componentsPerAttribute: Double = js.native
  var normalize: Boolean = js.native
  var value: Uint8Array = js.native
}

/* static members */
@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
object ColorGeometryInstanceAttribute extends js.Object {
  def fromColor(color: Color): ColorGeometryInstanceAttribute = js.native
  def toValue(color: Color): Uint8Array = js.native
  def toValue(color: Color, result: Uint8Array): Uint8Array = js.native
}

