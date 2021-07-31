package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeGameServerGroupOutput extends StObject {
  
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the resumed activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.undefined
}
object ResumeGameServerGroupOutput {
  
  @scala.inline
  def apply(): ResumeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class ResumeGameServerGroupOutputMutableBuilder[Self <: ResumeGameServerGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
