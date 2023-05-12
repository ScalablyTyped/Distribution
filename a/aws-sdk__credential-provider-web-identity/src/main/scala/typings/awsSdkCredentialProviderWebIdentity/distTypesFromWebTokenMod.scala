package typings.awsSdkCredentialProviderWebIdentity

import typings.awsSdkCredentialProviderWebIdentity.anon.Arn
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromWebTokenMod {
  
  @JSImport("@aws-sdk/credential-provider-web-identity/dist-types/fromWebToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromWebToken(init: FromWebTokenInit): AwsCredentialIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialIdentityProvider]
  
  trait AssumeRoleWithWebIdentityParams extends StObject {
    
    /**
      * <p>The duration, in seconds, of the role session. The value can range from 900 seconds (15
      *          minutes) up to the maximum session duration setting for the role. This setting can have a
      *          value from 1 hour to 12 hours. If you specify a value higher than this setting, the
      *          operation fails. For example, if you specify a session duration of 12 hours, but your
      *          administrator set the maximum session duration to 6 hours, your operation fails. To learn
      *          how to view the maximum value for your role, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session">View the
      *             Maximum Session Duration Setting for a Role</a> in the
      *             <i>IAM User Guide</i>.</p>
      *          <p>By default, the value is set to <code>3600</code> seconds. </p>
      *          <note>
      *             <p>The <code>DurationSeconds</code> parameter is separate from the duration of a console
      *             session that you might request using the returned credentials. The request to the
      *             federation endpoint for a console sign-in token takes a <code>SessionDuration</code>
      *             parameter that specifies the maximum length of the console session. For more
      *             information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html">Creating a URL
      *                that Enables Federated Users to Access the AWS Management Console</a> in the
      *                <i>IAM User Guide</i>.</p>
      *          </note>
      */
    var DurationSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An IAM policy in JSON format that you want to use as an inline session policy.</p>
      *          <p>This parameter is optional. Passing policies to this operation returns new
      *          temporary credentials. The resulting session's permissions are the intersection of the
      *          role's identity-based policy and the session policies. You can use the role's temporary
      *          credentials in subsequent AWS API calls to access resources in the account that owns
      *          the role. You cannot use session policies to grant more permissions than those allowed
      *          by the identity-based policy of the role that is being assumed. For more information, see
      *             <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
      *             Policies</a> in the <i>IAM User Guide</i>.</p>
      *          <p>The plain text that you use for both inline and managed session policies can't exceed
      *          2,048 characters. The JSON policy characters can be any ASCII character from the space
      *          character to the end of the valid character list (\\u0020 through \\u00FF). It can also
      *          include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D)
      *          characters.</p>
      *          <note>
      *             <p>An AWS conversion compresses the passed session policies and session tags into a
      *             packed binary format that has a separate limit. Your request can fail for this limit
      *             even if your plain text meets the other requirements. The <code>PackedPolicySize</code>
      *             response element indicates by percentage how close the policies and tags for your
      *             request are to the upper size limit.
      *             </p>
      *          </note>
      */
    var Policy: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as
      *          managed session policies. The policies must exist in the same account as the role.</p>
      *          <p>This parameter is optional. You can provide up to 10 managed policy ARNs. However, the
      *          plain text that you use for both inline and managed session policies can't exceed 2,048
      *          characters. For more information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and AWS
      *             Service Namespaces</a> in the AWS General Reference.</p>
      *          <note>
      *             <p>An AWS conversion compresses the passed session policies and session tags into a
      *             packed binary format that has a separate limit. Your request can fail for this limit
      *             even if your plain text meets the other requirements. The <code>PackedPolicySize</code>
      *             response element indicates by percentage how close the policies and tags for your
      *             request are to the upper size limit.
      *             </p>
      *          </note>
      *
      *          <p>Passing policies to this operation returns new
      *          temporary credentials. The resulting session's permissions are the intersection of the
      *          role's identity-based policy and the session policies. You can use the role's temporary
      *          credentials in subsequent AWS API calls to access resources in the account that owns
      *          the role. You cannot use session policies to grant more permissions than those allowed
      *          by the identity-based policy of the role that is being assumed. For more information, see
      *             <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
      *             Policies</a> in the <i>IAM User Guide</i>.</p>
      */
    var PolicyArns: js.UndefOr[js.Array[Arn]] = js.undefined
    
    /**
      * <p>The fully qualified host component of the domain name of the identity provider.</p>
      *          <p>Specify this value only for OAuth 2.0 access tokens. Currently
      *             <code>www.amazon.com</code> and <code>graph.facebook.com</code> are the only supported
      *          identity providers for OAuth 2.0 access tokens. Do not include URL schemes and port
      *          numbers.</p>
      *          <p>Do not specify this value for OpenID Connect ID tokens.</p>
      */
    var ProviderId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The Amazon Resource Name (ARN) of the role that the caller is assuming.</p>
      */
    var RoleArn: String
    
    /**
      * <p>An identifier for the assumed role session. Typically, you pass the name or identifier
      *          that is associated with the user who is using your application. That way, the temporary
      *          security credentials that your application will use are associated with that user. This
      *          session name is included as part of the ARN and assumed role ID in the
      *             <code>AssumedRoleUser</code> response element.</p>
      *          <p>The regex used to validate this parameter is a string of characters
      *     consisting of upper- and lower-case alphanumeric characters with no spaces. You can
      *     also include underscores or any of the following characters: =,.@-</p>
      */
    var RoleSessionName: String
    
    /**
      * <p>The OAuth 2.0 access token or OpenID Connect ID token that is provided by the identity
      *          provider. Your application must get this token by authenticating the user who is using your
      *          application with a web identity provider before the application makes an
      *             <code>AssumeRoleWithWebIdentity</code> call. </p>
      */
    var WebIdentityToken: String
  }
  object AssumeRoleWithWebIdentityParams {
    
    inline def apply(RoleArn: String, RoleSessionName: String, WebIdentityToken: String): AssumeRoleWithWebIdentityParams = {
      val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleWithWebIdentityParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssumeRoleWithWebIdentityParams] (val x: Self) extends AnyVal {
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyArns(value: js.Array[Arn]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
      
      inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
      
      inline def setPolicyArnsVarargs(value: Arn*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "ProviderId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "ProviderId", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      inline def setWebIdentityToken(value: String): Self = StObject.set(x, "WebIdentityToken", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@aws-sdk/credential-provider-web-identity.@aws-sdk/credential-provider-web-identity/dist-types/fromWebToken.LowerCaseKey<@aws-sdk/credential-provider-web-identity.@aws-sdk/credential-provider-web-identity/dist-types/fromWebToken.AssumeRoleWithWebIdentityParams>, 'roleSessionName'> */
  trait FromWebTokenInit extends StObject {
    
    var DurationSeconds: js.UndefOr[Double] = js.undefined
    
    var Policy: js.UndefOr[String] = js.undefined
    
    var PolicyArns: js.UndefOr[js.Array[Arn]] = js.undefined
    
    var ProviderId: js.UndefOr[String] = js.undefined
    
    var RoleArn: String
    
    var RoleSessionName: String
    
    var WebIdentityToken: String
    
    /**
      * A function that assumes a role with web identity and returns a promise fulfilled with
      * credentials for the assumed role.
      *
      * @param params input parameter of sts:AssumeRoleWithWebIdentity API.
      */
    var roleAssumerWithWebIdentity: js.UndefOr[
        js.Function1[/* params */ AssumeRoleWithWebIdentityParams, js.Promise[AwsCredentialIdentity]]
      ] = js.undefined
    
    /**
      * The IAM session name used to distinguish sessions.
      */
    var roleSessionName: js.UndefOr[String] = js.undefined
  }
  object FromWebTokenInit {
    
    inline def apply(RoleArn: String, RoleSessionName: String, WebIdentityToken: String): FromWebTokenInit = {
      val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], RoleSessionName = RoleSessionName.asInstanceOf[js.Any], WebIdentityToken = WebIdentityToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromWebTokenInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromWebTokenInit] (val x: Self) extends AnyVal {
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyArns(value: js.Array[Arn]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
      
      inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
      
      inline def setPolicyArnsVarargs(value: Arn*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "ProviderId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdUndefined: Self = StObject.set(x, "ProviderId", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleAssumerWithWebIdentity(value: /* params */ AssumeRoleWithWebIdentityParams => js.Promise[AwsCredentialIdentity]): Self = StObject.set(x, "roleAssumerWithWebIdentity", js.Any.fromFunction1(value))
      
      inline def setRoleAssumerWithWebIdentityUndefined: Self = StObject.set(x, "roleAssumerWithWebIdentity", js.undefined)
      
      inline def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      inline def setRoleSessionNameUndefined: Self = StObject.set(x, "roleSessionName", js.undefined)
      
      inline def setWebIdentityToken(value: String): Self = StObject.set(x, "WebIdentityToken", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as / * template literal string: ${Uncapitalize<string&K>} * / string ]: T[K]}
    }}}
    */
  @js.native
  trait LowerCaseKey[T] extends StObject
}
