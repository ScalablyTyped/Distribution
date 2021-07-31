package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSubnetGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the DB subnet group.
    */
  var DBSubnetGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the description of the subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Detailed information about one or more subnets within a subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  
  /**
    * Provides the virtual private cloud (VPC) ID of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DBSubnetGroup {
  
  @scala.inline
  def apply(): DBSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroup]
  }
  
  @scala.inline
  implicit class DBSubnetGroupMutableBuilder[Self <: DBSubnetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSubnetGroupArn(value: String): Self = StObject.set(x, "DBSubnetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupArnUndefined: Self = StObject.set(x, "DBSubnetGroupArn", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupDescription(value: String): Self = StObject.set(x, "DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupDescriptionUndefined: Self = StObject.set(x, "DBSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
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
