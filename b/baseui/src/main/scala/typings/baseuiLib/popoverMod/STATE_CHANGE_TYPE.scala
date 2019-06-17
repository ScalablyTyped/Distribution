package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATE_CHANGE_TYPE extends js.Object {
  var close: baseuiLib.baseuiLibStrings.close
  var open: baseuiLib.baseuiLibStrings.open
}

object STATE_CHANGE_TYPE {
  @scala.inline
  def apply(close: baseuiLib.baseuiLibStrings.close, open: baseuiLib.baseuiLibStrings.open): STATE_CHANGE_TYPE = {
    val __obj = js.Dynamic.literal(close = close, open = open)
  
    __obj.asInstanceOf[STATE_CHANGE_TYPE]
  }
}

