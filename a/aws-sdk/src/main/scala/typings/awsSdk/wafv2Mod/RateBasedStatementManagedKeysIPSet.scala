package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateBasedStatementManagedKeysIPSet extends StObject {
  
  /**
    * The IP addresses that are currently blocked.
    */
  var Addresses: js.UndefOr[IPAddresses] = js.undefined
  
  var IPAddressVersion: js.UndefOr[typings.awsSdk.wafv2Mod.IPAddressVersion] = js.undefined
}
object RateBasedStatementManagedKeysIPSet {
  
  @scala.inline
  def apply(): RateBasedStatementManagedKeysIPSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateBasedStatementManagedKeysIPSet]
  }
  
  @scala.inline
  implicit class RateBasedStatementManagedKeysIPSetMutableBuilder[Self <: RateBasedStatementManagedKeysIPSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: IPAddresses): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: IPAddress*): Self = StObject.set(x, "Addresses", js.Array(value :_*))
    
    @scala.inline
    def setIPAddressVersion(value: IPAddressVersion): Self = StObject.set(x, "IPAddressVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddressVersionUndefined: Self = StObject.set(x, "IPAddressVersion", js.undefined)
  }
}
