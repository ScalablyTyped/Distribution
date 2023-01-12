package typings.awsSdk.clientsSupportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterSlackWorkspaceForOrganizationResult extends StObject {
  
  /**
    * Whether the Amazon Web Services account is a management or member account that's part of an organization in Organizations.
    */
  var accountType: js.UndefOr[AccountType] = js.undefined
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as T012ABCDEFG.
    */
  var teamId: js.UndefOr[typings.awsSdk.clientsSupportappMod.teamId] = js.undefined
  
  /**
    * The name of the Slack workspace.
    */
  var teamName: js.UndefOr[typings.awsSdk.clientsSupportappMod.teamName] = js.undefined
}
object RegisterSlackWorkspaceForOrganizationResult {
  
  inline def apply(): RegisterSlackWorkspaceForOrganizationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterSlackWorkspaceForOrganizationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterSlackWorkspaceForOrganizationResult] (val x: Self) extends AnyVal {
    
    inline def setAccountType(value: AccountType): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    inline def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    
    inline def setTeamName(value: teamName): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
    
    inline def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
  }
}
