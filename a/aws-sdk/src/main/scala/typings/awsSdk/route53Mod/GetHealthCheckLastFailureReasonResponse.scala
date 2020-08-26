package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckLastFailureReasonResponse extends js.Object {
  /**
    * A list that contains one Observation element for each Amazon Route 53 health checker that is reporting a last failure reason. 
    */
  var HealthCheckObservations: typings.awsSdk.route53Mod.HealthCheckObservations = js.native
}

object GetHealthCheckLastFailureReasonResponse {
  @scala.inline
  def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckLastFailureReasonResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckLastFailureReasonResponse]
  }
  @scala.inline
  implicit class GetHealthCheckLastFailureReasonResponseOps[Self <: GetHealthCheckLastFailureReasonResponse] (val x: Self) extends AnyVal {
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
    def setHealthCheckObservationsVarargs(value: HealthCheckObservation*): Self = this.set("HealthCheckObservations", js.Array(value :_*))
    @scala.inline
    def setHealthCheckObservations(value: HealthCheckObservations): Self = this.set("HealthCheckObservations", value.asInstanceOf[js.Any])
  }
  
}

