package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficMirrorFilterRuleResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorFilterRule] = js.native
}
object CreateTrafficMirrorFilterRuleResult {
  
  @scala.inline
  def apply(): CreateTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleResult]
  }
  
  @scala.inline
  implicit class CreateTrafficMirrorFilterRuleResultMutableBuilder[Self <: CreateTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = StObject.set(x, "TrafficMirrorFilterRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterRuleUndefined: Self = StObject.set(x, "TrafficMirrorFilterRule", js.undefined)
  }
}
