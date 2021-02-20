package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightsizingRecommendationConfiguration extends StObject {
  
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
  implicit class RightsizingRecommendationConfigurationMutableBuilder[Self <: RightsizingRecommendationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenefitsConsidered(value: GenericBoolean): Self = StObject.set(x, "BenefitsConsidered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationTarget(value: RecommendationTarget): Self = StObject.set(x, "RecommendationTarget", value.asInstanceOf[js.Any])
  }
}
