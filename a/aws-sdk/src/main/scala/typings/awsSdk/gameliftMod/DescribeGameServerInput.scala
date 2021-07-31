package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameServerInput extends StObject {
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A custom string that uniquely identifies the game server information to be retrieved.
    */
  var GameServerId: typings.awsSdk.gameliftMod.GameServerId
}
object DescribeGameServerInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, GameServerId: GameServerId): DescribeGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameServerInput]
  }
  
  @scala.inline
  implicit class DescribeGameServerInputMutableBuilder[Self <: DescribeGameServerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
  }
}
