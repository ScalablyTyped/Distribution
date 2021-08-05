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
  
  inline def apply(): ResumeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeGameServerGroupOutput]
  }
  
  extension [Self <: ResumeGameServerGroupOutput](x: Self) {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
