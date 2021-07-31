package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimGameServerOutput extends StObject {
  
  /**
    * Object that describes the newly claimed game server.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.undefined
}
object ClaimGameServerOutput {
  
  @scala.inline
  def apply(): ClaimGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimGameServerOutput]
  }
  
  @scala.inline
  implicit class ClaimGameServerOutputMutableBuilder[Self <: ClaimGameServerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServer(value: GameServer): Self = StObject.set(x, "GameServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerUndefined: Self = StObject.set(x, "GameServer", js.undefined)
  }
}
