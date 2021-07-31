package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameSessionQueueOutput extends StObject {
  
  /**
    * An object that describes the newly updated game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionQueue] = js.undefined
}
object UpdateGameSessionQueueOutput {
  
  @scala.inline
  def apply(): UpdateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionQueueOutput]
  }
  
  @scala.inline
  implicit class UpdateGameSessionQueueOutputMutableBuilder[Self <: UpdateGameSessionQueueOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionQueue(value: GameSessionQueue): Self = StObject.set(x, "GameSessionQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionQueueUndefined: Self = StObject.set(x, "GameSessionQueue", js.undefined)
  }
}
