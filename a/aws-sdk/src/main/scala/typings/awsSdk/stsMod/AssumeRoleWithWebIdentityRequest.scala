package typings.awsSdk.stsMod

import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeRoleWithWebIdentityRequest extends CognitoIdentityCredentialsInputs {
  /**
    * The duration, in seconds, of the role session. The value can range from 900 seconds (15 minutes) up to the maximum session duration setting for the role. This setting can have a value from 1 hour to 12 hours. If you specify a value higher than this setting, the operation fails. For example, if you specify a session duration of 12 hours, but your administrator set the maximum session duration to 6 hours, your operation fails. To learn how to view the maximum value for your role, see View the Maximum Session Duration Setting for a Role in the IAM User Guide. By default, the value is set to 3600 seconds.   The DurationSeconds parameter is separate from the duration of a console session that you might request using the returned credentials. The request to the federation endpoint for a console sign-in token takes a SessionDuration parameter that specifies the maximum length of the console session. For more information, see Creating a URL that Enables Federated Users to Access the AWS Management Console in the IAM User Guide. 
    */
  var DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.native
  /**
    * An IAM policy in JSON format that you want to use as an inline session policy. This parameter is optional. Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide. The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.  
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as managed session policies. The policies must exist in the same account as the role. This parameter is optional. You can provide up to 10 managed policy ARNs. However, the plain text that you use for both inline and managed session policies can't exceed 2,048 characters. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.  An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.   Passing policies to this operation returns new temporary credentials. The resulting session's permissions are the intersection of the role's identity-based policy and the session policies. You can use the role's temporary credentials in subsequent AWS API calls to access resources in the account that owns the role. You cannot use session policies to grant more permissions than those allowed by the identity-based policy of the role that is being assumed. For more information, see Session Policies in the IAM User Guide.
    */
  var PolicyArns: js.UndefOr[policyDescriptorListType] = js.native
  /**
    * The fully qualified host component of the domain name of the identity provider. Specify this value only for OAuth 2.0 access tokens. Currently www.amazon.com and graph.facebook.com are the only supported identity providers for OAuth 2.0 access tokens. Do not include URL schemes and port numbers. Do not specify this value for OpenID Connect ID tokens.
    */
  var ProviderId: js.UndefOr[urlType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that the caller is assuming.
    */
  var RoleArn: arnType = js.native
  /**
    * An identifier for the assumed role session. Typically, you pass the name or identifier that is associated with the user who is using your application. That way, the temporary security credentials that your application will use are associated with that user. This session name is included as part of the ARN and assumed role ID in the AssumedRoleUser response element. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var RoleSessionName: roleSessionNameType = js.native
  /**
    * The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity provider. Your application must get this token by authenticating the user who is using your application with a web identity provider before the application makes an AssumeRoleWithWebIdentity call. 
    */
  var WebIdentityToken: clientTokenType = js.native
}

object AssumeRoleWithWebIdentityRequest {
  @scala.inline
  def apply(RoleArn: arnType, RoleSessionName: roleSessionNameType, WebIdentityToken: clientTokenType): AssumeRoleWithWebIdentityRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeRoleWithWebIdentityRequest]
  }
  @scala.inline
  implicit class AssumeRoleWithWebIdentityRequestOps[Self <: AssumeRoleWithWebIdentityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoleArn(value: arnType): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleSessionName(value: roleSessionNameType): Self = this.set("RoleSessionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebIdentityToken(value: clientTokenType): Self = this.set("WebIdentityToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationSeconds(value: roleDurationSecondsType): Self = this.set("DurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("DurationSeconds", js.undefined)
    @scala.inline
    def setPolicy(value: sessionPolicyDocumentType): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = this.set("PolicyArns", js.Array(value :_*))
    @scala.inline
    def setPolicyArns(value: policyDescriptorListType): Self = this.set("PolicyArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArns: Self = this.set("PolicyArns", js.undefined)
    @scala.inline
    def setProviderId(value: urlType): Self = this.set("ProviderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderId: Self = this.set("ProviderId", js.undefined)
  }
  
}

