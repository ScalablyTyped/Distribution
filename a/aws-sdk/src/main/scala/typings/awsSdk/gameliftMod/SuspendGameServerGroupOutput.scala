package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the suspended activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}
object SuspendGameServerGroupOutput {
  
  @scala.inline
  def apply(): SuspendGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class SuspendGameServerGroupOutputMutableBuilder[Self <: SuspendGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
