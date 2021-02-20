package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the deleted transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomain] = js.native
}
object DeleteTransitGatewayMulticastDomainResult {
  
  @scala.inline
  def apply(): DeleteTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainResult]
  }
  
  @scala.inline
  implicit class DeleteTransitGatewayMulticastDomainResultMutableBuilder[Self <: DeleteTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayMulticastDomain(value: TransitGatewayMulticastDomain): Self = StObject.set(x, "TransitGatewayMulticastDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayMulticastDomainUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomain", js.undefined)
  }
}
