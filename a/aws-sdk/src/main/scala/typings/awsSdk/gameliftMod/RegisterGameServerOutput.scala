package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterGameServerOutput extends js.Object {
  /**
    * Object that describes the newly created game server resource.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}

object RegisterGameServerOutput {
  @scala.inline
  def apply(GameServer: GameServer = null): RegisterGameServerOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServer != null) __obj.updateDynamic("GameServer")(GameServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterGameServerOutput]
  }
}

