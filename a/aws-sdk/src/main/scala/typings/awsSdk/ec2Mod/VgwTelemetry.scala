package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgwTelemetry extends StObject {
  
  /**
    * The number of accepted routes.
    */
  var AcceptedRouteCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time of the last change in status.
    */
  var LastStatusChange: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Internet-routable IP address of the virtual private gateway's outside interface.
    */
  var OutsideIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the VPN tunnel.
    */
  var Status: js.UndefOr[TelemetryStatus] = js.undefined
  
  /**
    * If an error occurs, a description of the error.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object VgwTelemetry {
  
  inline def apply(): VgwTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgwTelemetry]
  }
  
  extension [Self <: VgwTelemetry](x: Self) {
    
    inline def setAcceptedRouteCount(value: Integer): Self = StObject.set(x, "AcceptedRouteCount", value.asInstanceOf[js.Any])
    
    inline def setAcceptedRouteCountUndefined: Self = StObject.set(x, "AcceptedRouteCount", js.undefined)
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setLastStatusChange(value: DateTime): Self = StObject.set(x, "LastStatusChange", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeUndefined: Self = StObject.set(x, "LastStatusChange", js.undefined)
    
    inline def setOutsideIpAddress(value: String): Self = StObject.set(x, "OutsideIpAddress", value.asInstanceOf[js.Any])
    
    inline def setOutsideIpAddressUndefined: Self = StObject.set(x, "OutsideIpAddress", js.undefined)
    
    inline def setStatus(value: TelemetryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
