package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGameSessionQueueOutput extends StObject {
  
  /**
    * An object that describes the newly created game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionQueue] = js.undefined
}
object CreateGameSessionQueueOutput {
  
  inline def apply(): CreateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGameSessionQueueOutput]
  }
  
  extension [Self <: CreateGameSessionQueueOutput](x: Self) {
    
    inline def setGameSessionQueue(value: GameSessionQueue): Self = StObject.set(x, "GameSessionQueue", value.asInstanceOf[js.Any])
    
    inline def setGameSessionQueueUndefined: Self = StObject.set(x, "GameSessionQueue", js.undefined)
  }
}
