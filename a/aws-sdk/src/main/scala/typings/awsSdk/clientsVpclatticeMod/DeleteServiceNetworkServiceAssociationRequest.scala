package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceNetworkServiceAssociationRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the association.
    */
  var serviceNetworkServiceAssociationIdentifier: ServiceNetworkServiceAssociationIdentifier
}
object DeleteServiceNetworkServiceAssociationRequest {
  
  inline def apply(serviceNetworkServiceAssociationIdentifier: ServiceNetworkServiceAssociationIdentifier): DeleteServiceNetworkServiceAssociationRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkServiceAssociationIdentifier = serviceNetworkServiceAssociationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceNetworkServiceAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceNetworkServiceAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceNetworkServiceAssociationIdentifier(value: ServiceNetworkServiceAssociationIdentifier): Self = StObject.set(x, "serviceNetworkServiceAssociationIdentifier", value.asInstanceOf[js.Any])
  }
}
