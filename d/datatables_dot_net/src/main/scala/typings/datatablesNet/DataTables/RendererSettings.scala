package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "colunm-settings"
//#region "other-settings"
@js.native
trait RendererSettings extends js.Object {
  var header: js.UndefOr[String] = js.native
  var pageButton: js.UndefOr[String] = js.native
}

object RendererSettings {
  @scala.inline
  def apply(): RendererSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererSettings]
  }
  @scala.inline
  implicit class RendererSettingsOps[Self <: RendererSettings] (val x: Self) extends AnyVal {
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setPageButton(value: String): Self = this.set("pageButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageButton: Self = this.set("pageButton", js.undefined)
  }
  
}

