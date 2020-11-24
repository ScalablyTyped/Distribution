package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficPolicyRequest extends js.Object {
  
  /**
    * The ID of the traffic policy that you want to delete.
    */
  var Id: TrafficPolicyId = js.native
  
  /**
    * The version number of the traffic policy that you want to delete.
    */
  var Version: TrafficPolicyVersion = js.native
}
object DeleteTrafficPolicyRequest {
  
  @scala.inline
  def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): DeleteTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteTrafficPolicyRequestOps[Self <: DeleteTrafficPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: TrafficPolicyId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: TrafficPolicyVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
