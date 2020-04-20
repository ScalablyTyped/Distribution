package typings.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledContentPropsT extends js.Object {
  @JSName("$mLeft")
  var $mLeft: Boolean
  @JSName("$sublist")
  var $sublist: Boolean
}

object StyledContentPropsT {
  @scala.inline
  def apply($mLeft: Boolean, $sublist: Boolean): StyledContentPropsT = {
    val __obj = js.Dynamic.literal($mLeft = $mLeft.asInstanceOf[js.Any], $sublist = $sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledContentPropsT]
  }
}

