package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionDetail extends js.Object {
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
  def apply(GameSession: GameSession = null, ProtectionPolicy: ProtectionPolicy = null): GameSessionDetail = {
    val __obj = js.Dynamic.literal()
    if (GameSession != null) __obj.updateDynamic("GameSession")(GameSession.asInstanceOf[js.Any])
    if (ProtectionPolicy != null) __obj.updateDynamic("ProtectionPolicy")(ProtectionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionDetail]
  }
}

