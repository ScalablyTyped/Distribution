package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersOutput extends js.Object {
  /**
    * The list of clusters for the account based on the given filters.
    */
  var Clusters: js.UndefOr[ClusterSummaryList] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListClustersOutput {
  @scala.inline
  def apply(Clusters: ClusterSummaryList = null, Marker: Marker = null): ListClustersOutput = {
    val __obj = js.Dynamic.literal()
    if (Clusters != null) __obj.updateDynamic("Clusters")(Clusters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersOutput]
  }
}

