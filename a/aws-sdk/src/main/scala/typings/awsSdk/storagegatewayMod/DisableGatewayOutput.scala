package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableGatewayOutput extends StObject {
  
  /**
    * The unique Amazon Resource Name (ARN) of the disabled gateway.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object DisableGatewayOutput {
  
  inline def apply(): DisableGatewayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableGatewayOutput]
  }
  
  extension [Self <: DisableGatewayOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
