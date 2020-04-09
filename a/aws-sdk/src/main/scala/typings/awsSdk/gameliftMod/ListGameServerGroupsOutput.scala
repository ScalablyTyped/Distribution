package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGameServerGroupsOutput extends js.Object {
  /**
    * A collection of game server group objects that match the request.
    */
  var GameServerGroups: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroups] = js.native
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object ListGameServerGroupsOutput {
  @scala.inline
  def apply(GameServerGroups: GameServerGroups = null, NextToken: NonZeroAndMaxString = null): ListGameServerGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServerGroups != null) __obj.updateDynamic("GameServerGroups")(GameServerGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGameServerGroupsOutput]
  }
}

