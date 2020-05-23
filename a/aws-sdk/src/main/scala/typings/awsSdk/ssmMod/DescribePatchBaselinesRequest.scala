package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchBaselinesRequest extends js.Object {
  /**
    * Each element in the array is a structure containing:  Key: (string, "NAME_PREFIX" or "OWNER") Value: (array of strings, exactly 1 entry, between 1 and 255 characters)
    */
  var Filters: js.UndefOr[PatchOrchestratorFilterList] = js.native
  /**
    * The maximum number of patch baselines to return (per page).
    */
  var MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object DescribePatchBaselinesRequest {
  @scala.inline
  def apply(
    Filters: PatchOrchestratorFilterList = null,
    MaxResults: js.UndefOr[PatchBaselineMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribePatchBaselinesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchBaselinesRequest]
  }
}

