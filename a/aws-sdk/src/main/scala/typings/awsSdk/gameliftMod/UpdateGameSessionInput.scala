package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameSessionInput extends StObject {
  
  /**
    * A unique identifier for the game session to update. 
    */
  var GameSessionId: ArnStringModel = js.native
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Policy determining whether or not the game session accepts new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionCreationPolicy] = js.native
  
  /**
    * Game session protection policy to apply to this game session only.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ProtectionPolicy] = js.native
}
object UpdateGameSessionInput {
  
  @scala.inline
  def apply(GameSessionId: ArnStringModel): UpdateGameSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameSessionInput]
  }
  
  @scala.inline
  implicit class UpdateGameSessionInputMutableBuilder[Self <: UpdateGameSessionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCountUndefined: Self = StObject.set(x, "MaximumPlayerSessionCount", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = StObject.set(x, "PlayerSessionCreationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionCreationPolicyUndefined: Self = StObject.set(x, "PlayerSessionCreationPolicy", js.undefined)
    
    @scala.inline
    def setProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "ProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionPolicyUndefined: Self = StObject.set(x, "ProtectionPolicy", js.undefined)
  }
}
