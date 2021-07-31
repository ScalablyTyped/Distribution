package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameServerGroupOutput extends StObject {
  
  /**
    * The newly created game server group object, including the new ARN value for the GameLift FleetIQ game server group and the object's status. The EC2 Auto Scaling group ARN is initially null, since the group has not yet been created. This value is added once the game server group status reaches ACTIVE. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.undefined
}
object CreateGameServerGroupOutput {
  
  @scala.inline
  def apply(): CreateGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class CreateGameServerGroupOutputMutableBuilder[Self <: CreateGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
