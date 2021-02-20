package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRateBasedRuleManagedKeysResponse extends StObject {
  
  /**
    * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
    */
  var ManagedKeys: js.UndefOr[typings.awsSdk.wafMod.ManagedKeys] = js.native
  
  /**
    * A null value and not currently used.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
}
object GetRateBasedRuleManagedKeysResponse {
  
  @scala.inline
  def apply(): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
  
  @scala.inline
  implicit class GetRateBasedRuleManagedKeysResponseMutableBuilder[Self <: GetRateBasedRuleManagedKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedKeys(value: ManagedKeys): Self = StObject.set(x, "ManagedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedKeysUndefined: Self = StObject.set(x, "ManagedKeys", js.undefined)
    
    @scala.inline
    def setManagedKeysVarargs(value: ManagedKey*): Self = StObject.set(x, "ManagedKeys", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
