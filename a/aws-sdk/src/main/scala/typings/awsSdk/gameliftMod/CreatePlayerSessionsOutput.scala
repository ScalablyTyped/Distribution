package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlayerSessionsOutput extends StObject {
  
  /**
    * A collection of player session objects created for the added players.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}
object CreatePlayerSessionsOutput {
  
  @scala.inline
  def apply(): CreatePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionsOutput]
  }
  
  @scala.inline
  implicit class CreatePlayerSessionsOutputMutableBuilder[Self <: CreatePlayerSessionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerSessions(value: PlayerSessionList): Self = StObject.set(x, "PlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionsUndefined: Self = StObject.set(x, "PlayerSessions", js.undefined)
    
    @scala.inline
    def setPlayerSessionsVarargs(value: PlayerSession*): Self = StObject.set(x, "PlayerSessions", js.Array(value :_*))
  }
}
