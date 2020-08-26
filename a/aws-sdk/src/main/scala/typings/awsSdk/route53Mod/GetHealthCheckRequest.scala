package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckRequest extends js.Object {
  /**
    * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long.
    */
  var HealthCheckId: typings.awsSdk.route53Mod.HealthCheckId = js.native
}

object GetHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): GetHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckRequest]
  }
  @scala.inline
  implicit class GetHealthCheckRequestOps[Self <: GetHealthCheckRequest] (val x: Self) extends AnyVal {
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

