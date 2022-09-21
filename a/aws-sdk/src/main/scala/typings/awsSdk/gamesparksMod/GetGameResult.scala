package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGameResult extends StObject {
  
  /**
    * The details of the game.
    */
  var Game: js.UndefOr[GameDetails] = js.undefined
}
object GetGameResult {
  
  inline def apply(): GetGameResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameResult]
  }
  
  extension [Self <: GetGameResult](x: Self) {
    
    inline def setGame(value: GameDetails): Self = StObject.set(x, "Game", value.asInstanceOf[js.Any])
    
    inline def setGameUndefined: Self = StObject.set(x, "Game", js.undefined)
  }
}
