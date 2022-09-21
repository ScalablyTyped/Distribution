package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlayerConnectionStatusRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
  
  /**
    * The unique identifier representing a player.
    */
  var PlayerId: typings.awsSdk.gamesparksMod.PlayerId
  
  /**
    * The name of the stage.
    */
  var StageName: typings.awsSdk.gamesparksMod.StageName
}
object GetPlayerConnectionStatusRequest {
  
  inline def apply(GameName: GameName, PlayerId: PlayerId, StageName: StageName): GetPlayerConnectionStatusRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], PlayerId = PlayerId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlayerConnectionStatusRequest]
  }
  
  extension [Self <: GetPlayerConnectionStatusRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setPlayerId(value: PlayerId): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
