package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
class ColorGeometryInstanceAttribute ()
  extends cesiumLib.cesiumMod.CesiumNs.ColorGeometryInstanceAttribute {
  def this(red: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double) = this()
  /* CompleteClass */
  override var componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  /* CompleteClass */
  override var componentsPerAttribute: scala.Double = js.native
  /* CompleteClass */
  override var normalize: scala.Boolean = js.native
  /* CompleteClass */
  override var value: stdLib.Uint8Array = js.native
}

/* static members */
@JSImport("cesium", "ColorGeometryInstanceAttribute")
@js.native
object ColorGeometryInstanceAttribute extends js.Object {
  def fromColor(color: cesiumLib.cesiumMod.CesiumNs.Color): cesiumLib.cesiumMod.CesiumNs.ColorGeometryInstanceAttribute = js.native
  def toValue(color: cesiumLib.cesiumMod.CesiumNs.Color): stdLib.Uint8Array = js.native
  def toValue(color: cesiumLib.cesiumMod.CesiumNs.Color, result: stdLib.Uint8Array): stdLib.Uint8Array = js.native
}

