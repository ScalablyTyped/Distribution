package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesConfigurationType extends js.Object {
  
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p>
    *          <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.UndefOr[js.Array[MappingRule]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "RulesConfigurationType")
@js.native
object RulesConfigurationType extends js.Object {
  
  def filterSensitiveLog(obj: RulesConfigurationType): js.Any = js.native
}
