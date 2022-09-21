package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesConfigurationType extends StObject {
  
  /**
    * <p>An array of rules. You can specify up to 25 rules per identity provider.</p>
    *          <p>Rules are evaluated in order. The first one to match specifies the role.</p>
    */
  var Rules: js.UndefOr[js.Array[MappingRule]] = js.undefined
}
object RulesConfigurationType {
  
  inline def apply(): RulesConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulesConfigurationType]
  }
  
  extension [Self <: RulesConfigurationType](x: Self) {
    
    inline def setRules(value: js.Array[MappingRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: MappingRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
