package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkteamRequest extends js.Object {
  
  /**
    * An updated description for the work team.
    */
  var Description: js.UndefOr[String200] = js.native
  
  /**
    * A list of MemberDefinition objects that contains objects that identify the workers that make up the work team.  Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use CognitoMemberDefinition. For workforces created using your own OIDC identity provider (IdP) use OidcMemberDefinition. You should not provide input for both of these parameters in a single request. For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito user groups within the user pool used to create a workforce. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values. To add a Amazon Cognito user group to an existing worker pool, see Adding groups to a User Pool. For more information about user pools, see Amazon Cognito User Pools. For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private work team in OidcMemberDefinition by listing those groups in Groups. Be aware that user groups that are already in the work team must also be listed in Groups when you make this request to remain on the work team. If you do not include these user groups, they will no longer be associated with the work team you update. 
    */
  var MemberDefinitions: js.UndefOr[typings.awsSdk.sagemakerMod.MemberDefinitions] = js.native
  
  /**
    * Configures SNS topic notifications for available or expiring work items
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  
  /**
    * The name of the work team to update.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}
object UpdateWorkteamRequest {
  
  @scala.inline
  def apply(WorkteamName: WorkteamName): UpdateWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamRequest]
  }
  
  @scala.inline
  implicit class UpdateWorkteamRequestOps[Self <: UpdateWorkteamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = this.set("WorkteamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String200): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = this.set("MemberDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setMemberDefinitions(value: MemberDefinitions): Self = this.set("MemberDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberDefinitions: Self = this.set("MemberDefinitions", js.undefined)
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("NotificationConfiguration", js.undefined)
  }
}
