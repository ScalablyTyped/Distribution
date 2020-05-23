package typings.cesium.mod

import typings.cesium.anon.CellAlpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GridMaterialProperty")
@js.native
class GridMaterialProperty () extends MaterialProperty {
  def this(options: CellAlpha) = this()
  var cellAlpha: Property = js.native
  var color: Color = js.native
  var lineCount: Property = js.native
  var lineOffset: Property = js.native
  var lineThickness: Property = js.native
}

