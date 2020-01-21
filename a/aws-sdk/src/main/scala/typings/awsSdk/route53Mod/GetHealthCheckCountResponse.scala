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
}

