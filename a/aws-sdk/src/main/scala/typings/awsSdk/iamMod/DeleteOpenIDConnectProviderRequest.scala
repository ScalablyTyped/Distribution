package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOpenIDConnectProviderRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the ListOpenIDConnectProviders operation.
    */
  var OpenIDConnectProviderArn: arnType = js.native
}

object DeleteOpenIDConnectProviderRequest {
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType): DeleteOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteOpenIDConnectProviderRequest]
  }
}

