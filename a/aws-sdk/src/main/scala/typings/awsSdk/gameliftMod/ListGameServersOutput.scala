package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGameServersOutput extends js.Object {
  /**
    * A collection of game server objects that match the request.
    */
  var GameServers: js.UndefOr[typings.awsSdk.gameliftMod.GameServers] = js.native
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object ListGameServersOutput {
  @scala.inline
  def apply(GameServers: GameServers = null, NextToken: NonZeroAndMaxString = null): ListGameServersOutput = {
    val __obj = js.Dynamic.literal()
    if (GameServers != null) __obj.updateDynamic("GameServers")(GameServers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGameServersOutput]
  }
}

