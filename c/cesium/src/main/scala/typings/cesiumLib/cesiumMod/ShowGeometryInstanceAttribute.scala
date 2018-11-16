package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
class ShowGeometryInstanceAttribute ()
  extends cesiumLib.cesiumMod.CesiumNs.ShowGeometryInstanceAttribute {
  def this(show: scala.Boolean) = this()
  /* CompleteClass */
  override var componentDatatype: cesiumLib.cesiumMod.CesiumNs.ComponentDatatype = js.native
  /* CompleteClass */
  override var componentsPerAttribute: scala.Double = js.native
  /* CompleteClass */
  override var normalize: scala.Boolean = js.native
  /* CompleteClass */
  override var value: stdLib.Uint8Array = js.native
}

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
object ShowGeometryInstanceAttribute extends js.Object {
  def toValue(show: scala.Boolean): stdLib.Uint8Array = js.native
  def toValue(show: scala.Boolean, result: stdLib.Uint8Array): stdLib.Uint8Array = js.native
}

