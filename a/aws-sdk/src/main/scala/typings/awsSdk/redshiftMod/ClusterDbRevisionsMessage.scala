package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterDbRevisionsMessage extends StObject {
  
  /**
    * A list of revisions.
    */
  var ClusterDbRevisions: js.UndefOr[ClusterDbRevisionsList] = js.undefined
  
  /**
    * A string representing the starting point for the next set of revisions. If a value is returned in a response, you can retrieve the next set of revisions by providing the value in the marker parameter and retrying the command. If the marker field is empty, all revisions have already been returned.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ClusterDbRevisionsMessage {
  
  @scala.inline
  def apply(): ClusterDbRevisionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDbRevisionsMessage]
  }
  
  @scala.inline
  implicit class ClusterDbRevisionsMessageMutableBuilder[Self <: ClusterDbRevisionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterDbRevisions(value: ClusterDbRevisionsList): Self = StObject.set(x, "ClusterDbRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterDbRevisionsUndefined: Self = StObject.set(x, "ClusterDbRevisions", js.undefined)
    
    @scala.inline
    def setClusterDbRevisionsVarargs(value: ClusterDbRevision*): Self = StObject.set(x, "ClusterDbRevisions", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
