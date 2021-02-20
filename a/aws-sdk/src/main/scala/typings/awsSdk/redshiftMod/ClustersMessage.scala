package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClustersMessage extends StObject {
  
  /**
    * A list of Cluster objects, where each object describes one cluster. 
    */
  var Clusters: js.UndefOr[ClusterList] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object ClustersMessage {
  
  @scala.inline
  def apply(): ClustersMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClustersMessage]
  }
  
  @scala.inline
  implicit class ClustersMessageMutableBuilder[Self <: ClustersMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: ClusterList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "Clusters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
