package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDevicePolicyConfigurationRequest extends StObject {
  
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[CertificateChain] = js.native
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}
object UpdateDevicePolicyConfigurationRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn): UpdateDevicePolicyConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDevicePolicyConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateDevicePolicyConfigurationRequestMutableBuilder[Self <: UpdateDevicePolicyConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCaCertificate(value: CertificateChain): Self = StObject.set(x, "DeviceCaCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCaCertificateUndefined: Self = StObject.set(x, "DeviceCaCertificate", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
