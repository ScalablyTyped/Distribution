package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingAction extends StObject {
  
  /**
    * Not available for instance groups. Instance groups use the market type specified for the group.
    */
  var Market: js.UndefOr[MarketType] = js.native
  
  /**
    * The type of adjustment the automatic scaling activity makes when triggered, and the periodicity of the adjustment.
    */
  var SimpleScalingPolicyConfiguration: typings.awsSdk.emrMod.SimpleScalingPolicyConfiguration = js.native
}
object ScalingAction {
  
  @scala.inline
  def apply(SimpleScalingPolicyConfiguration: SimpleScalingPolicyConfiguration): ScalingAction = {
    val __obj = js.Dynamic.literal(SimpleScalingPolicyConfiguration = SimpleScalingPolicyConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingAction]
  }
  
  @scala.inline
  implicit class ScalingActionMutableBuilder[Self <: ScalingAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    @scala.inline
    def setSimpleScalingPolicyConfiguration(value: SimpleScalingPolicyConfiguration): Self = StObject.set(x, "SimpleScalingPolicyConfiguration", value.asInstanceOf[js.Any])
  }
}
