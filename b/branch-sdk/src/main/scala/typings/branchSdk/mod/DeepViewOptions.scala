package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepViewOptions extends js.Object {
  var make_new_link: js.UndefOr[Boolean] = js.native
  var open_app: js.UndefOr[Boolean] = js.native
}

object DeepViewOptions {
  @scala.inline
  def apply(): DeepViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepViewOptions]
  }
  @scala.inline
  implicit class DeepViewOptionsOps[Self <: DeepViewOptions] (val x: Self) extends AnyVal {
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
    def setMake_new_link(value: Boolean): Self = this.set("make_new_link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMake_new_link: Self = this.set("make_new_link", js.undefined)
    @scala.inline
    def setOpen_app(value: Boolean): Self = this.set("open_app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen_app: Self = this.set("open_app", js.undefined)
  }
  
}

