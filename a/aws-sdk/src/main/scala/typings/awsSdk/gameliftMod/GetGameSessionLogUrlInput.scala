package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameSessionLogUrlInput extends StObject {
  
  /**
    * A unique identifier for the game session to get logs for. 
    */
  var GameSessionId: ArnStringModel
}
object GetGameSessionLogUrlInput {
  
  inline def apply(GameSessionId: ArnStringModel): GetGameSessionLogUrlInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameSessionLogUrlInput]
  }
  
  extension [Self <: GetGameSessionLogUrlInput](x: Self) {
    
    inline def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
  }
}
