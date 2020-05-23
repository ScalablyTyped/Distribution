package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationAggregationSource extends js.Object {
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.native
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.native
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var RoleArn: String = js.native
}

object OrganizationAggregationSource {
  @scala.inline
  def apply(
    RoleArn: String,
    AllAwsRegions: js.UndefOr[Boolean] = js.undefined,
    AwsRegions: AggregatorRegionList = null
  ): OrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(AllAwsRegions)) __obj.updateDynamic("AllAwsRegions")(AllAwsRegions.get.asInstanceOf[js.Any])
    if (AwsRegions != null) __obj.updateDynamic("AwsRegions")(AwsRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAggregationSource]
  }
}

