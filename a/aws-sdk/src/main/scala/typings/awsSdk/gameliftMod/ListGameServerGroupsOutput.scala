package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGameServerGroupsOutput extends StObject {
  
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
  implicit class ListGameServerGroupsOutputMutableBuilder[Self <: ListGameServerGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroups(value: GameServerGroups): Self = StObject.set(x, "GameServerGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerGroupsUndefined: Self = StObject.set(x, "GameServerGroups", js.undefined)
    
    @scala.inline
    def setGameServerGroupsVarargs(value: GameServerGroup*): Self = StObject.set(x, "GameServerGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
