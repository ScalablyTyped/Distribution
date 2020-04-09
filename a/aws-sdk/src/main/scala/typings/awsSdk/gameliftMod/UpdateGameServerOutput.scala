package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameServerOutput extends js.Object {
  /**
    * Object that describes the newly updated game server resource.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}

object UpdateGameServerOutput {
  @scala.inline
  def apply(GameServer: GameServer = null): UpdateGameServerOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServer != null) __obj.updateDynamic("GameServer")(GameServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerOutput]
  }
}

