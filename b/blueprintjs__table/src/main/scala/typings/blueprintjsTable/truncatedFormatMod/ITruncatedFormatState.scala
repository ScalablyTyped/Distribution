package typings.blueprintjsTable.truncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITruncatedFormatState extends js.Object {
  var isPopoverOpen: js.UndefOr[Boolean] = js.native
  var isTruncated: js.UndefOr[Boolean] = js.native
}

object ITruncatedFormatState {
  @scala.inline
  def apply(): ITruncatedFormatState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITruncatedFormatState]
  }
  @scala.inline
  implicit class ITruncatedFormatStateOps[Self <: ITruncatedFormatState] (val x: Self) extends AnyVal {
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
    def setIsPopoverOpen(value: Boolean): Self = this.set("isPopoverOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPopoverOpen: Self = this.set("isPopoverOpen", js.undefined)
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("isTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTruncated: Self = this.set("isTruncated", js.undefined)
  }
  
}

