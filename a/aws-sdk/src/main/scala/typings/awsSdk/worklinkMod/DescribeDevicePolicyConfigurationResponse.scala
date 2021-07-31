package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDevicePolicyConfigurationResponse extends StObject {
  
  /**
    * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
    */
  var DeviceCaCertificate: js.UndefOr[Certificate] = js.undefined
}
object DescribeDevicePolicyConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeDevicePolicyConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDevicePolicyConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeDevicePolicyConfigurationResponseMutableBuilder[Self <: DescribeDevicePolicyConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCaCertificate(value: Certificate): Self = StObject.set(x, "DeviceCaCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCaCertificateUndefined: Self = StObject.set(x, "DeviceCaCertificate", js.undefined)
  }
}
