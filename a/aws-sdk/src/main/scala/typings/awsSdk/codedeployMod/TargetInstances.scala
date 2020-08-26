package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstances extends js.Object {
  /**
    * The names of one or more Auto Scaling groups to identify a replacement environment for a blue/green deployment.
    */
  var autoScalingGroups: js.UndefOr[AutoScalingGroupNameList] = js.native
  /**
    * Information about the groups of EC2 instance tags that an instance must be identified by in order for it to be included in the replacement environment for a blue/green deployment. Cannot be used in the same call as tagFilters.
    */
  var ec2TagSet: js.UndefOr[EC2TagSet] = js.native
  /**
    * The tag filter key, type, and value used to identify Amazon EC2 instances in a replacement environment for a blue/green deployment. Cannot be used in the same call as ec2TagSet.
    */
  var tagFilters: js.UndefOr[EC2TagFilterList] = js.native
}

object TargetInstances {
  @scala.inline
  def apply(): TargetInstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstances]
  }
  @scala.inline
  implicit class TargetInstancesOps[Self <: TargetInstances] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingGroupsVarargs(value: AutoScalingGroupName*): Self = this.set("autoScalingGroups", js.Array(value :_*))
    @scala.inline
    def setAutoScalingGroups(value: AutoScalingGroupNameList): Self = this.set("autoScalingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroups: Self = this.set("autoScalingGroups", js.undefined)
    @scala.inline
    def setEc2TagSet(value: EC2TagSet): Self = this.set("ec2TagSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2TagSet: Self = this.set("ec2TagSet", js.undefined)
    @scala.inline
    def setTagFiltersVarargs(value: EC2TagFilter*): Self = this.set("tagFilters", js.Array(value :_*))
    @scala.inline
    def setTagFilters(value: EC2TagFilterList): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
  }
  
}

