package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspendGameServerGroupOutput extends js.Object {
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the suspended activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}

object SuspendGameServerGroupOutput {
  @scala.inline
  def apply(GameServerGroup: GameServerGroup = null): SuspendGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroup != null) __obj.updateDynamic("GameServerGroup")(GameServerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendGameServerGroupOutput]
  }
}

