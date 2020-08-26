package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateTemplateRequest extends js.Object {
  /**
    * ID of the application associated with the Amazon CloudFormation template.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Format for generating the Amazon CloudFormation template.
    */
  var templateFormat: js.UndefOr[OutputFormat] = js.native
}

object GenerateTemplateRequest {
  @scala.inline
  def apply(): GenerateTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateTemplateRequest]
  }
  @scala.inline
  implicit class GenerateTemplateRequestOps[Self <: GenerateTemplateRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setTemplateFormat(value: OutputFormat): Self = this.set("templateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateFormat: Self = this.set("templateFormat", js.undefined)
  }
  
}

