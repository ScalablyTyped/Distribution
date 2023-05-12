package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceNetworkVpcAssociationRequest extends StObject {
  
  /**
    * The ID or Amazon Resource Name (ARN) of the association.
    */
  var serviceNetworkVpcAssociationIdentifier: ServiceNetworkVpcAssociationIdentifier
}
object GetServiceNetworkVpcAssociationRequest {
  
  inline def apply(serviceNetworkVpcAssociationIdentifier: ServiceNetworkVpcAssociationIdentifier): GetServiceNetworkVpcAssociationRequest = {
    val __obj = js.Dynamic.literal(serviceNetworkVpcAssociationIdentifier = serviceNetworkVpcAssociationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceNetworkVpcAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceNetworkVpcAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setServiceNetworkVpcAssociationIdentifier(value: ServiceNetworkVpcAssociationIdentifier): Self = StObject.set(x, "serviceNetworkVpcAssociationIdentifier", value.asInstanceOf[js.Any])
  }
}
