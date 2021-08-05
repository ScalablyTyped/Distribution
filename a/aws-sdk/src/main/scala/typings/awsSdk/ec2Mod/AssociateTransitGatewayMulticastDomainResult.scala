package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the transit gateway multicast domain associations.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.undefined
}
object AssociateTransitGatewayMulticastDomainResult {
  
  inline def apply(): AssociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayMulticastDomainResult]
  }
  
  extension [Self <: AssociateTransitGatewayMulticastDomainResult](x: Self) {
    
    inline def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
  }
}
