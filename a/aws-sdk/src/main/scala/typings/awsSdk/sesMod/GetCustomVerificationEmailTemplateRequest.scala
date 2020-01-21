package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The name of the custom verification email template that you want to retrieve.
    */
  var TemplateName: typings.awsSdk.sesMod.TemplateName = js.native
}

object GetCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): GetCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
  }
}

