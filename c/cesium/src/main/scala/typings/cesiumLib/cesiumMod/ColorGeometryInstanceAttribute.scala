package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
class ColorGeometryInstanceAttribute () extends js.Object {
  def this(red: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double) = this()
  var componentDatatype: ComponentDatatype = js.native
  var componentsPerAttribute: scala.Double = js.native
  var normalize: scala.Boolean = js.native
  var value: stdLib.Uint8Array = js.native
}

/* static members */
@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
object ColorGeometryInstanceAttribute extends js.Object {
  def fromColor(color: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.ColorGeometryInstanceAttribute = js.native
  def toValue(color: cesiumLib.cesiumMod.Color): stdLib.Uint8Array = js.native
  def toValue(color: cesiumLib.cesiumMod.Color, result: stdLib.Uint8Array): stdLib.Uint8Array = js.native
}

