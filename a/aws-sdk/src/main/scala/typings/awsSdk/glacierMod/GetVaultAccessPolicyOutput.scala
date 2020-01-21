package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultAccessPolicyOutput extends js.Object {
  /**
    * Contains the returned vault access policy as a JSON string.
    */
  var policy: js.UndefOr[VaultAccessPolicy] = js.native
}

object GetVaultAccessPolicyOutput {
  @scala.inline
  def apply(policy: VaultAccessPolicy = null): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
}

