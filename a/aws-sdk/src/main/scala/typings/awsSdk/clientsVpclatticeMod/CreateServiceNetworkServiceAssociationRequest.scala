package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceNetworkServiceAssociationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network. You must use the ARN if the resources specified in the operation are in different accounts.
    */
  var serviceNetworkIdentifier: ServiceNetworkIdentifier
  
  /**
    * The tags for the association.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateServiceNetworkServiceAssociationRequest {
  
  inline def apply(serviceIdentifier: ServiceIdentifier, serviceNetworkIdentifier: ServiceNetworkIdentifier): CreateServiceNetworkServiceAssociationRequest = {
    val __obj = js.Dynamic.literal(serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], serviceNetworkIdentifier = serviceNetworkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceNetworkServiceAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceNetworkServiceAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkIdentifier(value: ServiceNetworkIdentifier): Self = StObject.set(x, "serviceNetworkIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
