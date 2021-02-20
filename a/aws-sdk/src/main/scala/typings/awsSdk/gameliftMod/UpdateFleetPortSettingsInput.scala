package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetPortSettingsInput extends StObject {
  
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
  implicit class UpdateFleetPortSettingsInputMutableBuilder[Self <: UpdateFleetPortSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundPermissionAuthorizations(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissionAuthorizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundPermissionAuthorizationsUndefined: Self = StObject.set(x, "InboundPermissionAuthorizations", js.undefined)
    
    @scala.inline
    def setInboundPermissionAuthorizationsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissionAuthorizations", js.Array(value :_*))
    
    @scala.inline
    def setInboundPermissionRevocations(value: IpPermissionsList): Self = StObject.set(x, "InboundPermissionRevocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundPermissionRevocationsUndefined: Self = StObject.set(x, "InboundPermissionRevocations", js.undefined)
    
    @scala.inline
    def setInboundPermissionRevocationsVarargs(value: IpPermission*): Self = StObject.set(x, "InboundPermissionRevocations", js.Array(value :_*))
  }
}
