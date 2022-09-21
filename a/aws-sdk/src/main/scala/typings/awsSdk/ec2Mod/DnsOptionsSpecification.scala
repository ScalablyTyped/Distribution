package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsOptionsSpecification extends StObject {
  
  /**
    * The DNS records created for the endpoint.
    */
  var DnsRecordIpType: js.UndefOr[typings.awsSdk.ec2Mod.DnsRecordIpType] = js.undefined
}
object DnsOptionsSpecification {
  
  inline def apply(): DnsOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsOptionsSpecification]
  }
  
  extension [Self <: DnsOptionsSpecification](x: Self) {
    
    inline def setDnsRecordIpType(value: DnsRecordIpType): Self = StObject.set(x, "DnsRecordIpType", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordIpTypeUndefined: Self = StObject.set(x, "DnsRecordIpType", js.undefined)
  }
}
