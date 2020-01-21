package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  /**
    * The identifiers that match the query selectors.
    */
  var ids: js.UndefOr[idList] = js.native
  /**
    * The starting point for the next page of results. To view the next page of results, call QueryObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
}

object QueryObjectsOutput {
  @scala.inline
  def apply(hasMoreResults: js.UndefOr[Boolean] = js.undefined, ids: idList = null, marker: String = null): QueryObjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsOutput]
  }
}

