package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckCountResponse extends js.Object {
  /**
    * The number of health checks associated with the current AWS account.
    */
  var HealthCheckCount: typings.awsSdk.route53Mod.HealthCheckCount = js.native
}

object GetHealthCheckCountResponse {
  @scala.inline
  def apply(HealthCheckCount: HealthCheckCount): GetHealthCheckCountResponse = {
    val __obj = js.Dynamic.literal(HealthCheckCount = HealthCheckCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckCountResponse]
  }
  @scala.inline
  implicit class GetHealthCheckCountResponseOps[Self <: GetHealthCheckCountResponse] (val x: Self) extends AnyVal {
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
    def setHealthCheckCount(value: HealthCheckCount): Self = this.set("HealthCheckCount", value.asInstanceOf[js.Any])
  }
  
}

