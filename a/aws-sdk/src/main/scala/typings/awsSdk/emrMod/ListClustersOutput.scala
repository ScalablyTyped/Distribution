package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClustersOutput extends StObject {
  
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
  implicit class ListClustersOutputMutableBuilder[Self <: ListClustersOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: ClusterSummaryList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: ClusterSummary*): Self = StObject.set(x, "Clusters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
