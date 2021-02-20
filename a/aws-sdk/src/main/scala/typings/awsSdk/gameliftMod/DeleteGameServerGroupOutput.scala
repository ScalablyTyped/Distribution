package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the deleted game server group resource, with status updated to DELETE_SCHEDULED. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}
object DeleteGameServerGroupOutput {
  
  @scala.inline
  def apply(): DeleteGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class DeleteGameServerGroupOutputMutableBuilder[Self <: DeleteGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
