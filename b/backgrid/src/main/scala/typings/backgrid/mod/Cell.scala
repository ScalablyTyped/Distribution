package typings.backgrid.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Cell")
@js.native
class Cell ()
  extends View[Model[js.Any, ModelSetOptions]] {
  var editor: InputCellEditor = js.native
  var formatter: CellFormatter = js.native
  def enterEditMode(): js.Any = js.native
  def exitEditMode(): js.Any = js.native
  def renderError(): js.Any = js.native
}

