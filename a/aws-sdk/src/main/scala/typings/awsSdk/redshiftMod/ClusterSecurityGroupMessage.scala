package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSecurityGroupMessage extends StObject {
  
  /**
    * A list of ClusterSecurityGroup instances. 
    */
  var ClusterSecurityGroups: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroups] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object ClusterSecurityGroupMessage {
  
  @scala.inline
  def apply(): ClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class ClusterSecurityGroupMessageMutableBuilder[Self <: ClusterSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroups(value: ClusterSecurityGroups): Self = StObject.set(x, "ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "ClusterSecurityGroups", js.undefined)
    
    @scala.inline
    def setClusterSecurityGroupsVarargs(value: ClusterSecurityGroup*): Self = StObject.set(x, "ClusterSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
