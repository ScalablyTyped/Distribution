package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSubnetGroup extends StObject {
  
  /**
    * The ARN of the subnet group.
    */
  var DbSubnetGroupArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The description of the subnet group.
    */
  var DbSubnetGroupDescription: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the subnet group.
    */
  var DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of subnets in the subnet group.
    */
  var Subnets: js.UndefOr[AwsRdsDbSubnetGroupSubnets] = js.native
  
  /**
    * The VPC ID of the subnet group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbSubnetGroup {
  
  @scala.inline
  def apply(): AwsRdsDbSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroup]
  }
  
  @scala.inline
  implicit class AwsRdsDbSubnetGroupMutableBuilder[Self <: AwsRdsDbSubnetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbSubnetGroupArn(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroupArnUndefined: Self = StObject.set(x, "DbSubnetGroupArn", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupDescription(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroupDescriptionUndefined: Self = StObject.set(x, "DbSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupName(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "DbSubnetGroupName", js.undefined)
    
    @scala.inline
    def setSubnetGroupStatus(value: NonEmptyString): Self = StObject.set(x, "SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupStatusUndefined: Self = StObject.set(x, "SubnetGroupStatus", js.undefined)
    
    @scala.inline
    def setSubnets(value: AwsRdsDbSubnetGroupSubnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: AwsRdsDbSubnetGroupSubnet*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
