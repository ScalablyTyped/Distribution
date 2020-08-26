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
  def apply(): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
  @scala.inline
  implicit class GetVaultAccessPolicyOutputOps[Self <: GetVaultAccessPolicyOutput] (val x: Self) extends AnyVal {
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
    def setPolicy(value: VaultAccessPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

