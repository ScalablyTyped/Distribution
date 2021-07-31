package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupUpdateStatus extends StObject {
  
  /**
    * The ID of the node group
    */
  var NodeGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update on the node group member
    */
  var NodeGroupMemberUpdateStatus: js.UndefOr[NodeGroupMemberUpdateStatusList] = js.undefined
}
object NodeGroupUpdateStatus {
  
  @scala.inline
  def apply(): NodeGroupUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupUpdateStatus]
  }
  
  @scala.inline
  implicit class NodeGroupUpdateStatusMutableBuilder[Self <: NodeGroupUpdateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeGroupId(value: String): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupIdUndefined: Self = StObject.set(x, "NodeGroupId", js.undefined)
    
    @scala.inline
    def setNodeGroupMemberUpdateStatus(value: NodeGroupMemberUpdateStatusList): Self = StObject.set(x, "NodeGroupMemberUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupMemberUpdateStatusUndefined: Self = StObject.set(x, "NodeGroupMemberUpdateStatus", js.undefined)
    
    @scala.inline
    def setNodeGroupMemberUpdateStatusVarargs(value: NodeGroupMemberUpdateStatus*): Self = StObject.set(x, "NodeGroupMemberUpdateStatus", js.Array(value :_*))
  }
}
