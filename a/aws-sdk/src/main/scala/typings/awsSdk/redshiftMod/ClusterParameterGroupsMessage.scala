package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterParameterGroupsMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of ClusterParameterGroup instances. Each instance describes one cluster parameter group. 
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.native
}
object ClusterParameterGroupsMessage {
  
  @scala.inline
  def apply(): ClusterParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupsMessage]
  }
  
  @scala.inline
  implicit class ClusterParameterGroupsMessageMutableBuilder[Self <: ClusterParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setParameterGroups(value: ParameterGroupList): Self = StObject.set(x, "ParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupsUndefined: Self = StObject.set(x, "ParameterGroups", js.undefined)
    
    @scala.inline
    def setParameterGroupsVarargs(value: ClusterParameterGroup*): Self = StObject.set(x, "ParameterGroups", js.Array(value :_*))
  }
}
