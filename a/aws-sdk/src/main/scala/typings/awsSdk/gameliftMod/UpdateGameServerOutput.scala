package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGameServerOutput extends StObject {
  
  /**
    * Object that describes the newly updated game server.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.undefined
}
object UpdateGameServerOutput {
  
  @scala.inline
  def apply(): UpdateGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameServerOutput]
  }
  
  @scala.inline
  implicit class UpdateGameServerOutputMutableBuilder[Self <: UpdateGameServerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServer(value: GameServer): Self = StObject.set(x, "GameServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerUndefined: Self = StObject.set(x, "GameServer", js.undefined)
  }
}
