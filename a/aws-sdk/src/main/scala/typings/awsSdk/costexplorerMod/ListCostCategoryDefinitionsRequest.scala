package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCostCategoryDefinitionsRequest extends js.Object {
  /**
    *  The date when the Cost Category was effective. 
    */
  var EffectiveOn: js.UndefOr[ZonedDateTime] = js.native
  /**
    *  The number of entries a paginated response contains. 
    */
  var MaxResults: js.UndefOr[CostCategoryMaxResults] = js.native
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}

object ListCostCategoryDefinitionsRequest {
  @scala.inline
  def apply(
    EffectiveOn: ZonedDateTime = null,
    MaxResults: js.UndefOr[CostCategoryMaxResults] = js.undefined,
    NextToken: NextPageToken = null
  ): ListCostCategoryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (EffectiveOn != null) __obj.updateDynamic("EffectiveOn")(EffectiveOn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCostCategoryDefinitionsRequest]
  }
}

