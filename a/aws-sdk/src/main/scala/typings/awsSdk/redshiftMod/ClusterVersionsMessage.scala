package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterVersionsMessage extends StObject {
  
  /**
    * A list of Version elements. 
    */
  var ClusterVersions: js.UndefOr[ClusterVersionList] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object ClusterVersionsMessage {
  
  @scala.inline
  def apply(): ClusterVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterVersionsMessage]
  }
  
  @scala.inline
  implicit class ClusterVersionsMessageMutableBuilder[Self <: ClusterVersionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterVersions(value: ClusterVersionList): Self = StObject.set(x, "ClusterVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterVersionsUndefined: Self = StObject.set(x, "ClusterVersions", js.undefined)
    
    @scala.inline
    def setClusterVersionsVarargs(value: ClusterVersion*): Self = StObject.set(x, "ClusterVersions", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
