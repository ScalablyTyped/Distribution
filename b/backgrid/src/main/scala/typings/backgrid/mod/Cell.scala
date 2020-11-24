package typings.backgrid.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backgrid", "Cell")
@js.native
class Cell ()
  extends View[Model[js.Any, ModelSetOptions, js.Object]] {
  
  var editor: InputCellEditor = js.native
  
  def enterEditMode(): js.Any = js.native
  
  def exitEditMode(): js.Any = js.native
  
  var formatter: CellFormatter = js.native
  
  def renderError(): js.Any = js.native
}
