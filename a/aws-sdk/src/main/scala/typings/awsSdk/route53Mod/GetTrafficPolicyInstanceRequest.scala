package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTrafficPolicyInstanceRequest extends js.Object {
  
  /**
    * The ID of the traffic policy instance that you want to get information about.
    */
  var Id: TrafficPolicyInstanceId = js.native
}
object GetTrafficPolicyInstanceRequest {
  
  @scala.inline
  def apply(Id: TrafficPolicyInstanceId): GetTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceRequest]
  }
  
  @scala.inline
  implicit class GetTrafficPolicyInstanceRequestOps[Self <: GetTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
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
