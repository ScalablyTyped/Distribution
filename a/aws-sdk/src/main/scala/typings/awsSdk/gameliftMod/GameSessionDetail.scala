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
  def apply(): GameSessionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionDetail]
  }
  @scala.inline
  implicit class GameSessionDetailOps[Self <: GameSessionDetail] (val x: Self) extends AnyVal {
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
    def setGameSession(value: GameSession): Self = this.set("GameSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSession: Self = this.set("GameSession", js.undefined)
    @scala.inline
    def setProtectionPolicy(value: ProtectionPolicy): Self = this.set("ProtectionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectionPolicy: Self = this.set("ProtectionPolicy", js.undefined)
  }
  
}

