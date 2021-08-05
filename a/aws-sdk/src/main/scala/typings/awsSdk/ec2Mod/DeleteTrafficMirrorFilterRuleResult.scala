package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorFilterRuleResult extends StObject {
  
  /**
    * The ID of the deleted Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.undefined
}
object DeleteTrafficMirrorFilterRuleResult {
  
  inline def apply(): DeleteTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRuleResult]
  }
  
  extension [Self <: DeleteTrafficMirrorFilterRuleResult](x: Self) {
    
    inline def setTrafficMirrorFilterRuleId(value: String): Self = StObject.set(x, "TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterRuleIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterRuleId", js.undefined)
  }
}
