package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFederationTokenResponse extends js.Object {
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.stsMod.Credentials] = js.native
  /**
    * Identifiers for the federated user associated with the credentials (such as arn:aws:sts::123456789012:federated-user/Bob or 123456789012:Bob). You can use the federated user's ARN in your resource-based policies, such as an Amazon S3 bucket policy. 
    */
  var FederatedUser: js.UndefOr[typings.awsSdk.stsMod.FederatedUser] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
}

object GetFederationTokenResponse {
  @scala.inline
  def apply(
    Credentials: Credentials = null,
    FederatedUser: FederatedUser = null,
    PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  ): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (FederatedUser != null) __obj.updateDynamic("FederatedUser")(FederatedUser.asInstanceOf[js.Any])
    if (!js.isUndefined(PackedPolicySize)) __obj.updateDynamic("PackedPolicySize")(PackedPolicySize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
}

