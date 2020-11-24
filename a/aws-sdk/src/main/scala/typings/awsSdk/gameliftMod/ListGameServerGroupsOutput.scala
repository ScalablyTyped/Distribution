package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGameServerGroupsOutput extends js.Object {
  
  /**
    * A collection of game server group objects that match the request.
    */
  var GameServerGroups: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroups] = js.native
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object ListGameServerGroupsOutput {
  
  @scala.inline
  def apply(): ListGameServerGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerGroupsOutput]
  }
  
  @scala.inline
  implicit class ListGameServerGroupsOutputOps[Self <: ListGameServerGroupsOutput] (val x: Self) extends AnyVal {
    
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
    def setGameServerGroupsVarargs(value: GameServerGroup*): Self = this.set("GameServerGroups", js.Array(value :_*))
    
    @scala.inline
    def setGameServerGroups(value: GameServerGroups): Self = this.set("GameServerGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroups: Self = this.set("GameServerGroups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
