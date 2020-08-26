package typings.backbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryOptions extends Silenceable {
  var pushState: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
}

object HistoryOptions {
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  @scala.inline
  implicit class HistoryOptionsOps[Self <: HistoryOptions] (val x: Self) extends AnyVal {
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
    def setPushState(value: Boolean): Self = this.set("pushState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushState: Self = this.set("pushState", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

