package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplatePrivateDnsNameOptions extends StObject {
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
    */
  var EnableResourceNameDnsAAAARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
    */
  var EnableResourceNameDnsARecord: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of hostname to assign to an instance.
    */
  var HostnameType: js.UndefOr[typings.awsSdk.ec2Mod.HostnameType] = js.undefined
}
object LaunchTemplatePrivateDnsNameOptions {
  
  inline def apply(): LaunchTemplatePrivateDnsNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePrivateDnsNameOptions]
  }
  
  extension [Self <: LaunchTemplatePrivateDnsNameOptions](x: Self) {
    
    inline def setEnableResourceNameDnsAAAARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsAAAARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsAAAARecord", js.undefined)
    
    inline def setEnableResourceNameDnsARecord(value: Boolean): Self = StObject.set(x, "EnableResourceNameDnsARecord", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsARecordUndefined: Self = StObject.set(x, "EnableResourceNameDnsARecord", js.undefined)
    
    inline def setHostnameType(value: HostnameType): Self = StObject.set(x, "HostnameType", value.asInstanceOf[js.Any])
    
    inline def setHostnameTypeUndefined: Self = StObject.set(x, "HostnameType", js.undefined)
  }
}
