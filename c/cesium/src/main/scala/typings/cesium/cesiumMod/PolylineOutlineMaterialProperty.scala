package typings.cesium.cesiumMod

import typings.cesium.Anon_ColorOutlineColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineOutlineMaterialProperty")
@js.native
class PolylineOutlineMaterialProperty () extends MaterialProperty {
  def this(options: Anon_ColorOutlineColor) = this()
  var color: Color = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Property = js.native
}

