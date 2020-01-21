package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOpenIDConnectProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see OpenIDConnectProviderListEntry. 
    */
  var OpenIDConnectProviderArn: js.UndefOr[arnType] = js.native
}

object CreateOpenIDConnectProviderResponse {
  @scala.inline
  def apply(OpenIDConnectProviderArn: arnType = null): CreateOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (OpenIDConnectProviderArn != null) __obj.updateDynamic("OpenIDConnectProviderArn")(OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpenIDConnectProviderResponse]
  }
}

