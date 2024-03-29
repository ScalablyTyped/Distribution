package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleWithWebIdentityResponse extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you
    *          can use to refer to the resulting temporary security credentials. For example, you can
    *          reference these credentials as a principal in a resource-based policy by using the ARN or
    *          assumed role ID. The ARN and ID include the <code>RoleSessionName</code> that you specified
    *          when you called <code>AssumeRole</code>. </p>
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumedRoleUser] = js.undefined
  
  /**
    * <p>The intended audience (also known as client ID) of the web identity token. This is
    *          traditionally the client identifier issued to the application that requested the web
    *          identity token.</p>
    */
  var Audience: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The temporary security credentials, which include an access key ID, a secret access key,
    *          and a security token.</p>
    *          <note>
    *             <p>The size of the security token that STS API operations return is not fixed. We
    *         strongly recommend that you make no assumptions about the maximum size.</p>
    *          </note>
    */
  var Credentials: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.Credentials] = js.undefined
  
  /**
    * <p>A percentage value that indicates the packed size of the session policies and session
    *       tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
    *       which means the policies and tags exceeded the allowed space.</p>
    */
  var PackedPolicySize: js.UndefOr[Double] = js.undefined
  
  /**
    * <p> The issuing authority of the web identity token presented. For OpenID Connect ID
    *          tokens, this contains the value of the <code>iss</code> field. For OAuth 2.0 access tokens,
    *          this contains the value of the <code>ProviderId</code> parameter that was passed in the
    *             <code>AssumeRoleWithWebIdentity</code> request.</p>
    */
  var Provider: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The value of the source identity that is returned in the JSON web token (JWT) from the
    *          identity provider.</p>
    *          <p>You can require users to set a source identity value when they assume a role. You do
    *          this by using the <code>sts:SourceIdentity</code> condition key in a role trust policy.
    *          That way, actions that are taken with the role are associated with that user. After the
    *          source identity is set, the value cannot be changed. It is present in the request for all
    *          actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
    *             role</a> sessions. You can configure your identity provider to use an attribute
    *          associated with your users, like user name or email, as the source identity when calling
    *             <code>AssumeRoleWithWebIdentity</code>. You do this by adding a claim to the JSON web
    *          token. To learn more about OIDC tokens and claims, see <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html">Using Tokens with User Pools</a> in the <i>Amazon Cognito Developer Guide</i>.
    *          For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
    *             actions taken with assumed roles</a> in the
    *          <i>IAM User Guide</i>.</p>
    *          <p>The regex used to validate this parameter is a string of characters
    *     consisting of upper- and lower-case alphanumeric characters with no spaces. You can
    *     also include underscores or any of the following characters: =,.@-</p>
    */
  var SourceIdentity: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The unique user identifier that is returned by the identity provider. This identifier is
    *          associated with the <code>WebIdentityToken</code> that was submitted with the
    *             <code>AssumeRoleWithWebIdentity</code> call. The identifier is typically unique to the
    *          user and the application that acquired the <code>WebIdentityToken</code> (pairwise
    *          identifier). For OpenID Connect ID tokens, this field contains the value returned by the
    *          identity provider as the token's <code>sub</code> (Subject) claim. </p>
    */
  var SubjectFromWebIdentityToken: js.UndefOr[String] = js.undefined
}
object AssumeRoleWithWebIdentityResponse {
  
  inline def apply(): AssumeRoleWithWebIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithWebIdentityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssumeRoleWithWebIdentityResponse] (val x: Self) extends AnyVal {
    
    inline def setAssumedRoleUser(value: AssumedRoleUser): Self = StObject.set(x, "AssumedRoleUser", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleUserUndefined: Self = StObject.set(x, "AssumedRoleUser", js.undefined)
    
    inline def setAudience(value: String): Self = StObject.set(x, "Audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "Audience", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setPackedPolicySize(value: Double): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    inline def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setSourceIdentity(value: String): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
    
    inline def setSubjectFromWebIdentityToken(value: String): Self = StObject.set(x, "SubjectFromWebIdentityToken", value.asInstanceOf[js.Any])
    
    inline def setSubjectFromWebIdentityTokenUndefined: Self = StObject.set(x, "SubjectFromWebIdentityToken", js.undefined)
  }
}
