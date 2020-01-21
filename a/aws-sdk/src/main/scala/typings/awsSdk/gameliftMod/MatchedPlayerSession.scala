package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedPlayerSession extends js.Object {
  /**
    * A unique identifier for a player 
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a player session
    */
  var PlayerSessionId: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionId] = js.native
}

object MatchedPlayerSession {
  @scala.inline
  def apply(PlayerId: NonZeroAndMaxString = null, PlayerSessionId: PlayerSessionId = null): MatchedPlayerSession = {
    val __obj = js.Dynamic.literal()
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId.asInstanceOf[js.Any])
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedPlayerSession]
  }
}

