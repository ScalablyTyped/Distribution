package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficPolicyInstanceRequest extends StObject {
  
  /**
    * The ID of the traffic policy instance that you want to delete.   When you delete a traffic policy instance, Amazon Route 53 also deletes all of the resource record sets that were created when you created the traffic policy instance. 
    */
  var Id: TrafficPolicyInstanceId = js.native
}
object DeleteTrafficPolicyInstanceRequest {
  
  @scala.inline
  def apply(Id: TrafficPolicyInstanceId): DeleteTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficPolicyInstanceRequest]
  }
  
  @scala.inline
  implicit class DeleteTrafficPolicyInstanceRequestMutableBuilder[Self <: DeleteTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: TrafficPolicyInstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
