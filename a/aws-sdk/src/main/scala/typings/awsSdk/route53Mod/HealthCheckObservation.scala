package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckObservation extends js.Object {
  /**
    * The IP address of the Amazon Route 53 health checker that provided the failure reason in StatusReport.
    */
  var IPAddress: js.UndefOr[typings.awsSdk.route53Mod.IPAddress] = js.native
  /**
    * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
    */
  var Region: js.UndefOr[HealthCheckRegion] = js.native
  /**
    * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the time of the failed health check.
    */
  var StatusReport: js.UndefOr[typings.awsSdk.route53Mod.StatusReport] = js.native
}

object HealthCheckObservation {
  @scala.inline
  def apply(): HealthCheckObservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckObservation]
  }
  @scala.inline
  implicit class HealthCheckObservationOps[Self <: HealthCheckObservation] (val x: Self) extends AnyVal {
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
    def setIPAddress(value: IPAddress): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPAddress: Self = this.set("IPAddress", js.undefined)
    @scala.inline
    def setRegion(value: HealthCheckRegion): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setStatusReport(value: StatusReport): Self = this.set("StatusReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReport: Self = this.set("StatusReport", js.undefined)
  }
  
}

