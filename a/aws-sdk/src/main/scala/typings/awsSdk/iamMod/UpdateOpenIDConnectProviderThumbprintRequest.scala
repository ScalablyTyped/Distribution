package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOpenIDConnectProviderThumbprintRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM OIDC provider resource object for which you want to update the thumbprint. You can get a list of OIDC provider ARNs by using the ListOpenIDConnectProviders operation. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var OpenIDConnectProviderArn: arnType = js.native
  /**
    * A list of certificate thumbprints that are associated with the specified IAM OpenID Connect provider. For more information, see CreateOpenIDConnectProvider. 
    */
  var ThumbprintList: thumbprintListType = js.native
}

object UpdateOpenIDConnectProviderThumbprintRequest {
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType, ThumbprintList: thumbprintListType): UpdateOpenIDConnectProviderThumbprintRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any], ThumbprintList = ThumbprintList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpenIDConnectProviderThumbprintRequest]
  }
  @scala.inline
  implicit class UpdateOpenIDConnectProviderThumbprintRequestOps[Self <: UpdateOpenIDConnectProviderThumbprintRequest] (val x: Self) extends AnyVal {
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
    def setOpenIDConnectProviderArn(value: arnType): Self = this.set("OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbprintListVarargs(value: thumbprintType*): Self = this.set("ThumbprintList", js.Array(value :_*))
    @scala.inline
    def setThumbprintList(value: thumbprintListType): Self = this.set("ThumbprintList", value.asInstanceOf[js.Any])
  }
  
}

