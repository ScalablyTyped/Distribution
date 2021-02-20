package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceRequest extends StObject {
  
  /**
    * The ID of the service that you want to get settings for.
    */
  var Id: ResourceId = js.native
}
object GetServiceRequest {
  
  @scala.inline
  def apply(Id: ResourceId): GetServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceRequest]
  }
  
  @scala.inline
  implicit class GetServiceRequestMutableBuilder[Self <: GetServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
