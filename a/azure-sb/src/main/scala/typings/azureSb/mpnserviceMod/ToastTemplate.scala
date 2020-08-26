package typings.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastTemplate extends Template {
  var param: js.UndefOr[String] = js.native
  var text1: String = js.native
  var text2: String = js.native
}

object ToastTemplate {
  @scala.inline
  def apply(text1: String, text2: String): ToastTemplate = {
    val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastTemplate]
  }
  @scala.inline
  implicit class ToastTemplateOps[Self <: ToastTemplate] (val x: Self) extends AnyVal {
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
    def setText1(value: String): Self = this.set("text1", value.asInstanceOf[js.Any])
    @scala.inline
    def setText2(value: String): Self = this.set("text2", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
  
}

