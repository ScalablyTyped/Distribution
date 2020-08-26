package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckStatusRequest extends js.Object {
  /**
    * The ID for the health check that you want the current status for. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.  If you want to check the status of a calculated health check, you must use the Amazon Route 53 console or the CloudWatch console. You can't use GetHealthCheckStatus to get the status of a calculated health check. 
    */
  var HealthCheckId: typings.awsSdk.route53Mod.HealthCheckId = js.native
}

object GetHealthCheckStatusRequest {
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): GetHealthCheckStatusRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckStatusRequest]
  }
  @scala.inline
  implicit class GetHealthCheckStatusRequestOps[Self <: GetHealthCheckStatusRequest] (val x: Self) extends AnyVal {
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

