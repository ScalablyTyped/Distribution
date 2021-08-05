package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterGameServerOutput extends StObject {
  
  /**
    * Object that describes the newly registered game server.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.undefined
}
object RegisterGameServerOutput {
  
  inline def apply(): RegisterGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterGameServerOutput]
  }
  
  extension [Self <: RegisterGameServerOutput](x: Self) {
    
    inline def setGameServer(value: GameServer): Self = StObject.set(x, "GameServer", value.asInstanceOf[js.Any])
    
    inline def setGameServerUndefined: Self = StObject.set(x, "GameServer", js.undefined)
  }
}
