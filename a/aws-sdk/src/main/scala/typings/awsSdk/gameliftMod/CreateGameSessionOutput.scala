package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameSessionOutput extends StObject {
  
  /**
    * Object that describes the newly created game session record.
    */
  var GameSession: js.UndefOr[typings.awsSdk.gameliftMod.GameSession] = js.undefined
}
object CreateGameSessionOutput {
  
  @scala.inline
  def apply(): CreateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameSessionOutput]
  }
  
  @scala.inline
  implicit class CreateGameSessionOutputMutableBuilder[Self <: CreateGameSessionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSession(value: GameSession): Self = StObject.set(x, "GameSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionUndefined: Self = StObject.set(x, "GameSession", js.undefined)
  }
}
