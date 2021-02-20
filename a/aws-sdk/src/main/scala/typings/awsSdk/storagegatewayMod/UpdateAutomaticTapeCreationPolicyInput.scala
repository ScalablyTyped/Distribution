package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAutomaticTapeCreationPolicyInput extends StObject {
  
  /**
    * An automatic tape creation policy consists of a list of automatic tape creation rules. The rules determine when and how to automatically create new tapes.
    */
  var AutomaticTapeCreationRules: typings.awsSdk.storagegatewayMod.AutomaticTapeCreationRules = js.native
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}
object UpdateAutomaticTapeCreationPolicyInput {
  
  @scala.inline
  def apply(AutomaticTapeCreationRules: AutomaticTapeCreationRules, GatewayARN: GatewayARN): UpdateAutomaticTapeCreationPolicyInput = {
    val __obj = js.Dynamic.literal(AutomaticTapeCreationRules = AutomaticTapeCreationRules.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutomaticTapeCreationPolicyInput]
  }
  
  @scala.inline
  implicit class UpdateAutomaticTapeCreationPolicyInputMutableBuilder[Self <: UpdateAutomaticTapeCreationPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticTapeCreationRules(value: AutomaticTapeCreationRules): Self = StObject.set(x, "AutomaticTapeCreationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticTapeCreationRulesVarargs(value: AutomaticTapeCreationRule*): Self = StObject.set(x, "AutomaticTapeCreationRules", js.Array(value :_*))
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
