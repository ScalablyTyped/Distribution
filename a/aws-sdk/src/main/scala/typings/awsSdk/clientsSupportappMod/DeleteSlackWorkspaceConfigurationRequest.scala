package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSlackWorkspaceConfigurationRequest extends StObject {
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as T012ABCDEFG.
    */
  var teamId: typings.awsSdk.clientsSupportappMod.teamId
}
object DeleteSlackWorkspaceConfigurationRequest {
  
  inline def apply(teamId: teamId): DeleteSlackWorkspaceConfigurationRequest = {
    val __obj = js.Dynamic.literal(teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlackWorkspaceConfigurationRequest]
  }
  
  extension [Self <: DeleteSlackWorkspaceConfigurationRequest](x: Self) {
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
