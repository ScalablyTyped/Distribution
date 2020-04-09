package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGameServerGroupOutput extends js.Object {
  /**
    * An object that describes the deleted game server group resource, with status updated to DELETE_SCHEDULED. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}

object DeleteGameServerGroupOutput {
  @scala.inline
  def apply(GameServerGroup: GameServerGroup = null): DeleteGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroup != null) __obj.updateDynamic("GameServerGroup")(GameServerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameServerGroupOutput]
  }
}

