package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticGpusResult extends js.Object {
  /**
    * Information about the Elastic Graphics accelerators.
    */
  var ElasticGpuSet: js.UndefOr[typings.awsSdk.ec2Mod.ElasticGpuSet] = js.native
  /**
    * The total number of items to return. If the total number of items available is more than the value specified in max-items then a Next-Token will be provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeElasticGpusResult {
  @scala.inline
  def apply(
    ElasticGpuSet: ElasticGpuSet = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): DescribeElasticGpusResult = {
    val __obj = js.Dynamic.literal()
    if (ElasticGpuSet != null) __obj.updateDynamic("ElasticGpuSet")(ElasticGpuSet.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticGpusResult]
  }
}

