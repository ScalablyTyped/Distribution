package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesConfigurationType extends StObject {
  
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p>
    *          <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.UndefOr[js.Array[MappingRule]] = js.native
}
object RulesConfigurationType {
  
  @scala.inline
  def apply(): RulesConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulesConfigurationType]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "RulesConfigurationType.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: RulesConfigurationType): js.Any = js.native
  
  @scala.inline
  implicit class RulesConfigurationTypeMutableBuilder[Self <: RulesConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[MappingRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: MappingRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
