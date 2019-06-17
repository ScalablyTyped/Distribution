package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATE_CHANGE_TYPE extends js.Object {
  var countryChange: baseuiLib.baseuiLibStrings.countryChange
  var textChange: baseuiLib.baseuiLibStrings.textChange
}

object STATE_CHANGE_TYPE {
  @scala.inline
  def apply(
    countryChange: baseuiLib.baseuiLibStrings.countryChange,
    textChange: baseuiLib.baseuiLibStrings.textChange
  ): STATE_CHANGE_TYPE = {
    val __obj = js.Dynamic.literal(countryChange = countryChange, textChange = textChange)
  
    __obj.asInstanceOf[STATE_CHANGE_TYPE]
  }
}

