package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckStatusResponse extends js.Object {
  /**
    * A list that contains one HealthCheckObservation element for each Amazon Route 53 health checker that is reporting a status about the health check endpoint.
    */
  var HealthCheckObservations: typings.awsSdk.route53Mod.HealthCheckObservations = js.native
}

object GetHealthCheckStatusResponse {
  @scala.inline
  def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckStatusResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckStatusResponse]
  }
}

