package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFleetActionsInput extends StObject {
  
  /**
    * List of actions to restart on the fleet.
    */
  var Actions: FleetActionList
  
  /**
    * A unique identifier for a fleet to start actions on. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
}
object StartFleetActionsInput {
  
  inline def apply(Actions: FleetActionList, FleetId: FleetIdOrArn): StartFleetActionsInput = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFleetActionsInput]
  }
  
  extension [Self <: StartFleetActionsInput](x: Self) {
    
    inline def setActions(value: FleetActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: FleetAction*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
