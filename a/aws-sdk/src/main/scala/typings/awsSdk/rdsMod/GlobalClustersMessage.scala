package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalClustersMessage extends js.Object {
  /**
    *  The list of global clusters returned by this request. 
    */
  var GlobalClusters: js.UndefOr[GlobalClusterList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeGlobalClusters request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object GlobalClustersMessage {
  @scala.inline
  def apply(GlobalClusters: GlobalClusterList = null, Marker: String = null): GlobalClustersMessage = {
    val __obj = js.Dynamic.literal()
    if (GlobalClusters != null) __obj.updateDynamic("GlobalClusters")(GlobalClusters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalClustersMessage]
  }
}

