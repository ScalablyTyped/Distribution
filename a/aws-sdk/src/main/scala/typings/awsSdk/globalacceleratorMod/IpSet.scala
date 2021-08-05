package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpSet extends StObject {
  
  /**
    * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
    */
  var IpAddresses: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddresses] = js.undefined
  
  /**
    * The types of IP addresses included in this IP set.
    */
  var IpFamily: js.UndefOr[GenericString] = js.undefined
}
object IpSet {
  
  inline def apply(): IpSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpSet]
  }
  
  extension [Self <: IpSet](x: Self) {
    
    inline def setIpAddresses(value: IpAddresses): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "IpAddresses", js.Array(value :_*))
    
    inline def setIpFamily(value: GenericString): Self = StObject.set(x, "IpFamily", value.asInstanceOf[js.Any])
    
    inline def setIpFamilyUndefined: Self = StObject.set(x, "IpFamily", js.undefined)
  }
}
