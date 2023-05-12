package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceNetworkVpcAssociationRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the association.
    */
  var serviceNetworkVpcAssociationIdentifier: ServiceNetworkVpcAssociationIdentifier
}
object DeleteServiceNetworkVpcAssociationRequest {
  
  inline def apply(serviceNetworkVpcAssociationIdentifier: ServiceNetworkVpcAssociationIdentifier): DeleteServiceNetworkVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkVpcAssociationIdentifier = serviceNetworkVpcAssociationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceNetworkVpcAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceNetworkVpcAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceNetworkVpcAssociationIdentifier(value: ServiceNetworkVpcAssociationIdentifier): Self = StObject.set(x, "serviceNetworkVpcAssociationIdentifier", value.asInstanceOf[js.Any])
  }
}
