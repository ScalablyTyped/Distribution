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
  def apply(PlayerData: PlayerData = null, PlayerId: NonZeroAndMaxString = null): DesiredPlayerSession = {
    val __obj = js.Dynamic.literal()
    if (PlayerData != null) __obj.updateDynamic("PlayerData")(PlayerData.asInstanceOf[js.Any])
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredPlayerSession]
  }
}

