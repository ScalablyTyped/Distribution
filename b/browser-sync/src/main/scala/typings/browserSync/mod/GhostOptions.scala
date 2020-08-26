package typings.browserSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostOptions extends js.Object {
  var clicks: js.UndefOr[Boolean] = js.native
  var forms: js.UndefOr[FormsOptions | Boolean] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
}

object GhostOptions {
  @scala.inline
  def apply(): GhostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GhostOptions]
  }
  @scala.inline
  implicit class GhostOptionsOps[Self <: GhostOptions] (val x: Self) extends AnyVal {
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
    def setClicks(value: Boolean): Self = this.set("clicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClicks: Self = this.set("clicks", js.undefined)
    @scala.inline
    def setForms(value: FormsOptions | Boolean): Self = this.set("forms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForms: Self = this.set("forms", js.undefined)
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
  
}

