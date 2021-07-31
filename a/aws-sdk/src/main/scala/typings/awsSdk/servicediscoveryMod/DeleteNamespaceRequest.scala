package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace that you want to delete.
    */
  var Id: ResourceId
}
object DeleteNamespaceRequest {
  
  @scala.inline
  def apply(Id: ResourceId): DeleteNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceRequest]
  }
  
  @scala.inline
  implicit class DeleteNamespaceRequestMutableBuilder[Self <: DeleteNamespaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
