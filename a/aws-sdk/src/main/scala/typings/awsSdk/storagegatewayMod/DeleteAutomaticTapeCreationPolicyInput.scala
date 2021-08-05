package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAutomaticTapeCreationPolicyInput extends StObject {
  
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN
}
object DeleteAutomaticTapeCreationPolicyInput {
  
  inline def apply(GatewayARN: GatewayARN): DeleteAutomaticTapeCreationPolicyInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutomaticTapeCreationPolicyInput]
  }
  
  extension [Self <: DeleteAutomaticTapeCreationPolicyInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
