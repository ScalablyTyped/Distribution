package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayMulticastDomainAssociationsResult extends StObject {
  
  /**
    * Information about the multicast domain associations.
    */
  var MulticastDomainAssociations: js.UndefOr[TransitGatewayMulticastDomainAssociationList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetTransitGatewayMulticastDomainAssociationsResult {
  
  inline def apply(): GetTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayMulticastDomainAssociationsResult]
  }
  
  extension [Self <: GetTransitGatewayMulticastDomainAssociationsResult](x: Self) {
    
    inline def setMulticastDomainAssociations(value: TransitGatewayMulticastDomainAssociationList): Self = StObject.set(x, "MulticastDomainAssociations", value.asInstanceOf[js.Any])
    
    inline def setMulticastDomainAssociationsUndefined: Self = StObject.set(x, "MulticastDomainAssociations", js.undefined)
    
    inline def setMulticastDomainAssociationsVarargs(value: TransitGatewayMulticastDomainAssociation*): Self = StObject.set(x, "MulticastDomainAssociations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
