package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessPointPolicyStatusResult extends js.Object {
  /**
    * Indicates the current policy status of the specified access point.
    */
  var PolicyStatus: js.UndefOr[typings.awsSdk.s3controlMod.PolicyStatus] = js.native
}

object GetAccessPointPolicyStatusResult {
  @scala.inline
  def apply(): GetAccessPointPolicyStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyStatusResult]
  }
  @scala.inline
  implicit class GetAccessPointPolicyStatusResultOps[Self <: GetAccessPointPolicyStatusResult] (val x: Self) extends AnyVal {
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
    def setPolicyStatus(value: PolicyStatus): Self = this.set("PolicyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyStatus: Self = this.set("PolicyStatus", js.undefined)
  }
  
}

