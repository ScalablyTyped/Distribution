package typings
package backgridLib.backgridMod.BackgridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell
  extends backboneLib.backboneMod.View[backboneLib.backboneMod.Model] {
  var editor: InputCellEditor = js.native
  var formatter: CellFormatter = js.native
  var tagName: java.lang.String = js.native
  def enterEditMode(): js.Any = js.native
  def exitEditMode(): js.Any = js.native
  def remove(): backboneLib.backboneMod.BackboneNs.View[backboneLib.backboneMod.Model] = js.native
  def renderError(): js.Any = js.native
}

