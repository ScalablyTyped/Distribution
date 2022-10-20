package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlackWorkspaceConfiguration extends StObject {
  
  /**
    * Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an organization in Organizations.
    */
  var allowOrganizationMemberAccount: js.UndefOr[booleanValue] = js.undefined
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as T012ABCDEFG.
    */
  var teamId: typings.awsSdk.clientsSupportappMod.teamId
  
  /**
    * The name of the Slack workspace.
    */
  var teamName: js.UndefOr[typings.awsSdk.clientsSupportappMod.teamName] = js.undefined
}
object SlackWorkspaceConfiguration {
  
  inline def apply(teamId: teamId): SlackWorkspaceConfiguration = {
    val __obj = js.Dynamic.literal(teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackWorkspaceConfiguration]
  }
  
  extension [Self <: SlackWorkspaceConfiguration](x: Self) {
    
    inline def setAllowOrganizationMemberAccount(value: booleanValue): Self = StObject.set(x, "allowOrganizationMemberAccount", value.asInstanceOf[js.Any])
    
    inline def setAllowOrganizationMemberAccountUndefined: Self = StObject.set(x, "allowOrganizationMemberAccount", js.undefined)
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamName(value: teamName): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
    
    inline def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
  }
}
