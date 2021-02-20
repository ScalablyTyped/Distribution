package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupReference extends StObject {
  
  /**
    * The ID of your security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC with the referencing security group.
    */
  var ReferencingVpcId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}
object SecurityGroupReference {
  
  @scala.inline
  def apply(): SecurityGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupReference]
  }
  
  @scala.inline
  implicit class SecurityGroupReferenceMutableBuilder[Self <: SecurityGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setReferencingVpcId(value: String): Self = StObject.set(x, "ReferencingVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencingVpcIdUndefined: Self = StObject.set(x, "ReferencingVpcId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
