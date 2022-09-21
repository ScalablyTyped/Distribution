package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfaceIpV6AddressDetail extends StObject {
  
  /**
    * The IPV6 address.
    */
  var IpV6Address: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2NetworkInterfaceIpV6AddressDetail {
  
  inline def apply(): AwsEc2NetworkInterfaceIpV6AddressDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceIpV6AddressDetail]
  }
  
  extension [Self <: AwsEc2NetworkInterfaceIpV6AddressDetail](x: Self) {
    
    inline def setIpV6Address(value: NonEmptyString): Self = StObject.set(x, "IpV6Address", value.asInstanceOf[js.Any])
    
    inline def setIpV6AddressUndefined: Self = StObject.set(x, "IpV6Address", js.undefined)
  }
}
