package typings.awsSdk.rbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleRequest extends StObject {
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: RuleIdentifier
}
object GetRuleRequest {
  
  inline def apply(Identifier: RuleIdentifier): GetRuleRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleRequest]
  }
  
  extension [Self <: GetRuleRequest](x: Self) {
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
