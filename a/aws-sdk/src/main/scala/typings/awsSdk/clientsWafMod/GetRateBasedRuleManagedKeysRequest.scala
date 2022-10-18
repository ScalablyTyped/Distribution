package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedRuleManagedKeysRequest extends StObject {
  
  /**
    * A null value and not currently used. Do not include this in your request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafMod.NextMarker] = js.undefined
  
  /**
    * The RuleId of the RateBasedRule for which you want to get a list of ManagedKeys. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId
}
object GetRateBasedRuleManagedKeysRequest {
  
  inline def apply(RuleId: ResourceId): GetRateBasedRuleManagedKeysRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysRequest]
  }
  
  extension [Self <: GetRateBasedRuleManagedKeysRequest](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
