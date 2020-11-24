package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSubnetGroup extends js.Object {
  
  /**
    * The name of the cluster subnet group.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * The description of the cluster subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The status of the cluster subnet group. Possible values are Complete, Incomplete and Invalid. 
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  
  /**
    * A list of the VPC Subnet elements. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  
  /**
    * The list of tags for the cluster subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The VPC ID of the cluster subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object ClusterSubnetGroup {
  
  @scala.inline
  def apply(): ClusterSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSubnetGroup]
  }
  
  @scala.inline
  implicit class ClusterSubnetGroupOps[Self <: ClusterSubnetGroup] (val x: Self) extends AnyVal {
    
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
    def setClusterSubnetGroupName(value: String): Self = this.set("ClusterSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSubnetGroupName: Self = this.set("ClusterSubnetGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setSubnetGroupStatus(value: String): Self = this.set("SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroupStatus: Self = this.set("SubnetGroupStatus", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: Subnet*): Self = this.set("Subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: SubnetList): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
