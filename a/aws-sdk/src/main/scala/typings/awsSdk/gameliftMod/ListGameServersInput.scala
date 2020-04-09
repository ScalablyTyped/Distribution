package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGameServersInput extends js.Object {
  /**
    * An identifier for the game server group for the game server you want to list. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Indicates how to sort the returned data based on the game servers' custom key sort value. If this parameter is left empty, the list of game servers is returned in no particular order.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.gameliftMod.SortOrder] = js.native
}

object ListGameServersInput {
  @scala.inline
  def apply(
    GameServerGroupName: GameServerGroupNameOrArn,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null,
    SortOrder: SortOrder = null
  ): ListGameServersInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGameServersInput]
  }
}

