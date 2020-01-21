package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRenderTemplateRequest extends js.Object {
  /**
    * A list of replacement values to apply to the template. This parameter is a JSON object, typically consisting of key-value pairs in which the keys correspond to replacement tags in the email template.
    */
  var TemplateData: typings.awsSdk.sesMod.TemplateData = js.native
  /**
    * The name of the template that you want to render.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
}

object TestRenderTemplateRequest {
  @scala.inline
  def apply(TemplateData: TemplateData, TemplateName: TemplateName): TestRenderTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateData = TemplateData.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestRenderTemplateRequest]
  }
}

