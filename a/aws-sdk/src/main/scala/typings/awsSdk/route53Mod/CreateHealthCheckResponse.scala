package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains identifying information about the health check.
    */
  var HealthCheck: typings.awsSdk.route53Mod.HealthCheck = js.native
  /**
    * The unique URL representing the new health check.
    */
  var Location: ResourceURI = js.native
}

object CreateHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck, Location: ResourceURI): CreateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHealthCheckResponse]
  }
}

