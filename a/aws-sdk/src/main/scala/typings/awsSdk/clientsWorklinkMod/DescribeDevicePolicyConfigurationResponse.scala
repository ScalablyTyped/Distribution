package typings.awsSdk.clientsWorklinkMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDevicePolicyConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceCaCertificate(value: Certificate): Self = StObject.set(x, "DeviceCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setDeviceCaCertificateUndefined: Self = StObject.set(x, "DeviceCaCertificate", js.undefined)
  }
}
