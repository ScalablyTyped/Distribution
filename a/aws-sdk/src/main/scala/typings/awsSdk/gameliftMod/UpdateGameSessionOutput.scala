package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameSessionOutput extends StObject {
  
  /**
    * The updated game session metadata.
    */
  var GameSession: js.UndefOr[typings.awsSdk.gameliftMod.GameSession] = js.native
}
object UpdateGameSessionOutput {
  
  @scala.inline
  def apply(): UpdateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionOutput]
  }
  
  @scala.inline
  implicit class UpdateGameSessionOutputMutableBuilder[Self <: UpdateGameSessionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSession(value: GameSession): Self = StObject.set(x, "GameSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionUndefined: Self = StObject.set(x, "GameSession", js.undefined)
  }
}
