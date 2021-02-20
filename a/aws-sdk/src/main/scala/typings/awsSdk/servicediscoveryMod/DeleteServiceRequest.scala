package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteServiceRequest extends StObject {
  
  /**
    * The ID of the service that you want to delete.
    */
  var Id: ResourceId = js.native
}
object DeleteServiceRequest {
  
  @scala.inline
  def apply(Id: ResourceId): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceRequest]
  }
  
  @scala.inline
  implicit class DeleteServiceRequestMutableBuilder[Self <: DeleteServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
