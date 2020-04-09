package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDimensionsResponse extends js.Object {
  /**
    * A list of the names of the defined dimensions. Use DescribeDimension to get details for a dimension.
    */
  var dimensionNames: js.UndefOr[DimensionNames] = js.native
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDimensionsResponse {
  @scala.inline
  def apply(dimensionNames: DimensionNames = null, nextToken: NextToken = null): ListDimensionsResponse = {
    val __obj = js.Dynamic.literal()
    if (dimensionNames != null) __obj.updateDynamic("dimensionNames")(dimensionNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDimensionsResponse]
  }
}

