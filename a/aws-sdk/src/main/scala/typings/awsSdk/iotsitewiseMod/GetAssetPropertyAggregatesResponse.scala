package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetPropertyAggregatesResponse extends js.Object {
  /**
    * The requested aggregated values.
    */
  var aggregatedValues: AggregatedValues = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAssetPropertyAggregatesResponse {
  @scala.inline
  def apply(aggregatedValues: AggregatedValues, nextToken: NextToken = null): GetAssetPropertyAggregatesResponse = {
    val __obj = js.Dynamic.literal(aggregatedValues = aggregatedValues.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyAggregatesResponse]
  }
}

