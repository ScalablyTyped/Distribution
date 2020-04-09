package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClaimGameServerOutput extends js.Object {
  /**
    * Object that describes the newly claimed game server resource.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}

object ClaimGameServerOutput {
  @scala.inline
  def apply(GameServer: GameServer = null): ClaimGameServerOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServer != null) __obj.updateDynamic("GameServer")(GameServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimGameServerOutput]
  }
}

