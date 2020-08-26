package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyVersionIdentifier extends js.Object {
  /**
    * The name of the policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  /**
    * The ID of the version of the policy associated with the resource.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object PolicyVersionIdentifier {
  @scala.inline
  def apply(): PolicyVersionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersionIdentifier]
  }
  @scala.inline
  implicit class PolicyVersionIdentifierOps[Self <: PolicyVersionIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = this.set("policyVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyVersionId: Self = this.set("policyVersionId", js.undefined)
  }
  
}

