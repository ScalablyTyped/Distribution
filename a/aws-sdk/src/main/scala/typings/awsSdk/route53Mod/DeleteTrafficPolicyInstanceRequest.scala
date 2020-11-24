package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficPolicyInstanceRequest extends js.Object {
  
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
  implicit class DeleteTrafficPolicyInstanceRequestOps[Self <: DeleteTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: TrafficPolicyInstanceId): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
}
