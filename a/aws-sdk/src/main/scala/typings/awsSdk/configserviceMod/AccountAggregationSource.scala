package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAggregationSource extends js.Object {
  /**
    * The 12-digit account ID of the account being aggregated. 
    */
  var AccountIds: AccountAggregationSourceAccountList = js.native
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.native
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.native
}

object AccountAggregationSource {
  @scala.inline
  def apply(
    AccountIds: AccountAggregationSourceAccountList,
    AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
    AwsRegions: AggregatorRegionList = null
  ): AccountAggregationSource = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    if (!js.isUndefined(AllAwsRegions)) __obj.updateDynamic("AllAwsRegions")(AllAwsRegions.get.asInstanceOf[js.Any])
    if (AwsRegions != null) __obj.updateDynamic("AwsRegions")(AwsRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAggregationSource]
  }
}

