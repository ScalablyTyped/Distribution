package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightsizingRecommendation extends js.Object {
  /**
    * The account that this recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    *  Context regarding the current instance.
    */
  var CurrentInstance: js.UndefOr[typings.awsSdk.costexplorerMod.CurrentInstance] = js.native
  /**
    *  Details for modification recommendations. 
    */
  var ModifyRecommendationDetail: js.UndefOr[typings.awsSdk.costexplorerMod.ModifyRecommendationDetail] = js.native
  /**
    * Recommendation to either terminate or modify the resource.
    */
  var RightsizingType: js.UndefOr[typings.awsSdk.costexplorerMod.RightsizingType] = js.native
  /**
    * Details for termination recommendations.
    */
  var TerminateRecommendationDetail: js.UndefOr[typings.awsSdk.costexplorerMod.TerminateRecommendationDetail] = js.native
}

object RightsizingRecommendation {
  @scala.inline
  def apply(
    AccountId: GenericString = null,
    CurrentInstance: CurrentInstance = null,
    ModifyRecommendationDetail: ModifyRecommendationDetail = null,
    RightsizingType: RightsizingType = null,
    TerminateRecommendationDetail: TerminateRecommendationDetail = null
  ): RightsizingRecommendation = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (CurrentInstance != null) __obj.updateDynamic("CurrentInstance")(CurrentInstance.asInstanceOf[js.Any])
    if (ModifyRecommendationDetail != null) __obj.updateDynamic("ModifyRecommendationDetail")(ModifyRecommendationDetail.asInstanceOf[js.Any])
    if (RightsizingType != null) __obj.updateDynamic("RightsizingType")(RightsizingType.asInstanceOf[js.Any])
    if (TerminateRecommendationDetail != null) __obj.updateDynamic("TerminateRecommendationDetail")(TerminateRecommendationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightsizingRecommendation]
  }
}

