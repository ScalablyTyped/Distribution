package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateRoleFromGroupResponse extends StObject {
  
  /**
    * The time, in milliseconds since the epoch, when the role was disassociated from the group.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}
object DisassociateRoleFromGroupResponse {
  
  @scala.inline
  def apply(): DisassociateRoleFromGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateRoleFromGroupResponse]
  }
  
  @scala.inline
  implicit class DisassociateRoleFromGroupResponseMutableBuilder[Self <: DisassociateRoleFromGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisassociatedAt(value: string): Self = StObject.set(x, "DisassociatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociatedAtUndefined: Self = StObject.set(x, "DisassociatedAt", js.undefined)
  }
}
