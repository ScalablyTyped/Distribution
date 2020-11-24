package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingRule extends js.Object {
  
  /**
    * <p>The claim name that must be present in the token, for example, "isAdmin" or
    *          "paid".</p>
    */
  var Claim: js.UndefOr[String] = js.native
  
  /**
    * <p>The match condition that specifies how closely the claim value in the IdP token must
    *          match <code>Value</code>.</p>
    */
  var MatchType: js.UndefOr[MappingRuleMatchType | String] = js.native
  
  /**
    * <p>The role ARN.</p>
    */
  var RoleARN: js.UndefOr[String] = js.native
  
  /**
    * <p>A brief string that the claim must match, for example, "paid" or "yes".</p>
    */
  var Value: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MappingRule")
@js.native
object MappingRule extends js.Object {
  
  def filterSensitiveLog(obj: MappingRule): js.Any = js.native
}
