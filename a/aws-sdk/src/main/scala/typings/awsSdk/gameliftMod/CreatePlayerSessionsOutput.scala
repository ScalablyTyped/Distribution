package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlayerSessionsOutput extends StObject {
  
  /**
    * A collection of player session objects created for the added players.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
}
object CreatePlayerSessionsOutput {
  
  inline def apply(): CreatePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionsOutput]
  }
  
  extension [Self <: CreatePlayerSessionsOutput](x: Self) {
    
    inline def setPlayerSessions(value: PlayerSessionList): Self = StObject.set(x, "PlayerSessions", value.asInstanceOf[js.Any])
    
    inline def setPlayerSessionsUndefined: Self = StObject.set(x, "PlayerSessions", js.undefined)
    
    inline def setPlayerSessionsVarargs(value: PlayerSession*): Self = StObject.set(x, "PlayerSessions", js.Array(value :_*))
  }
}
