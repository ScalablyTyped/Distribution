package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartFleetActionsInput extends StObject {
  
  /**
    * List of actions to restart on the fleet.
    */
  var Actions: FleetActionList = js.native
  
  /**
    * A unique identifier for a fleet to start actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
}
object StartFleetActionsInput {
  
  @scala.inline
  def apply(Actions: FleetActionList, FleetId: FleetIdOrArn): StartFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFleetActionsInput]
  }
  
  @scala.inline
  implicit class StartFleetActionsInputMutableBuilder[Self <: StartFleetActionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: FleetActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: FleetAction*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
