package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DesiredPlayerSession extends js.Object {
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typings.awsSdk.gameliftMod.PlayerData] = js.native
  /**
    * A unique identifier for a player to associate with the player session.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DesiredPlayerSession {
  @scala.inline
  def apply(): DesiredPlayerSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesiredPlayerSession]
  }
  @scala.inline
  implicit class DesiredPlayerSessionOps[Self <: DesiredPlayerSession] (val x: Self) extends AnyVal {
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
    def setPlayerData(value: PlayerData): Self = this.set("PlayerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerData: Self = this.set("PlayerData", js.undefined)
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = this.set("PlayerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerId: Self = this.set("PlayerId", js.undefined)
  }
  
}

