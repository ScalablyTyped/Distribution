package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingComponentProperties extends js.Object {
  var loading: js.UndefOr[Boolean] = js.native
  var loadingCompletedText: js.UndefOr[String] = js.native
  var loadingText: js.UndefOr[String] = js.native
  var showText: js.UndefOr[Boolean] = js.native
}

object LoadingComponentProperties {
  @scala.inline
  def apply(): LoadingComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingComponentProperties]
  }
  @scala.inline
  implicit class LoadingComponentPropertiesOps[Self <: LoadingComponentProperties] (val x: Self) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLoadingCompletedText(value: String): Self = this.set("loadingCompletedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingCompletedText: Self = this.set("loadingCompletedText", js.undefined)
    @scala.inline
    def setLoadingText(value: String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    @scala.inline
    def setShowText(value: Boolean): Self = this.set("showText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
  }
  
}

