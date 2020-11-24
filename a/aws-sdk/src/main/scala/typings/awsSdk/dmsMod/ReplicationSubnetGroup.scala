package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationSubnetGroup extends js.Object {
  
  /**
    * A description for the replication subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  
  /**
    * The subnets that are in the subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object ReplicationSubnetGroup {
  
  @scala.inline
  def apply(): ReplicationSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationSubnetGroup]
  }
  
  @scala.inline
  implicit class ReplicationSubnetGroupOps[Self <: ReplicationSubnetGroup] (val x: Self) extends AnyVal {
    
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
    def setReplicationSubnetGroupDescription(value: String): Self = this.set("ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroupDescription: Self = this.set("ReplicationSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroupIdentifier(value: String): Self = this.set("ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationSubnetGroupIdentifier: Self = this.set("ReplicationSubnetGroupIdentifier", js.undefined)
    
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
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
