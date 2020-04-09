package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameServerGroupOutput extends js.Object {
  /**
    * The newly created game server group object, including the new ARN value for the GameLift FleetIQ game server group and the object's status. The EC2 Auto Scaling group ARN is initially null, since the group has not yet been created. This value is added once the game server group status reaches ACTIVE. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}

object CreateGameServerGroupOutput {
  @scala.inline
  def apply(GameServerGroup: GameServerGroup = null): CreateGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroup != null) __obj.updateDynamic("GameServerGroup")(GameServerGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameServerGroupOutput]
  }
}

