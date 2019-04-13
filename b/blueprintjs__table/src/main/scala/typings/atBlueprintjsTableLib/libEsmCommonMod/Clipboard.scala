package typings
package atBlueprintjsTableLib.libEsmCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common", "Clipboard")
@js.native
object Clipboard extends js.Object {
  def applySelectableStyles(elem: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def copyCells(cells: js.Array[js.Array[java.lang.String]]): scala.Boolean = js.native
  def copyElement(elem: stdLib.HTMLElement): scala.Boolean = js.native
  def copyElement(elem: stdLib.HTMLElement, plaintext: java.lang.String): scala.Boolean = js.native
  def copyString(value: java.lang.String): scala.Boolean = js.native
  def isCopySupported(): scala.Boolean = js.native
}

