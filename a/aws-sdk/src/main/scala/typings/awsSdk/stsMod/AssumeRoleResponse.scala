package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you can use to refer to the resulting temporary security credentials. For example, you can reference these credentials as a principal in a resource-based policy by using the ARN or assumed role ID. The ARN and ID include the RoleSessionName that you specified when you called AssumeRole. 
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdk.stsMod.AssumedRoleUser] = js.native
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.stsMod.Credentials] = js.native
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
}

object AssumeRoleResponse {
  @scala.inline
  def apply(
    AssumedRoleUser: AssumedRoleUser = null,
    Credentials: Credentials = null,
    PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  ): AssumeRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (AssumedRoleUser != null) __obj.updateDynamic("AssumedRoleUser")(AssumedRoleUser.asInstanceOf[js.Any])
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(PackedPolicySize)) __obj.updateDynamic("PackedPolicySize")(PackedPolicySize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleResponse]
  }
}

