package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveAction extends js.Object {
  
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString = js.native
}
object RemoveAction {
  
  @scala.inline
  def apply(MemberId: ResourceIdString): RemoveAction = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAction]
  }
  
  @scala.inline
  implicit class RemoveActionOps[Self <: RemoveAction] (val x: Self) extends AnyVal {
    
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
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
  }
}
