package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterGameServerOutput extends StObject {
  
  /**
    * Object that describes the newly registered game server.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}
object RegisterGameServerOutput {
  
  @scala.inline
  def apply(): RegisterGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterGameServerOutput]
  }
  
  @scala.inline
  implicit class RegisterGameServerOutputMutableBuilder[Self <: RegisterGameServerOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServer(value: GameServer): Self = StObject.set(x, "GameServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerUndefined: Self = StObject.set(x, "GameServer", js.undefined)
  }
}
