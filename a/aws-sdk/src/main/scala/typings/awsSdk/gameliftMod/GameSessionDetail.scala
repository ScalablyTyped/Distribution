package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameSessionDetail extends StObject {
  
  /**
    * Object that describes a game session.
    */
  var GameSession: js.UndefOr[typings.awsSdk.gameliftMod.GameSession] = js.native
  
  /**
    * Current status of protection for the game session.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ProtectionPolicy] = js.native
}
object GameSessionDetail {
  
  @scala.inline
  def apply(): GameSessionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionDetail]
  }
  
  @scala.inline
  implicit class GameSessionDetailMutableBuilder[Self <: GameSessionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSession(value: GameSession): Self = StObject.set(x, "GameSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionUndefined: Self = StObject.set(x, "GameSession", js.undefined)
    
    @scala.inline
    def setProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "ProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionPolicyUndefined: Self = StObject.set(x, "ProtectionPolicy", js.undefined)
  }
}
