package typings.awsSdk.supportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlackWorkspaceConfiguration extends StObject {
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace.
    */
  var teamId: typings.awsSdk.supportappMod.teamId
}
object SlackWorkspaceConfiguration {
  
  inline def apply(teamId: teamId): SlackWorkspaceConfiguration = {
    val __obj = js.Dynamic.literal(teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackWorkspaceConfiguration]
  }
  
  extension [Self <: SlackWorkspaceConfiguration](x: Self) {
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
