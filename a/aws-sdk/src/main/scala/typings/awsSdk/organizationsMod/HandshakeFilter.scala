package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandshakeFilter extends js.Object {
  
  /**
    * Specifies the type of handshake action. If you specify ActionType, you cannot also specify ParentHandshakeId.
    */
  var ActionType: js.UndefOr[typings.awsSdk.organizationsMod.ActionType] = js.native
  
  /**
    * Specifies the parent handshake. Only used for handshake types that are a child of another type. If you specify ParentHandshakeId, you cannot also specify ActionType. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var ParentHandshakeId: js.UndefOr[HandshakeId] = js.native
}
object HandshakeFilter {
  
  @scala.inline
  def apply(): HandshakeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandshakeFilter]
  }
  
  @scala.inline
  implicit class HandshakeFilterOps[Self <: HandshakeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionType(value: ActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("ActionType", js.undefined)
    
    @scala.inline
    def setParentHandshakeId(value: HandshakeId): Self = this.set("ParentHandshakeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentHandshakeId: Self = this.set("ParentHandshakeId", js.undefined)
  }
}
