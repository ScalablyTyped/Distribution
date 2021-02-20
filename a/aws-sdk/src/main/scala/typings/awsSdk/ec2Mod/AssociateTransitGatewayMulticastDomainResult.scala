package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the transit gateway multicast domain associations.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.native
}
object AssociateTransitGatewayMulticastDomainResult {
  
  @scala.inline
  def apply(): AssociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTransitGatewayMulticastDomainResult]
  }
  
  @scala.inline
  implicit class AssociateTransitGatewayMulticastDomainResultMutableBuilder[Self <: AssociateTransitGatewayMulticastDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
  }
}
