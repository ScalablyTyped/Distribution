package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKernelInfo extends js.Object {
  var display_name: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var name: String = js.native
}

object IKernelInfo {
  @scala.inline
  def apply(name: String): IKernelInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelInfo]
  }
  @scala.inline
  implicit class IKernelInfoOps[Self <: IKernelInfo] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

