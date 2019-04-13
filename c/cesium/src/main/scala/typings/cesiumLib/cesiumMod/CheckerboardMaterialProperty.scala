package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CheckerboardMaterialProperty")
@js.native
class CheckerboardMaterialProperty () extends MaterialProperty {
  def this(options: cesiumLib.Anon_EvenColor) = this()
  var evenColor: Color = js.native
  var oddColor: Color = js.native
  var repeat: Property = js.native
}

