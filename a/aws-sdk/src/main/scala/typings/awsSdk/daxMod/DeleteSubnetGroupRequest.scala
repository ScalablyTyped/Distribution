package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSubnetGroupRequest extends StObject {
  
  /**
    * The name of the subnet group to delete.
    */
  var SubnetGroupName: String = js.native
}
object DeleteSubnetGroupRequest {
  
  @scala.inline
  def apply(SubnetGroupName: String): DeleteSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubnetGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteSubnetGroupRequestMutableBuilder[Self <: DeleteSubnetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
  }
}
