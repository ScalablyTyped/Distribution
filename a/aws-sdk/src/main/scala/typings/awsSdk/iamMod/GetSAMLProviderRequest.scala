package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSAMLProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SAML provider resource object in IAM to get information about. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var SAMLProviderArn: arnType = js.native
}

object GetSAMLProviderRequest {
  @scala.inline
  def apply(SAMLProviderArn: arnType): GetSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSAMLProviderRequest]
  }
  @scala.inline
  implicit class GetSAMLProviderRequestOps[Self <: GetSAMLProviderRequest] (val x: Self) extends AnyVal {
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
    def setSAMLProviderArn(value: arnType): Self = this.set("SAMLProviderArn", value.asInstanceOf[js.Any])
  }
  
}

