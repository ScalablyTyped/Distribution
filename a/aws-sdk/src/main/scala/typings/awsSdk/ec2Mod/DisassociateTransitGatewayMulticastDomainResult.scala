package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the association.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.undefined
}
object DisassociateTransitGatewayMulticastDomainResult {
  
  @scala.inline
  def apply(): DisassociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainResult]
  }
  
  @scala.inline
  implicit class DisassociateTransitGatewayMulticastDomainResultMutableBuilder[Self <: DisassociateTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
  }
}
