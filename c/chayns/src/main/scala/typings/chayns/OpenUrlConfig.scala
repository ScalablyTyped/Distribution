package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.openUrl()
@js.native
trait OpenUrlConfig extends js.Object {
  var darkenBackground: js.UndefOr[Boolean] = js.native
  var exclusiveView: js.UndefOr[Boolean] = js.native
  var fullSize: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var url: String = js.native
  var width: js.UndefOr[Double] = js.native
}

object OpenUrlConfig {
  @scala.inline
  def apply(url: String): OpenUrlConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenUrlConfig]
  }
  @scala.inline
  implicit class OpenUrlConfigOps[Self <: OpenUrlConfig] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarkenBackground(value: Boolean): Self = this.set("darkenBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkenBackground: Self = this.set("darkenBackground", js.undefined)
    @scala.inline
    def setExclusiveView(value: Boolean): Self = this.set("exclusiveView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveView: Self = this.set("exclusiveView", js.undefined)
    @scala.inline
    def setFullSize(value: Boolean): Self = this.set("fullSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullSize: Self = this.set("fullSize", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

