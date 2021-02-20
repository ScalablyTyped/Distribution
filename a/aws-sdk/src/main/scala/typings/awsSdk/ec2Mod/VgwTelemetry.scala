package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VgwTelemetry extends StObject {
  
  /**
    * The number of accepted routes.
    */
  var AcceptedRouteCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The date and time of the last change in status.
    */
  var LastStatusChange: js.UndefOr[DateTime] = js.native
  
  /**
    * The Internet-routable IP address of the virtual private gateway's outside interface.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The status of the VPN tunnel.
    */
  var Status: js.UndefOr[TelemetryStatus] = js.native
  
  /**
    * If an error occurs, a description of the error.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}
object VgwTelemetry {
  
  @scala.inline
  def apply(): VgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgwTelemetry]
  }
  
  @scala.inline
  implicit class VgwTelemetryMutableBuilder[Self <: VgwTelemetry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedRouteCount(value: Integer): Self = StObject.set(x, "AcceptedRouteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedRouteCountUndefined: Self = StObject.set(x, "AcceptedRouteCount", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setLastStatusChange(value: DateTime): Self = StObject.set(x, "LastStatusChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChangeUndefined: Self = StObject.set(x, "LastStatusChange", js.undefined)
    
    @scala.inline
    def setOutsideIpAddress(value: String): Self = StObject.set(x, "OutsideIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideIpAddressUndefined: Self = StObject.set(x, "OutsideIpAddress", js.undefined)
    
    @scala.inline
    def setStatus(value: TelemetryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
