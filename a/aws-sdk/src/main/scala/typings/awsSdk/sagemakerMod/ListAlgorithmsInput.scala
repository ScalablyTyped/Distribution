package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAlgorithmsInput extends js.Object {
  /**
    * A filter that returns only algorithms created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns only algorithms created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.native
  /**
    * The maximum number of algorithms to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
    */
  var NameContains: js.UndefOr[typings.awsSdk.sagemakerMod.NameContains] = js.native
  /**
    * If the response to a previous ListAlgorithms request was truncated, the response includes a NextToken. To retrieve the next set of algorithms, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The parameter by which to sort the results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[AlgorithmSortBy] = js.native
  /**
    * The sort order for the results. The default is Ascending.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.sagemakerMod.SortOrder] = js.native
}

object ListAlgorithmsInput {
  @scala.inline
  def apply(
    CreationTimeAfter: CreationTime = null,
    CreationTimeBefore: CreationTime = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NameContains: NameContains = null,
    NextToken: NextToken = null,
    SortBy: AlgorithmSortBy = null,
    SortOrder: SortOrder = null
  ): ListAlgorithmsInput = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlgorithmsInput]
  }
}

