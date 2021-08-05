package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTrafficMirrorFilterRuleResult extends StObject {
  
  /**
    * Modifies a Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorFilterRule] = js.undefined
}
object ModifyTrafficMirrorFilterRuleResult {
  
  inline def apply(): ModifyTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleResult]
  }
  
  extension [Self <: ModifyTrafficMirrorFilterRuleResult](x: Self) {
    
    inline def setTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = StObject.set(x, "TrafficMirrorFilterRule", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterRuleUndefined: Self = StObject.set(x, "TrafficMirrorFilterRule", js.undefined)
  }
}
