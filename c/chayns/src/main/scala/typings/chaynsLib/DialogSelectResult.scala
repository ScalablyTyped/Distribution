package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogSelectResult extends js.Object {
  var buttonType: chaynsLib.chaynsNs.dialogNs.buttonType
  var selection: js.Array[DialogSelectResultItem]
}

object DialogSelectResult {
  @scala.inline
  def apply(buttonType: chaynsLib.chaynsNs.dialogNs.buttonType, selection: js.Array[DialogSelectResultItem]): DialogSelectResult = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, selection = selection)
  
    __obj.asInstanceOf[DialogSelectResult]
  }
}

