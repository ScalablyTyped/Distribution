package typings.atBlueprintjsTable.atBlueprintjsTableMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Clipboard")
@js.native
object Clipboard extends js.Object {
  def applySelectableStyles(elem: HTMLElement): HTMLElement = js.native
  def copyCells(cells: js.Array[js.Array[String]]): Boolean = js.native
  def copyElement(elem: HTMLElement): Boolean = js.native
  def copyElement(elem: HTMLElement, plaintext: String): Boolean = js.native
  def copyString(value: String): Boolean = js.native
  def isCopySupported(): Boolean = js.native
}

