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
  
  @scala.inline
  def apply(): CreateTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayPrefixListReferenceResult]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayPrefixListReferenceResultMutableBuilder[Self <: CreateTransitGatewayPrefixListReferenceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = StObject.set(x, "TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayPrefixListReferenceUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReference", js.undefined)
  }
}
