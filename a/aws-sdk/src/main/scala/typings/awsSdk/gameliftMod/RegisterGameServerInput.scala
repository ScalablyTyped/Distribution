package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterGameServerInput extends StObject {
  
  /**
    * Information that is needed to make inbound client connections to the game server. This might include the IP address and port, DNS name, and other information.
    */
  var ConnectionInfo: js.UndefOr[GameServerConnectionInfo] = js.undefined
  
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on game servers using ListGameServers or ClaimGameServer. 
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.undefined
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn
  
  /**
    * A custom string that uniquely identifies the game server to register. Game server IDs are developer-defined and must be unique across all game server groups in your AWS account.
    */
  var GameServerId: typings.awsSdk.gameliftMod.GameServerId
  
  /**
    * The unique identifier for the instance where the game server is running. This ID is available in the instance metadata. EC2 instance IDs use a 17-character format, for example: i-1234567890abcdef0.
    */
  var InstanceId: GameServerInstanceId
}
object RegisterGameServerInput {
  
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupNameOrArn,
    GameServerId: GameServerId,
    InstanceId: GameServerInstanceId
  ): RegisterGameServerInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any], GameServerId = GameServerId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterGameServerInput]
  }
  
  @scala.inline
  implicit class RegisterGameServerInputMutableBuilder[Self <: RegisterGameServerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionInfo(value: GameServerConnectionInfo): Self = StObject.set(x, "ConnectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionInfoUndefined: Self = StObject.set(x, "ConnectionInfo", js.undefined)
    
    @scala.inline
    def setGameServerData(value: GameServerData): Self = StObject.set(x, "GameServerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerDataUndefined: Self = StObject.set(x, "GameServerData", js.undefined)
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: GameServerInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
