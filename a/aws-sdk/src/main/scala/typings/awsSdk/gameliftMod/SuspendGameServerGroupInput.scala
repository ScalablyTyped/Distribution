package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendGameServerGroupInput extends StObject {
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * The activity to suspend for this game server group.
    */
  var SuspendActions: GameServerGroupActions
}
object SuspendGameServerGroupInput {
  
  inline def apply(GameServerGroupName: GameServerGroupNameOrArn, SuspendActions: GameServerGroupActions): SuspendGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], SuspendActions = SuspendActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendGameServerGroupInput]
  }
  
  extension [Self <: SuspendGameServerGroupInput](x: Self) {
    
    inline def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setSuspendActions(value: GameServerGroupActions): Self = StObject.set(x, "SuspendActions", value.asInstanceOf[js.Any])
    
    inline def setSuspendActionsVarargs(value: GameServerGroupAction*): Self = StObject.set(x, "SuspendActions", js.Array(value*))
  }
}
