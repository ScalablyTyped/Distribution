package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains the response to an UpdateHealthCheck request.
    */
  var HealthCheck: typings.awsSdk.route53Mod.HealthCheck = js.native
}

object UpdateHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck): UpdateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHealthCheckResponse]
  }
  @scala.inline
  implicit class UpdateHealthCheckResponseOps[Self <: UpdateHealthCheckResponse] (val x: Self) extends AnyVal {
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
    def setHealthCheck(value: HealthCheck): Self = this.set("HealthCheck", value.asInstanceOf[js.Any])
  }
  
}

