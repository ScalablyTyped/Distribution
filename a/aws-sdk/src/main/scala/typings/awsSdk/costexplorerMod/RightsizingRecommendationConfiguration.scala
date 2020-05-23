package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

