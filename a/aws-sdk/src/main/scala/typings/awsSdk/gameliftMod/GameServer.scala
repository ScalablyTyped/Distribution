package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServer extends StObject {
  
  /**
    * Indicates when an available game server has been reserved for gameplay but has not yet started hosting a game. Once it is claimed, the game server remains in CLAIMED status for a maximum of one minute. During this time, game clients connect to the game server to start the game and trigger the game server to update its utilization status. After one minute, the game server claim status reverts to null.
    */
  var ClaimStatus: js.UndefOr[GameServerClaimStatus] = js.undefined
  
  /**
    * The port and IP address that must be used to establish a client connection to the game server.
    */
  var ConnectionInfo: js.UndefOr[GameServerConnectionInfo] = js.undefined
  
  /**
    * A set of custom game server properties, formatted as a single string value. This data is passed to a game client or service when it requests information on game servers using ListGameServers or ClaimGameServer.
    */
  var GameServerData: js.UndefOr[typings.awsSdk.gameliftMod.GameServerData] = js.undefined
  
  /**
    * The ARN identifier for the game server group where the game server is located.
    */
  var GameServerGroupArn: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupArn] = js.undefined
  
  /**
    * A unique identifier for the game server group where the game server is running. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroupName] = js.undefined
  
  /**
    * A custom string that uniquely identifies the game server. Game server IDs are developer-defined and are unique across all game server groups in an Amazon Web Services account.
    */
  var GameServerId: js.UndefOr[typings.awsSdk.gameliftMod.GameServerId] = js.undefined
  
  /**
    * The unique identifier for the instance where the game server is running. This ID is available in the instance metadata. EC2 instance IDs use a 17-character format, for example: i-1234567890abcdef0.
    */
  var InstanceId: js.UndefOr[GameServerInstanceId] = js.undefined
  
  /**
    * Timestamp that indicates the last time the game server was claimed with a ClaimGameServer request. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057"). This value is used to calculate when a claimed game server's status should revert to null.
    */
  var LastClaimTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Timestamp that indicates the last time the game server was updated with health status using an UpdateGameServer request. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057"). After game server registration, this property is only changed when a game server update specifies a health check value.
    */
  var LastHealthCheckTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Timestamp that indicates when the game server was created with a RegisterGameServer request. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var RegistrationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the game server is currently available for new games or is busy. Possible statuses include:    AVAILABLE - The game server is available to be claimed. A game server that has been claimed remains in this status until it reports game hosting activity.     UTILIZED - The game server is currently hosting a game session with players.   
    */
  var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.undefined
}
object GameServer {
  
  inline def apply(): GameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServer]
  }
  
  extension [Self <: GameServer](x: Self) {
    
    inline def setClaimStatus(value: GameServerClaimStatus): Self = StObject.set(x, "ClaimStatus", value.asInstanceOf[js.Any])
    
    inline def setClaimStatusUndefined: Self = StObject.set(x, "ClaimStatus", js.undefined)
    
    inline def setConnectionInfo(value: GameServerConnectionInfo): Self = StObject.set(x, "ConnectionInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectionInfoUndefined: Self = StObject.set(x, "ConnectionInfo", js.undefined)
    
    inline def setGameServerData(value: GameServerData): Self = StObject.set(x, "GameServerData", value.asInstanceOf[js.Any])
    
    inline def setGameServerDataUndefined: Self = StObject.set(x, "GameServerData", js.undefined)
    
    inline def setGameServerGroupArn(value: GameServerGroupArn): Self = StObject.set(x, "GameServerGroupArn", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupArnUndefined: Self = StObject.set(x, "GameServerGroupArn", js.undefined)
    
    inline def setGameServerGroupName(value: GameServerGroupName): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupNameUndefined: Self = StObject.set(x, "GameServerGroupName", js.undefined)
    
    inline def setGameServerId(value: GameServerId): Self = StObject.set(x, "GameServerId", value.asInstanceOf[js.Any])
    
    inline def setGameServerIdUndefined: Self = StObject.set(x, "GameServerId", js.undefined)
    
    inline def setInstanceId(value: GameServerInstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLastClaimTime(value: js.Date): Self = StObject.set(x, "LastClaimTime", value.asInstanceOf[js.Any])
    
    inline def setLastClaimTimeUndefined: Self = StObject.set(x, "LastClaimTime", js.undefined)
    
    inline def setLastHealthCheckTime(value: js.Date): Self = StObject.set(x, "LastHealthCheckTime", value.asInstanceOf[js.Any])
    
    inline def setLastHealthCheckTimeUndefined: Self = StObject.set(x, "LastHealthCheckTime", js.undefined)
    
    inline def setRegistrationTime(value: js.Date): Self = StObject.set(x, "RegistrationTime", value.asInstanceOf[js.Any])
    
    inline def setRegistrationTimeUndefined: Self = StObject.set(x, "RegistrationTime", js.undefined)
    
    inline def setUtilizationStatus(value: GameServerUtilizationStatus): Self = StObject.set(x, "UtilizationStatus", value.asInstanceOf[js.Any])
    
    inline def setUtilizationStatusUndefined: Self = StObject.set(x, "UtilizationStatus", js.undefined)
  }
}
