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
  
  inline def apply(): DescribeDevicePolicyConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDevicePolicyConfigurationResponse]
  }
  
  extension [Self <: DescribeDevicePolicyConfigurationResponse](x: Self) {
    
    inline def setDeviceCaCertificate(value: Certificate): Self = StObject.set(x, "DeviceCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setDeviceCaCertificateUndefined: Self = StObject.set(x, "DeviceCaCertificate", js.undefined)
  }
}
