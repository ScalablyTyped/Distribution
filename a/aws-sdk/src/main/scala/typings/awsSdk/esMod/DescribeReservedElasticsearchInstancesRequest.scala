package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstancesRequest extends js.Object {
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.native
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
  /**
    * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the specified reserved Elasticsearch instance ID.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
}

object DescribeReservedElasticsearchInstancesRequest {
  @scala.inline
  def apply(
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    ReservedElasticsearchInstanceId: GUID = null
  ): DescribeReservedElasticsearchInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstanceId != null) __obj.updateDynamic("ReservedElasticsearchInstanceId")(ReservedElasticsearchInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
  }
}

