package typings
package backgridLib.backgridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backgrid", "Cell")
@js.native
class Cell ()
  extends backboneLib.backboneMod.View[backboneLib.backboneMod.Model] {
  var editor: InputCellEditor = js.native
  var formatter: CellFormatter = js.native
  def enterEditMode(): js.Any = js.native
  def exitEditMode(): js.Any = js.native
  def renderError(): js.Any = js.native
}

