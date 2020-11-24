package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSubnetGroupRequest extends js.Object {
  
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
  implicit class DeleteSubnetGroupRequestOps[Self <: DeleteSubnetGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setSubnetGroupName(value: String): Self = this.set("SubnetGroupName", value.asInstanceOf[js.Any])
  }
}
