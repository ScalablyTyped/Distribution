package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogDateResult extends js.Object {
  var buttonType: chaynsLib.chaynsNs.dialogNs.buttonType
  var timestamp: scala.Double
}

object DialogDateResult {
  @scala.inline
  def apply(buttonType: chaynsLib.chaynsNs.dialogNs.buttonType, timestamp: scala.Double): DialogDateResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonType")(buttonType)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[DialogDateResult]
  }
}

