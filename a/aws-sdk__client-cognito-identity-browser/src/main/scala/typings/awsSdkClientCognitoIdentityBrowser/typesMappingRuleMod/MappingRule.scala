package typings.awsSdkClientCognitoIdentityBrowser.typesMappingRuleMod

import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Contains
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.Equals
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.NotEqual
import typings.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.StartsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingRule extends js.Object {
  /**
    * <p>The claim name that must be present in the token, for example, "isAdmin" or "paid".</p>
    */
  var Claim: String = js.native
  /**
    * <p>The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.</p>
    */
  var MatchType: Equals | Contains | StartsWith | NotEqual | String = js.native
  /**
    * <p>The role ARN.</p>
    */
  var RoleARN: String = js.native
  /**
    * <p>A brief string that the claim must match, for example, "paid" or "yes".</p>
    */
  var Value: String = js.native
}

object MappingRule {
  @scala.inline
  def apply(
    Claim: String,
    MatchType: Equals | Contains | StartsWith | NotEqual | String,
    RoleARN: String,
    Value: String
  ): MappingRule = {
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
    def setClaim(value: String): Self = this.set("Claim", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchType(value: Equals | Contains | StartsWith | NotEqual | String): Self = this.set("MatchType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleARN(value: String): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

