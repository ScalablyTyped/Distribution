package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameServerOutput extends js.Object {
  /**
    * Object that describes the requested game server resource.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}

object DescribeGameServerOutput {
  @scala.inline
  def apply(GameServer: GameServer = null): DescribeGameServerOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServer != null) __obj.updateDynamic("GameServer")(GameServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameServerOutput]
  }
}

