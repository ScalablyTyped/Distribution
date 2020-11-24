package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ListClustersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersOutput]
  }
  
  @scala.inline
  implicit class ListClustersOutputOps[Self <: ListClustersOutput] (val x: Self) extends AnyVal {
    
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
    def setClustersVarargs(value: ClusterSummary*): Self = this.set("Clusters", js.Array(value :_*))
    
    @scala.inline
    def setClusters(value: ClusterSummaryList): Self = this.set("Clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusters: Self = this.set("Clusters", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
