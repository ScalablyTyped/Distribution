package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayMulticastDomain] = js.native
}
object CreateTransitGatewayMulticastDomainResult {
  
  @scala.inline
  def apply(): CreateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainResult]
  }
  
  @scala.inline
  implicit class CreateTransitGatewayMulticastDomainResultMutableBuilder[Self <: CreateTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransitGatewayMulticastDomain(value: TransitGatewayMulticastDomain): Self = StObject.set(x, "TransitGatewayMulticastDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayMulticastDomainUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomain", js.undefined)
  }
}
