package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPolicyTableResult extends StObject {
  
  /**
    * Describes the created transit gateway policy table.
    */
  var TransitGatewayPolicyTable: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPolicyTable] = js.undefined
}
object CreateTransitGatewayPolicyTableResult {
  
  inline def apply(): CreateTransitGatewayPolicyTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPolicyTableResult]
  }
  
  extension [Self <: CreateTransitGatewayPolicyTableResult](x: Self) {
    
    inline def setTransitGatewayPolicyTable(value: TransitGatewayPolicyTable): Self = StObject.set(x, "TransitGatewayPolicyTable", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableUndefined: Self = StObject.set(x, "TransitGatewayPolicyTable", js.undefined)
  }
}
