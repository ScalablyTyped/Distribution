package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEcsClustersResult extends js.Object {
  /**
    * A list of EcsCluster objects containing the cluster descriptions.
    */
  var EcsClusters: js.UndefOr[typings.awsSdk.opsworksMod.EcsClusters] = js.native
  /**
    * If a paginated request does not return all of the remaining results, this parameter is set to a token that you can assign to the request object's NextToken parameter to retrieve the next set of results. If the previous paginated request returned all of the remaining results, this parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEcsClustersResult {
  @scala.inline
  def apply(EcsClusters: EcsClusters = null, NextToken: String = null): DescribeEcsClustersResult = {
    val __obj = js.Dynamic.literal()
    if (EcsClusters != null) __obj.updateDynamic("EcsClusters")(EcsClusters.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEcsClustersResult]
  }
}

