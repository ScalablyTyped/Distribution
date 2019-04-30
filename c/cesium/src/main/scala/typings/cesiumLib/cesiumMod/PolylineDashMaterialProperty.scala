package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineDashMaterialProperty")
@js.native
class PolylineDashMaterialProperty () extends MaterialProperty {
  def this(options: cesiumLib.Anon_ColorDashLength) = this()
  var color: Color = js.native
  var dashLength: Property = js.native
  var dashPattern: Property = js.native
  var gapColor: Color = js.native
}

