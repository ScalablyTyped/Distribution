package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionsOutput extends js.Object {
  /**
    * A collection of player session objects created for the added players.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}

object CreatePlayerSessionsOutput {
  @scala.inline
  def apply(PlayerSessions: PlayerSessionList = null): CreatePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    if (PlayerSessions != null) __obj.updateDynamic("PlayerSessions")(PlayerSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionsOutput]
  }
}

