package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetPortSettingsInput extends js.Object {
  
  /**
    * A unique identifier for a fleet to update port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  
  /**
    * A collection of port settings to be added to the fleet resource.
    */
  var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.native
  
  /**
    * A collection of port settings to be removed from the fleet resource.
    */
  var InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.native
}
object UpdateFleetPortSettingsInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn): UpdateFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetPortSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateFleetPortSettingsInputOps[Self <: UpdateFleetPortSettingsInput] (val x: Self) extends AnyVal {
    
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
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundPermissionAuthorizationsVarargs(value: IpPermission*): Self = this.set("InboundPermissionAuthorizations", js.Array(value :_*))
    
    @scala.inline
    def setInboundPermissionAuthorizations(value: IpPermissionsList): Self = this.set("InboundPermissionAuthorizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundPermissionAuthorizations: Self = this.set("InboundPermissionAuthorizations", js.undefined)
    
    @scala.inline
    def setInboundPermissionRevocationsVarargs(value: IpPermission*): Self = this.set("InboundPermissionRevocations", js.Array(value :_*))
    
    @scala.inline
    def setInboundPermissionRevocations(value: IpPermissionsList): Self = this.set("InboundPermissionRevocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundPermissionRevocations: Self = this.set("InboundPermissionRevocations", js.undefined)
  }
}
