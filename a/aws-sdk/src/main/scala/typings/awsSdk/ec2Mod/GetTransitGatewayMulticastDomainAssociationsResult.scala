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
  
  @scala.inline
  def apply(): GetTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayMulticastDomainAssociationsResult]
  }
  
  @scala.inline
  implicit class GetTransitGatewayMulticastDomainAssociationsResultMutableBuilder[Self <: GetTransitGatewayMulticastDomainAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMulticastDomainAssociations(value: TransitGatewayMulticastDomainAssociationList): Self = StObject.set(x, "MulticastDomainAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticastDomainAssociationsUndefined: Self = StObject.set(x, "MulticastDomainAssociations", js.undefined)
    
    @scala.inline
    def setMulticastDomainAssociationsVarargs(value: TransitGatewayMulticastDomainAssociation*): Self = StObject.set(x, "MulticastDomainAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
