package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameServerGroupOutput extends js.Object {
  /**
    * An object that describes the requested game server group resource. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}

object DescribeGameServerGroupOutput {
  @scala.inline
  def apply(GameServerGroup: GameServerGroup = null): DescribeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroup != null) __obj.updateDynamic("GameServerGroup")(GameServerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameServerGroupOutput]
  }
}

