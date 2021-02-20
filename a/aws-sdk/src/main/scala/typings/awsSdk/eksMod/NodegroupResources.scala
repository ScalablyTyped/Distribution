package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodegroupResources extends StObject {
  
  /**
    * The Auto Scaling groups associated with the node group.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.native
  
  /**
    * The remote access security group associated with the node group. This security group controls SSH access to the worker nodes.
    */
  var remoteAccessSecurityGroup: js.UndefOr[String] = js.native
}
object NodegroupResources {
  
  @scala.inline
  def apply(): NodegroupResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupResources]
  }
  
  @scala.inline
  implicit class NodegroupResourcesMutableBuilder[Self <: NodegroupResources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupList): Self = StObject.set(x, "autoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupsUndefined: Self = StObject.set(x, "autoScalingGroups", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "autoScalingGroups", js.Array(value :_*))
    
    @scala.inline
    def setRemoteAccessSecurityGroup(value: String): Self = StObject.set(x, "remoteAccessSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAccessSecurityGroupUndefined: Self = StObject.set(x, "remoteAccessSecurityGroup", js.undefined)
  }
}
