package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "StripeMaterialProperty")
@js.native
class StripeMaterialProperty () extends MaterialProperty {
  def this(options: cesiumLib.Anon_EvenColorOddColor) = this()
  var evenColor: Color = js.native
  var oddColor: Color = js.native
  var offset: Property = js.native
  var orientation: Property = js.native
  var repeat: scala.Double = js.native
}

