package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacedPlayerSession extends StObject {
  
  /**
    * A unique identifier for a player that is associated with this player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a player session.
    */
  var PlayerSessionId: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionId] = js.native
}
object PlacedPlayerSession {
  
  @scala.inline
  def apply(): PlacedPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacedPlayerSession]
  }
  
  @scala.inline
  implicit class PlacedPlayerSessionMutableBuilder[Self <: PlacedPlayerSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    @scala.inline
    def setPlayerSessionId(value: PlayerSessionId): Self = StObject.set(x, "PlayerSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionIdUndefined: Self = StObject.set(x, "PlayerSessionId", js.undefined)
  }
}
