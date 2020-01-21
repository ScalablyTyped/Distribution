package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityProviderResponse extends js.Object {
  /**
    * The identity provider that was deleted.
    */
  var IdentityProvider: IdentityProviderType = js.native
}

object DescribeIdentityProviderResponse {
  @scala.inline
  def apply(IdentityProvider: IdentityProviderType): DescribeIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeIdentityProviderResponse]
  }
}

