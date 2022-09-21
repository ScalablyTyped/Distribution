package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesiredPlayerSession extends StObject {
  
  /**
    * Developer-defined information related to a player. GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typings.awsSdk.gameliftMod.PlayerData] = js.undefined
  
  /**
    * A unique identifier for a player to associate with the player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DesiredPlayerSession {
  
  inline def apply(): DesiredPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredPlayerSession]
  }
  
  extension [Self <: DesiredPlayerSession](x: Self) {
    
    inline def setPlayerData(value: PlayerData): Self = StObject.set(x, "PlayerData", value.asInstanceOf[js.Any])
    
    inline def setPlayerDataUndefined: Self = StObject.set(x, "PlayerData", js.undefined)
    
    inline def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
  }
}
