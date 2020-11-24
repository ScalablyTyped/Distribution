package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameSessionInput extends js.Object {
  
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
  implicit class UpdateGameSessionInputOps[Self <: UpdateGameSessionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameSessionId(value: ArnStringModel): Self = this.set("GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = this.set("MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumPlayerSessionCount: Self = this.set("MaximumPlayerSessionCount", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = this.set("PlayerSessionCreationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerSessionCreationPolicy: Self = this.set("PlayerSessionCreationPolicy", js.undefined)
    
    @scala.inline
    def setProtectionPolicy(value: ProtectionPolicy): Self = this.set("ProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectionPolicy: Self = this.set("ProtectionPolicy", js.undefined)
  }
}
