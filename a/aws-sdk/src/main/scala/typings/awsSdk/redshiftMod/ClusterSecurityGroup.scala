package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSecurityGroup extends js.Object {
  
  /**
    * The name of the cluster security group to which the operation was applied.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * A description of the security group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * A list of EC2 security groups that are permitted to access clusters associated with this cluster security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  
  /**
    * A list of IP ranges (CIDR blocks) that are permitted to access clusters associated with this cluster security group.
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  
  /**
    * The list of tags for the cluster security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ClusterSecurityGroup {
  
  @scala.inline
  def apply(): ClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroup]
  }
  
  @scala.inline
  implicit class ClusterSecurityGroupOps[Self <: ClusterSecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setClusterSecurityGroupName(value: String): Self = this.set("ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecurityGroupName: Self = this.set("ClusterSecurityGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = this.set("EC2SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = this.set("EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEC2SecurityGroups: Self = this.set("EC2SecurityGroups", js.undefined)
    
    @scala.inline
    def setIPRangesVarargs(value: IPRange*): Self = this.set("IPRanges", js.Array(value :_*))
    
    @scala.inline
    def setIPRanges(value: IPRangeList): Self = this.set("IPRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPRanges: Self = this.set("IPRanges", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
