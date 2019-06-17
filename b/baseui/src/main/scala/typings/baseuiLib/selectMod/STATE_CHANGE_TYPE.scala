package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATE_CHANGE_TYPE extends js.Object {
  var clear: baseuiLib.baseuiLibStrings.clear
  var remove: baseuiLib.baseuiLibStrings.remove
  var select: baseuiLib.baseuiLibStrings.select
}

object STATE_CHANGE_TYPE {
  @scala.inline
  def apply(
    clear: baseuiLib.baseuiLibStrings.clear,
    remove: baseuiLib.baseuiLibStrings.remove,
    select: baseuiLib.baseuiLibStrings.select
  ): STATE_CHANGE_TYPE = {
    val __obj = js.Dynamic.literal(clear = clear, remove = remove, select = select)
  
    __obj.asInstanceOf[STATE_CHANGE_TYPE]
  }
}

