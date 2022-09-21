package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHttpNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace that you want to update.
    */
  var Id: ResourceId
  
  /**
    * Updated properties for the the HTTP namespace.
    */
  var Namespace: HttpNamespaceChange
  
  /**
    * A unique string that identifies the request and that allows failed UpdateHttpNamespace requests to be retried without the risk of running the operation twice. UpdaterRequestId can be any unique string (for example, a date/timestamp).
    */
  var UpdaterRequestId: js.UndefOr[ResourceId] = js.undefined
}
object UpdateHttpNamespaceRequest {
  
  inline def apply(Id: ResourceId, Namespace: HttpNamespaceChange): UpdateHttpNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHttpNamespaceRequest]
  }
  
  extension [Self <: UpdateHttpNamespaceRequest](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: HttpNamespaceChange): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setUpdaterRequestId(value: ResourceId): Self = StObject.set(x, "UpdaterRequestId", value.asInstanceOf[js.Any])
    
    inline def setUpdaterRequestIdUndefined: Self = StObject.set(x, "UpdaterRequestId", js.undefined)
  }
}
