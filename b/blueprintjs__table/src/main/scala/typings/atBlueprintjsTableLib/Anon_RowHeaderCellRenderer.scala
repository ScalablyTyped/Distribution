package typings
package atBlueprintjsTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowHeaderCellRenderer extends js.Object {
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ scala.Double, reactLib.reactMod.Global.JSXNs.Element]
}

object Anon_RowHeaderCellRenderer {
  @scala.inline
  def apply(rowHeaderCellRenderer: /* rowIndex */ scala.Double => reactLib.reactMod.Global.JSXNs.Element): Anon_RowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal(rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer))
  
    __obj.asInstanceOf[Anon_RowHeaderCellRenderer]
  }
}

