package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedPlayerSession extends StObject {
  
  /**
    * A unique identifier for a player 
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for a player session
    */
  var PlayerSessionId: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionId] = js.undefined
}
object MatchedPlayerSession {
  
  inline def apply(): MatchedPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedPlayerSession]
  }
  
  extension [Self <: MatchedPlayerSession](x: Self) {
    
    inline def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    inline def setPlayerSessionId(value: PlayerSessionId): Self = StObject.set(x, "PlayerSessionId", value.asInstanceOf[js.Any])
    
    inline def setPlayerSessionIdUndefined: Self = StObject.set(x, "PlayerSessionId", js.undefined)
  }
}
