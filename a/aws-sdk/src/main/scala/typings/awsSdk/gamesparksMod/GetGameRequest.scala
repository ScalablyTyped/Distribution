package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typings.awsSdk.gamesparksMod.GameName
}
object GetGameRequest {
  
  inline def apply(GameName: GameName): GetGameRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGameRequest]
  }
  
  extension [Self <: GetGameRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
  }
}
