package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionConfigurationsRequest extends js.Object {
  /**
    * The filters. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListDistributionConfigurationsRequest {
  @scala.inline
  def apply(
    filters: FilterList = null,
    maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
    nextToken: NonEmptyString = null
  ): ListDistributionConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionConfigurationsRequest]
  }
}

