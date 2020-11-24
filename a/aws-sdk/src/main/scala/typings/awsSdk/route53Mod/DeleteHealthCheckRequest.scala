package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHealthCheckRequest extends js.Object {
  
  /**
    * The ID of the health check that you want to delete.
    */
  var HealthCheckId: typings.awsSdk.route53Mod.HealthCheckId = js.native
}
object DeleteHealthCheckRequest {
  
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): DeleteHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHealthCheckRequest]
  }
  
  @scala.inline
  implicit class DeleteHealthCheckRequestOps[Self <: DeleteHealthCheckRequest] (val x: Self) extends AnyVal {
    
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
    def setHealthCheckId(value: HealthCheckId): Self = this.set("HealthCheckId", value.asInstanceOf[js.Any])
  }
}
