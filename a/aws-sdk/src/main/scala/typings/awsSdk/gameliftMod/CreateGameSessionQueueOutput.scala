package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGameSessionQueueOutput extends StObject {
  
  /**
    * An object that describes the newly created game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionQueue] = js.native
}
object CreateGameSessionQueueOutput {
  
  @scala.inline
  def apply(): CreateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameSessionQueueOutput]
  }
  
  @scala.inline
  implicit class CreateGameSessionQueueOutputMutableBuilder[Self <: CreateGameSessionQueueOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionQueue(value: GameSessionQueue): Self = StObject.set(x, "GameSessionQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionQueueUndefined: Self = StObject.set(x, "GameSessionQueue", js.undefined)
  }
}
