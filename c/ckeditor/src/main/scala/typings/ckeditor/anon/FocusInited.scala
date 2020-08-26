package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusInited extends js.Object {
  var focusInited: js.UndefOr[Boolean] = js.native
  var initOnlyNew: js.UndefOr[Boolean] = js.native
}

object FocusInited {
  @scala.inline
  def apply(): FocusInited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusInited]
  }
  @scala.inline
  implicit class FocusInitedOps[Self <: FocusInited] (val x: Self) extends AnyVal {
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
    def setFocusInited(value: Boolean): Self = this.set("focusInited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusInited: Self = this.set("focusInited", js.undefined)
    @scala.inline
    def setInitOnlyNew(value: Boolean): Self = this.set("initOnlyNew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitOnlyNew: Self = this.set("initOnlyNew", js.undefined)
  }
  
}

