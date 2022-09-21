package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfacePrivateIpAddressDetail extends StObject {
  
  /**
    * The private DNS name for the IP address.
    */
  var PrivateDnsName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IP address.
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2NetworkInterfacePrivateIpAddressDetail {
  
  inline def apply(): AwsEc2NetworkInterfacePrivateIpAddressDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfacePrivateIpAddressDetail]
  }
  
  extension [Self <: AwsEc2NetworkInterfacePrivateIpAddressDetail](x: Self) {
    
    inline def setPrivateDnsName(value: NonEmptyString): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    inline def setPrivateIpAddress(value: NonEmptyString): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
