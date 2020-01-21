package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * List of reserved Elasticsearch instances.
    */
  var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.native
}

object DescribeReservedElasticsearchInstancesResponse {
  @scala.inline
  def apply(NextToken: String = null, ReservedElasticsearchInstances: ReservedElasticsearchInstanceList = null): DescribeReservedElasticsearchInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ReservedElasticsearchInstances != null) __obj.updateDynamic("ReservedElasticsearchInstances")(ReservedElasticsearchInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
  }
}

