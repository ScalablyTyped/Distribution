package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePublicDnsNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace being updated.
    */
  var Id: ResourceId
  
  /**
    * Updated properties for the public DNS namespace.
    */
  var Namespace: PublicDnsNamespaceChange
  
  /**
    * A unique string that identifies the request and that allows failed UpdatePublicDnsNamespace requests to be retried without the risk of running the operation twice. UpdaterRequestId can be any unique string (for example, a date/timestamp).
    */
  var UpdaterRequestId: js.UndefOr[ResourceId] = js.undefined
}
object UpdatePublicDnsNamespaceRequest {
  
  inline def apply(Id: ResourceId, Namespace: PublicDnsNamespaceChange): UpdatePublicDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicDnsNamespaceRequest]
  }
  
  extension [Self <: UpdatePublicDnsNamespaceRequest](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PublicDnsNamespaceChange): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setUpdaterRequestId(value: ResourceId): Self = StObject.set(x, "UpdaterRequestId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterRequestIdUndefined: Self = StObject.set(x, "UpdaterRequestId", js.undefined)
  }
}
