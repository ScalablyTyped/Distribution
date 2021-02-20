package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationSubnetGroup extends StObject {
  
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
  implicit class ReplicationSubnetGroupMutableBuilder[Self <: ReplicationSubnetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationSubnetGroupDescription(value: String): Self = StObject.set(x, "ReplicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupDescriptionUndefined: Self = StObject.set(x, "ReplicationSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setReplicationSubnetGroupIdentifier(value: String): Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationSubnetGroupIdentifierUndefined: Self = StObject.set(x, "ReplicationSubnetGroupIdentifier", js.undefined)
    
    @scala.inline
    def setSubnetGroupStatus(value: String): Self = StObject.set(x, "SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupStatusUndefined: Self = StObject.set(x, "SubnetGroupStatus", js.undefined)
    
    @scala.inline
    def setSubnets(value: SubnetList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: Subnet*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
