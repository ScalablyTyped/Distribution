package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDevicePolicyConfigurationRequest extends StObject {
  
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[CertificateChain] = js.undefined
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object UpdateDevicePolicyConfigurationRequest {
  
  inline def apply(FleetArn: FleetArn): UpdateDevicePolicyConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePolicyConfigurationRequest]
  }
  
  extension [Self <: UpdateDevicePolicyConfigurationRequest](x: Self) {
    
    inline def setDeviceCaCertificate(value: CertificateChain): Self = StObject.set(x, "DeviceCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setDeviceCaCertificateUndefined: Self = StObject.set(x, "DeviceCaCertificate", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
