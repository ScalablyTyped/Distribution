package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetGroupRequest extends StObject {
  
  /**
    * A description for the subnet group
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A name for the subnet group. This value is stored as a lowercase string. 
    */
  var SubnetGroupName: String
  
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  var SubnetIds: SubnetIdentifierList
}
object CreateSubnetGroupRequest {
  
  @scala.inline
  def apply(SubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetGroupRequest]
  }
  
  @scala.inline
  implicit class CreateSubnetGroupRequestMutableBuilder[Self <: CreateSubnetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
