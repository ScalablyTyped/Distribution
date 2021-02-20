package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesConfigurationType extends StObject {
  
  /**
    * An array of rules. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var Rules: MappingRulesList = js.native
}
object RulesConfigurationType {
  
  @scala.inline
  def apply(Rules: MappingRulesList): RulesConfigurationType = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesConfigurationType]
  }
  
  @scala.inline
  implicit class RulesConfigurationTypeMutableBuilder[Self <: RulesConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: MappingRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: MappingRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
