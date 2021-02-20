package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckObservation extends StObject {
  
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
  implicit class HealthCheckObservationMutableBuilder[Self <: HealthCheckObservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPAddress(value: IPAddress): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    @scala.inline
    def setRegion(value: HealthCheckRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setStatusReport(value: StatusReport): Self = StObject.set(x, "StatusReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReportUndefined: Self = StObject.set(x, "StatusReport", js.undefined)
  }
}
