package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersResponse extends js.Object {
  /**
    * The descriptions of your DAX clusters, in response to a DescribeClusters request.
    */
  var Clusters: js.UndefOr[ClusterList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeClustersResponse {
  @scala.inline
  def apply(Clusters: ClusterList = null, NextToken: String = null): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (Clusters != null) __obj.updateDynamic("Clusters")(Clusters.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClustersResponse]
  }
}

