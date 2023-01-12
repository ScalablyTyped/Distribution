package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedRuleManagedKeysResponse extends StObject {
  
  /**
    * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
    */
  var ManagedKeys: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ManagedKeys] = js.undefined
  
  /**
    * A null value and not currently used.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
}
object GetRateBasedRuleManagedKeysResponse {
  
  inline def apply(): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRateBasedRuleManagedKeysResponse] (val x: Self) extends AnyVal {
    
    inline def setManagedKeys(value: ManagedKeys): Self = StObject.set(x, "ManagedKeys", value.asInstanceOf[js.Any])
    
    inline def setManagedKeysUndefined: Self = StObject.set(x, "ManagedKeys", js.undefined)
    
    inline def setManagedKeysVarargs(value: ManagedKey*): Self = StObject.set(x, "ManagedKeys", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
