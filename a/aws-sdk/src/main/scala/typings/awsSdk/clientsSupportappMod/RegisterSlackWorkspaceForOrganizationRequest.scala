package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterSlackWorkspaceForOrganizationRequest extends StObject {
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as T012ABCDEFG. Specify the Slack workspace that you want to use for your organization.
    */
  var teamId: typings.awsSdk.clientsSupportappMod.teamId
}
object RegisterSlackWorkspaceForOrganizationRequest {
  
  inline def apply(teamId: teamId): RegisterSlackWorkspaceForOrganizationRequest = {
    val __obj = js.Dynamic.literal(teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterSlackWorkspaceForOrganizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterSlackWorkspaceForOrganizationRequest] (val x: Self) extends AnyVal {
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
