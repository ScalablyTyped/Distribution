package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingRule extends js.Object {
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var Claim: ClaimName = js.native
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var MatchType: MappingRuleMatchType = js.native
  /**
    * The role ARN.
    */
  var RoleARN: ARNString = js.native
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var Value: ClaimValue = js.native
}

object MappingRule {
  @scala.inline
  def apply(Claim: ClaimName, MatchType: MappingRuleMatchType, RoleARN: ARNString, Value: ClaimValue): MappingRule = {
    val __obj = js.Dynamic.literal(Claim = Claim.asInstanceOf[js.Any], MatchType = MatchType.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingRule]
  }
  @scala.inline
  implicit class MappingRuleOps[Self <: MappingRule] (val x: Self) extends AnyVal {
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
    def setClaim(value: ClaimName): Self = this.set("Claim", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchType(value: MappingRuleMatchType): Self = this.set("MatchType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleARN(value: ARNString): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ClaimValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

