package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticTapeCreationPolicyInfo extends StObject {
  
  /**
    * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules that determine when and how to automatically create new tapes.
    */
  var AutomaticTapeCreationRules: js.UndefOr[typings.awsSdk.storagegatewayMod.AutomaticTapeCreationRules] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object AutomaticTapeCreationPolicyInfo {
  
  @scala.inline
  def apply(): AutomaticTapeCreationPolicyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticTapeCreationPolicyInfo]
  }
  
  @scala.inline
  implicit class AutomaticTapeCreationPolicyInfoMutableBuilder[Self <: AutomaticTapeCreationPolicyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticTapeCreationRules(value: AutomaticTapeCreationRules): Self = StObject.set(x, "AutomaticTapeCreationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticTapeCreationRulesUndefined: Self = StObject.set(x, "AutomaticTapeCreationRules", js.undefined)
    
    @scala.inline
    def setAutomaticTapeCreationRulesVarargs(value: AutomaticTapeCreationRule*): Self = StObject.set(x, "AutomaticTapeCreationRules", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
