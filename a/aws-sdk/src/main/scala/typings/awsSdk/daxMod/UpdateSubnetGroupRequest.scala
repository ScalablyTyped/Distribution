package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSubnetGroupRequest extends StObject {
  
  /**
    * A description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: String = js.native
  
  /**
    * A list of subnet IDs in the subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.native
}
object UpdateSubnetGroupRequest {
  
  @scala.inline
  def apply(SubnetGroupName: String): UpdateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubnetGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateSubnetGroupRequestMutableBuilder[Self <: UpdateSubnetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
