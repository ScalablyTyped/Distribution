package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeGameServerGroupOutput extends js.Object {
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the resumed activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}

object ResumeGameServerGroupOutput {
  @scala.inline
  def apply(GameServerGroup: GameServerGroup = null): ResumeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroup != null) __obj.updateDynamic("GameServerGroup")(GameServerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeGameServerGroupOutput]
  }
}

