package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatisticsRequest extends js.Object {
  /**
    * The aggregation field name.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  /**
    * The name of the index to search. The default value is AWS_Things.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your AWS account.
    */
  var queryString: QueryString = js.native
  /**
    * The version of the query used to search.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}

object GetStatisticsRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    aggregationField: AggregationField = null,
    indexName: IndexName = null,
    queryVersion: QueryVersion = null
  ): GetStatisticsRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    if (aggregationField != null) __obj.updateDynamic("aggregationField")(aggregationField.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatisticsRequest]
  }
}

