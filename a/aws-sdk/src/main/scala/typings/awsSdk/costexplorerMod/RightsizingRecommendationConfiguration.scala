package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightsizingRecommendationConfiguration extends js.Object {
  
  /**
    *  The option to consider RI or Savings Plans discount benefits in your savings calculation. The default value is TRUE. 
    */
  var BenefitsConsidered: GenericBoolean = js.native
  
  /**
    *  The option to see recommendations within the same instance family, or recommendations for instances across other families. The default value is SAME_INSTANCE_FAMILY. 
    */
  var RecommendationTarget: typings.awsSdk.costexplorerMod.RecommendationTarget = js.native
}
object RightsizingRecommendationConfiguration {
  
  @scala.inline
  def apply(BenefitsConsidered: GenericBoolean, RecommendationTarget: RecommendationTarget): RightsizingRecommendationConfiguration = {
    val __obj = js.Dynamic.literal(BenefitsConsidered = BenefitsConsidered.asInstanceOf[js.Any], RecommendationTarget = RecommendationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightsizingRecommendationConfiguration]
  }
  
  @scala.inline
  implicit class RightsizingRecommendationConfigurationOps[Self <: RightsizingRecommendationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBenefitsConsidered(value: GenericBoolean): Self = this.set("BenefitsConsidered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationTarget(value: RecommendationTarget): Self = this.set("RecommendationTarget", value.asInstanceOf[js.Any])
  }
}
