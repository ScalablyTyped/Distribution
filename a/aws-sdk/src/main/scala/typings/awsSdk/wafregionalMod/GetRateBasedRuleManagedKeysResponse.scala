package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedRuleManagedKeysResponse extends StObject {
  
  /**
    * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
    */
  var ManagedKeys: js.UndefOr[typings.awsSdk.wafregionalMod.ManagedKeys] = js.undefined
  
  /**
    * A null value and not currently used.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
}
object GetRateBasedRuleManagedKeysResponse {
  
  inline def apply(): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
  
  extension [Self <: GetRateBasedRuleManagedKeysResponse](x: Self) {
    
    inline def setManagedKeys(value: ManagedKeys): Self = StObject.set(x, "ManagedKeys", value.asInstanceOf[js.Any])
    
    inline def setManagedKeysUndefined: Self = StObject.set(x, "ManagedKeys", js.undefined)
    
    inline def setManagedKeysVarargs(value: ManagedKey*): Self = StObject.set(x, "ManagedKeys", js.Array(value :_*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
