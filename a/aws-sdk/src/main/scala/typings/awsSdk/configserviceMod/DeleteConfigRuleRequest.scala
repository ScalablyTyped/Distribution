package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigRuleRequest extends StObject {
  
  /**
    * The name of the Config rule that you want to delete.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName
}
object DeleteConfigRuleRequest {
  
  inline def apply(ConfigRuleName: ConfigRuleName): DeleteConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigRuleRequest]
  }
  
  extension [Self <: DeleteConfigRuleRequest](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
  }
}
