package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodegroupResources extends js.Object {
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
  implicit class NodegroupResourcesOps[Self <: NodegroupResources] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = this.set("autoScalingGroups", js.Array(value :_*))
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupList): Self = this.set("autoScalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroups: Self = this.set("autoScalingGroups", js.undefined)
    @scala.inline
    def setRemoteAccessSecurityGroup(value: String): Self = this.set("remoteAccessSecurityGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAccessSecurityGroup: Self = this.set("remoteAccessSecurityGroup", js.undefined)
  }
  
}

