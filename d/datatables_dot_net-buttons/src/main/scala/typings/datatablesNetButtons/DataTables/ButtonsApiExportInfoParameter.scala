package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApiExportInfoParameter extends js.Object {
  var extension: js.UndefOr[String | js.Function0[String]] = js.native
  var filename: js.UndefOr[String | js.Function0[String]] = js.native
  var messageBottom: js.UndefOr[Null | String | js.Function0[String]] = js.native
  var messageTop: js.UndefOr[Null | String | js.Function0[String]] = js.native
  var title: js.UndefOr[Null | String | js.Function0[String]] = js.native
}

object ButtonsApiExportInfoParameter {
  @scala.inline
  def apply(): ButtonsApiExportInfoParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonsApiExportInfoParameter]
  }
  @scala.inline
  implicit class ButtonsApiExportInfoParameterOps[Self <: ButtonsApiExportInfoParameter] (val x: Self) extends AnyVal {
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
    def setExtensionFunction0(value: () => String): Self = this.set("extension", js.Any.fromFunction0(value))
    @scala.inline
    def setExtension(value: String | js.Function0[String]): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setFilenameFunction0(value: () => String): Self = this.set("filename", js.Any.fromFunction0(value))
    @scala.inline
    def setFilename(value: String | js.Function0[String]): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setMessageBottomFunction0(value: () => String): Self = this.set("messageBottom", js.Any.fromFunction0(value))
    @scala.inline
    def setMessageBottom(value: String | js.Function0[String]): Self = this.set("messageBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageBottom: Self = this.set("messageBottom", js.undefined)
    @scala.inline
    def setMessageBottomNull: Self = this.set("messageBottom", null)
    @scala.inline
    def setMessageTopFunction0(value: () => String): Self = this.set("messageTop", js.Any.fromFunction0(value))
    @scala.inline
    def setMessageTop(value: String | js.Function0[String]): Self = this.set("messageTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageTop: Self = this.set("messageTop", js.undefined)
    @scala.inline
    def setMessageTopNull: Self = this.set("messageTop", null)
    @scala.inline
    def setTitleFunction0(value: () => String): Self = this.set("title", js.Any.fromFunction0(value))
    @scala.inline
    def setTitle(value: String | js.Function0[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
  
}

