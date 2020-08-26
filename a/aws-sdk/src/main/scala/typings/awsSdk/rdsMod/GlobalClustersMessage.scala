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
  def apply(): GlobalClustersMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClustersMessage]
  }
  @scala.inline
  implicit class GlobalClustersMessageOps[Self <: GlobalClustersMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalClustersVarargs(value: GlobalCluster*): Self = this.set("GlobalClusters", js.Array(value :_*))
    @scala.inline
    def setGlobalClusters(value: GlobalClusterList): Self = this.set("GlobalClusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusters: Self = this.set("GlobalClusters", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

