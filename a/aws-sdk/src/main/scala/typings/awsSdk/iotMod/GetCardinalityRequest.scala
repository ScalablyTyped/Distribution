package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCardinalityRequest extends js.Object {
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The search query.
    */
  var queryString: QueryString = js.native
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}

object GetCardinalityRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    aggregationField: AggregationField = null,
    indexName: IndexName = null,
    queryVersion: QueryVersion = null
  ): GetCardinalityRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    if (aggregationField != null) __obj.updateDynamic("aggregationField")(aggregationField.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCardinalityRequest]
  }
}

