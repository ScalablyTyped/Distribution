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
  def apply(GameServerGroupName: GameServerGroupNameOrArn): ListGameServersInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGameServersInput]
  }
  @scala.inline
  implicit class ListGameServersInputOps[Self <: ListGameServersInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = this.set("GameServerGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
  
}

