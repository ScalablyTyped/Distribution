package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSecurityGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the DB security group.
    */
  var DBSecurityGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the description of the DB security group.
    */
  var DBSecurityGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    *  Contains a list of EC2SecurityGroup elements. 
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
  
  /**
    *  Contains a list of IPRange elements. 
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.undefined
  
  /**
    * Provides the AWS ID of the owner of a specific DB security group.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the VpcId of the DB security group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DBSecurityGroup {
  
  inline def apply(): DBSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroup]
  }
  
  extension [Self <: DBSecurityGroup](x: Self) {
    
    inline def setDBSecurityGroupArn(value: String): Self = StObject.set(x, "DBSecurityGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupArnUndefined: Self = StObject.set(x, "DBSecurityGroupArn", js.undefined)
    
    inline def setDBSecurityGroupDescription(value: String): Self = StObject.set(x, "DBSecurityGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupDescriptionUndefined: Self = StObject.set(x, "DBSecurityGroupDescription", js.undefined)
    
    inline def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupNameUndefined: Self = StObject.set(x, "DBSecurityGroupName", js.undefined)
    
    inline def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = StObject.set(x, "EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupsUndefined: Self = StObject.set(x, "EC2SecurityGroups", js.undefined)
    
    inline def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = StObject.set(x, "EC2SecurityGroups", js.Array(value :_*))
    
    inline def setIPRanges(value: IPRangeList): Self = StObject.set(x, "IPRanges", value.asInstanceOf[js.Any])
    
    inline def setIPRangesUndefined: Self = StObject.set(x, "IPRanges", js.undefined)
    
    inline def setIPRangesVarargs(value: IPRange*): Self = StObject.set(x, "IPRanges", js.Array(value :_*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
