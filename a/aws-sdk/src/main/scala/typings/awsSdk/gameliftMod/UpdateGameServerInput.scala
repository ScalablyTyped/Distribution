package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameServerInput extends StObject {
  
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on game servers using ListGameServers or ClaimGameServer. 
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.undefined
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A custom string that uniquely identifies the game server to update.
    */
  var GameServerId: typings.awsSdk.gameliftMod.GameServerId
  
  /**
    * Indicates health status of the game server. A request that includes this parameter updates the game server's LastHealthCheckTime timestamp. 
    */
  var HealthCheck: js.UndefOr[GameServerHealthCheck] = js.undefined
  
  /**
    * Indicates whether the game server is available or is currently hosting gameplay.
    */
  var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.undefined
}
object UpdateGameServerInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn, GameServerId: GameServerId): UpdateGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerInput]
  }
  
  @scala.inline
  implicit class UpdateGameServerInputMutableBuilder[Self <: UpdateGameServerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerData(value: GameServerData): Self = StObject.set(x, "GameServerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerDataUndefined: Self = StObject.set(x, "GameServerData", js.undefined)
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheck(value: GameServerHealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
    
    @scala.inline
    def setUtilizationStatus(value: GameServerUtilizationStatus): Self = StObject.set(x, "UtilizationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilizationStatusUndefined: Self = StObject.set(x, "UtilizationStatus", js.undefined)
  }
}
