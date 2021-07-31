package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAutomaticTapeCreationPolicyOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object UpdateAutomaticTapeCreationPolicyOutput {
  
  @scala.inline
  def apply(): UpdateAutomaticTapeCreationPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAutomaticTapeCreationPolicyOutput]
  }
  
  @scala.inline
  implicit class UpdateAutomaticTapeCreationPolicyOutputMutableBuilder[Self <: UpdateAutomaticTapeCreationPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
