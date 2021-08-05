package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAutomaticTapeCreationPolicyInput extends StObject {
  
  /**
    * An automatic tape creation policy consists of a list of automatic tape creation rules. The rules determine when and how to automatically create new tapes.
    */
  var AutomaticTapeCreationRules: typings.awsSdk.storagegatewayMod.AutomaticTapeCreationRules
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object UpdateAutomaticTapeCreationPolicyInput {
  
  inline def apply(AutomaticTapeCreationRules: AutomaticTapeCreationRules, GatewayARN: GatewayARN): UpdateAutomaticTapeCreationPolicyInput = {
    val __obj = js.Dynamic.literal(AutomaticTapeCreationRules = AutomaticTapeCreationRules.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutomaticTapeCreationPolicyInput]
  }
  
  extension [Self <: UpdateAutomaticTapeCreationPolicyInput](x: Self) {
    
    inline def setAutomaticTapeCreationRules(value: AutomaticTapeCreationRules): Self = StObject.set(x, "AutomaticTapeCreationRules", value.asInstanceOf[js.Any])
    
    inline def setAutomaticTapeCreationRulesVarargs(value: AutomaticTapeCreationRule*): Self = StObject.set(x, "AutomaticTapeCreationRules", js.Array(value :_*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
