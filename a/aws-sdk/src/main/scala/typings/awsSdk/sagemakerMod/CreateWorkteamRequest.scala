package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkteamRequest extends StObject {
  
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  
  /**
    * A list of MemberDefinition objects that contains objects that identify the workers that make up the work team.  Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use CognitoMemberDefinition. For workforces created using your own OIDC identity provider (IdP) use OidcMemberDefinition. Do not provide input for both of these parameters in a single request. For workforces created using Amazon Cognito, private work teams correspond to Amazon Cognito user groups within the user pool used to create a workforce. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values. To add a Amazon Cognito user group to an existing worker pool, see Adding groups to a User Pool. For more information about user pools, see Amazon Cognito User Pools. For workforces created using your own OIDC IdP, specify the user groups that you want to include in your private work team in OidcMemberDefinition by listing those groups in Groups.
    */
  var MemberDefinitions: typings.awsSdk.sagemakerMod.MemberDefinitions = js.native
  
  /**
    * Configures notification of workers regarding available or expiring work items.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  
  /**
    * An array of key-value pairs. For more information, see Resource Tag and Using Cost Allocation Tags in the  AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the workforce.
    */
  var WorkforceName: js.UndefOr[typings.awsSdk.sagemakerMod.WorkforceName] = js.native
  
  /**
    * The name of the work team. Use this name to identify the work team.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}
object CreateWorkteamRequest {
  
  @scala.inline
  def apply(Description: String200, MemberDefinitions: MemberDefinitions, WorkteamName: WorkteamName): CreateWorkteamRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkteamRequest]
  }
  
  @scala.inline
  implicit class CreateWorkteamRequestMutableBuilder[Self <: CreateWorkteamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String200): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberDefinitions(value: MemberDefinitions): Self = StObject.set(x, "MemberDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = StObject.set(x, "MemberDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkforceNameUndefined: Self = StObject.set(x, "WorkforceName", js.undefined)
    
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
