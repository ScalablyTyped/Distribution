package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutomaticTapeCreationPoliciesOutput extends StObject {
  
  /**
    * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape creation rules and the gateway that is using the policies.
    */
  var AutomaticTapeCreationPolicyInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationPolicyInfos] = js.undefined
}
object ListAutomaticTapeCreationPoliciesOutput {
  
  inline def apply(): ListAutomaticTapeCreationPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAutomaticTapeCreationPoliciesOutput]
  }
  
  extension [Self <: ListAutomaticTapeCreationPoliciesOutput](x: Self) {
    
    inline def setAutomaticTapeCreationPolicyInfos(value: AutomaticTapeCreationPolicyInfos): Self = StObject.set(x, "AutomaticTapeCreationPolicyInfos", value.asInstanceOf[js.Any])
    
    inline def setAutomaticTapeCreationPolicyInfosUndefined: Self = StObject.set(x, "AutomaticTapeCreationPolicyInfos", js.undefined)
    
    inline def setAutomaticTapeCreationPolicyInfosVarargs(value: AutomaticTapeCreationPolicyInfo*): Self = StObject.set(x, "AutomaticTapeCreationPolicyInfos", js.Array(value*))
  }
}
