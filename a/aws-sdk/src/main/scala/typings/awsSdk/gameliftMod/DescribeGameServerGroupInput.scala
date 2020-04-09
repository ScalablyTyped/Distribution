package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameServerGroupInput extends js.Object {
  /**
    * The unique identifier for the game server group being requested. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
}

object DescribeGameServerGroupInput {
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn): DescribeGameServerGroupInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeGameServerGroupInput]
  }
}

