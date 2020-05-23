package typings.cesium.mod

import typings.cesium.anon.GlowPower
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineGlowMaterialProperty")
@js.native
class PolylineGlowMaterialProperty () extends MaterialProperty {
  def this(options: GlowPower) = this()
  var color: Color = js.native
  var glowPower: Property = js.native
}

