package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionOutput extends js.Object {
  /**
    * Object that describes the newly created player session record.
    */
  var PlayerSession: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSession] = js.native
}

object CreatePlayerSessionOutput {
  @scala.inline
  def apply(PlayerSession: PlayerSession = null): CreatePlayerSessionOutput = {
    val __obj = js.Dynamic.literal()
    if (PlayerSession != null) __obj.updateDynamic("PlayerSession")(PlayerSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionOutput]
  }
}

