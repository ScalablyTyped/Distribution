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
  def apply(autoScalingGroups: AutoScalingGroupList = null, remoteAccessSecurityGroup: String = null): NodegroupResources = {
    val __obj = js.Dynamic.literal()
    if (autoScalingGroups != null) __obj.updateDynamic("autoScalingGroups")(autoScalingGroups.asInstanceOf[js.Any])
    if (remoteAccessSecurityGroup != null) __obj.updateDynamic("remoteAccessSecurityGroup")(remoteAccessSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodegroupResources]
  }
}

