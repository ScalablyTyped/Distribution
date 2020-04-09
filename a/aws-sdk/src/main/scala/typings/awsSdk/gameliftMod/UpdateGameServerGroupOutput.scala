package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGameServerGroupOutput extends js.Object {
  /**
    * An object that describes the game server group resource with updated properties. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}

object UpdateGameServerGroupOutput {
  @scala.inline
  def apply(GameServerGroup: GameServerGroup = null): UpdateGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroup != null) __obj.updateDynamic("GameServerGroup")(GameServerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGameServerGroupOutput]
  }
}

