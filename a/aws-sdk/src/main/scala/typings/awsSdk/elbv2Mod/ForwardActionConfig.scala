package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardActionConfig extends StObject {
  
  /**
    * The target group stickiness for the rule.
    */
  var TargetGroupStickinessConfig: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupStickinessConfig] = js.undefined
  
  /**
    * One or more target groups. For Network Load Balancers, you can specify a single target group.
    */
  var TargetGroups: js.UndefOr[TargetGroupList] = js.undefined
}
object ForwardActionConfig {
  
  inline def apply(): ForwardActionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardActionConfig]
  }
  
  extension [Self <: ForwardActionConfig](x: Self) {
    
    inline def setTargetGroupStickinessConfig(value: TargetGroupStickinessConfig): Self = StObject.set(x, "TargetGroupStickinessConfig", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupStickinessConfigUndefined: Self = StObject.set(x, "TargetGroupStickinessConfig", js.undefined)
    
    inline def setTargetGroups(value: TargetGroupList): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    inline def setTargetGroupsVarargs(value: TargetGroupTuple*): Self = StObject.set(x, "TargetGroups", js.Array(value :_*))
  }
}
