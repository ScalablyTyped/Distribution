package typings
package baseuiLib.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ORIENTATION extends js.Object {
  var horizontal: baseuiLib.baseuiLibStrings.horizontal
  var vertical: baseuiLib.baseuiLibStrings.vertical
}

object ORIENTATION {
  @scala.inline
  def apply(horizontal: baseuiLib.baseuiLibStrings.horizontal, vertical: baseuiLib.baseuiLibStrings.vertical): ORIENTATION = {
    val __obj = js.Dynamic.literal(horizontal = horizontal, vertical = vertical)
  
    __obj.asInstanceOf[ORIENTATION]
  }
}

