package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceRequest extends StObject {
  
  /**
    * The ID of the service that you want to update.
    */
  var Id: ResourceId = js.native
  
  /**
    * A complex type that contains the new settings for the service.
    */
  var Service: ServiceChange = js.native
}
object UpdateServiceRequest {
  
  @scala.inline
  def apply(Id: ResourceId, Service: ServiceChange): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  
  @scala.inline
  implicit class UpdateServiceRequestMutableBuilder[Self <: UpdateServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: ServiceChange): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
