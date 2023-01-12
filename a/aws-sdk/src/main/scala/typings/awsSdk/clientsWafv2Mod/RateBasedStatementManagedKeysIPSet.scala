package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateBasedStatementManagedKeysIPSet extends StObject {
  
  /**
    * The IP addresses that are currently blocked.
    */
  var Addresses: js.UndefOr[IPAddresses] = js.undefined
  
  /**
    * The version of the IP addresses, either IPV4 or IPV6. 
    */
  var IPAddressVersion: js.UndefOr[typings.awsSdk.clientsWafv2Mod.IPAddressVersion] = js.undefined
}
object RateBasedStatementManagedKeysIPSet {
  
  inline def apply(): RateBasedStatementManagedKeysIPSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateBasedStatementManagedKeysIPSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RateBasedStatementManagedKeysIPSet] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: IPAddresses): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setAddressesVarargs(value: IPAddress*): Self = StObject.set(x, "Addresses", js.Array(value*))
    
    inline def setIPAddressVersion(value: IPAddressVersion): Self = StObject.set(x, "IPAddressVersion", value.asInstanceOf[js.Any])
    
    inline def setIPAddressVersionUndefined: Self = StObject.set(x, "IPAddressVersion", js.undefined)
  }
}
