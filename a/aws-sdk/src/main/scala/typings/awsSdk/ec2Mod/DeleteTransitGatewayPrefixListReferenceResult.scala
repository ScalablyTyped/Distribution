package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayPrefixListReferenceResult extends StObject {
  
  /**
    * Information about the deleted prefix list reference.
    */
  var TransitGatewayPrefixListReference: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayPrefixListReference] = js.native
}
object DeleteTransitGatewayPrefixListReferenceResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPrefixListReferenceResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayPrefixListReferenceResultMutableBuilder[Self <: DeleteTransitGatewayPrefixListReferenceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = StObject.set(x, "TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayPrefixListReferenceUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReference", js.undefined)
  }
}
