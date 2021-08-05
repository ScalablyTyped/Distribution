package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayPrefixListReferenceResult extends StObject {
  
  /**
    * Information about the prefix list reference.
    */
  var TransitGatewayPrefixListReference: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPrefixListReference] = js.undefined
}
object CreateTransitGatewayPrefixListReferenceResult {
  
  inline def apply(): CreateTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPrefixListReferenceResult]
  }
  
  extension [Self <: CreateTransitGatewayPrefixListReferenceResult](x: Self) {
    
    inline def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = StObject.set(x, "TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPrefixListReferenceUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReference", js.undefined)
  }
}
