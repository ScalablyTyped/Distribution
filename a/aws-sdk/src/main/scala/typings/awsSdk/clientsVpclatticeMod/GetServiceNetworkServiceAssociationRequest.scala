package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceNetworkServiceAssociationRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the association.
    */
  var serviceNetworkServiceAssociationIdentifier: ServiceNetworkServiceAssociationIdentifier
}
object GetServiceNetworkServiceAssociationRequest {
  
  inline def apply(serviceNetworkServiceAssociationIdentifier: ServiceNetworkServiceAssociationIdentifier): GetServiceNetworkServiceAssociationRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkServiceAssociationIdentifier = serviceNetworkServiceAssociationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceNetworkServiceAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceNetworkServiceAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceNetworkServiceAssociationIdentifier(value: ServiceNetworkServiceAssociationIdentifier): Self = StObject.set(x, "serviceNetworkServiceAssociationIdentifier", value.asInstanceOf[js.Any])
  }
}
