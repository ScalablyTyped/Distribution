package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsNameOptionsRequest extends StObject {
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
    */
  var EnableResourceNameDnsAAAARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
    */
  var EnableResourceNameDnsARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of hostname for EC2 instances. For IPv4 only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6 only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID.
    */
  var HostnameType: js.UndefOr[typings.awsSdk.ec2Mod.HostnameType] = js.undefined
}
object PrivateDnsNameOptionsRequest {
  
  inline def apply(): PrivateDnsNameOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateDnsNameOptionsRequest]
  }
  
  extension [Self <: PrivateDnsNameOptionsRequest](x: Self) {
    
    inline def setEnableResourceNameDnsAAAARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsAAAARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", js.undefined)
    
    inline def setEnableResourceNameDnsARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsARecord", js.undefined)
    
    inline def setHostnameType(value: HostnameType): Self = StObject.set(x, "HostnameType", value.asInstanceOf[js.Any])
    
    inline def setHostnameTypeUndefined: Self = StObject.set(x, "HostnameType", js.undefined)
  }
}
