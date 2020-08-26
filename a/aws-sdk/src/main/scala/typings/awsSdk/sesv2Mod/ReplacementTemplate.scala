package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplacementTemplate extends js.Object {
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var ReplacementTemplateData: js.UndefOr[EmailTemplateData] = js.native
}

object ReplacementTemplate {
  @scala.inline
  def apply(): ReplacementTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacementTemplate]
  }
  @scala.inline
  implicit class ReplacementTemplateOps[Self <: ReplacementTemplate] (val x: Self) extends AnyVal {
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
    def setReplacementTemplateData(value: EmailTemplateData): Self = this.set("ReplacementTemplateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacementTemplateData: Self = this.set("ReplacementTemplateData", js.undefined)
  }
  
}

