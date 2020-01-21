package typings.cesium.mod

import typings.cesium.AnonColorDashLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PolylineDashMaterialProperty")
@js.native
class PolylineDashMaterialProperty () extends MaterialProperty {
  def this(options: AnonColorDashLength) = this()
  var color: Color = js.native
  var dashLength: Property = js.native
  var dashPattern: Property = js.native
  var gapColor: Color = js.native
}

