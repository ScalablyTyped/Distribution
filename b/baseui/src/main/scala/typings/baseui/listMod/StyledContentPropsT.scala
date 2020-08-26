package typings.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledContentPropsT extends js.Object {
  @JSName("$mLeft")
  var $mLeft: Boolean = js.native
  @JSName("$sublist")
  var $sublist: Boolean = js.native
}

object StyledContentPropsT {
  @scala.inline
  def apply($mLeft: Boolean, $sublist: Boolean): StyledContentPropsT = {
    val __obj = js.Dynamic.literal($mLeft = $mLeft.asInstanceOf[js.Any], $sublist = $sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledContentPropsT]
  }
  @scala.inline
  implicit class StyledContentPropsTOps[Self <: StyledContentPropsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$mLeft(value: Boolean): Self = this.set("$mLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def set$sublist(value: Boolean): Self = this.set("$sublist", value.asInstanceOf[js.Any])
  }
  
}

