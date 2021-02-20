package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpSet extends StObject {
  
  /**
    * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
    */
  var IpAddresses: js.UndefOr[typings.awsSdk.globalacceleratorMod.IpAddresses] = js.native
  
  /**
    * The types of IP addresses included in this IP set.
    */
  var IpFamily: js.UndefOr[GenericString] = js.native
}
object IpSet {
  
  @scala.inline
  def apply(): IpSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpSet]
  }
  
  @scala.inline
  implicit class IpSetMutableBuilder[Self <: IpSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddresses(value: IpAddresses): Self = StObject.set(x, "IpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressesUndefined: Self = StObject.set(x, "IpAddresses", js.undefined)
    
    @scala.inline
    def setIpAddressesVarargs(value: IpAddress*): Self = StObject.set(x, "IpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setIpFamily(value: GenericString): Self = StObject.set(x, "IpFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpFamilyUndefined: Self = StObject.set(x, "IpFamily", js.undefined)
  }
}
