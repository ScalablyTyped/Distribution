package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleWithSAMLRequest extends StObject {
  
  /**
    * <p>The duration, in seconds, of the role session. Your role session lasts for the duration
    *          that you specify for the <code>DurationSeconds</code> parameter, or until the time
    *          specified in the SAML authentication response's <code>SessionNotOnOrAfter</code> value,
    *          whichever is shorter. You can provide a <code>DurationSeconds</code> value from 900 seconds
    *          (15 minutes) up to the maximum session duration setting for the role. This setting can have
    *          a value from 1 hour to 12 hours. If you specify a value higher than this setting, the
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
    *                that Enables Federated Users to Access the Amazon Web Services Management Console</a> in the
    *                <i>IAM User Guide</i>.</p>
    *          </note>
    */
  var DurationSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>An IAM policy in JSON format that you want to use as an inline session policy.</p>
    *          <p>This parameter is optional. Passing policies to this operation returns new
    *          temporary credentials. The resulting session's permissions are the intersection of the
    *          role's identity-based policy and the session policies. You can use the role's temporary
    *          credentials in subsequent Amazon Web Services API calls to access resources in the account that owns
    *          the role. You cannot use session policies to grant more permissions than those allowed
    *          by the identity-based policy of the role that is being assumed. For more information, see
    *             <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
    *             Policies</a> in the <i>IAM User Guide</i>. </p>
    *          <p>The plaintext that you use for both inline and managed session policies can't exceed
    *          2,048 characters. The JSON policy characters can be any ASCII character from the space
    *          character to the end of the valid character list (\\u0020 through \\u00FF). It can also
    *          include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D)
    *          characters.</p>
    *
    *          <note>
    *             <p>An Amazon Web Services conversion compresses the passed session policies and session tags into a
    *             packed binary format that has a separate limit. Your request can fail for this limit
    *             even if your plaintext meets the other requirements. The <code>PackedPolicySize</code>
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
    *          plaintext that you use for both inline and managed session policies can't exceed 2,048
    *          characters. For more information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
    *             Service Namespaces</a> in the Amazon Web Services General Reference.</p>
    *
    *          <note>
    *             <p>An Amazon Web Services conversion compresses the passed session policies and session tags into a
    *             packed binary format that has a separate limit. Your request can fail for this limit
    *             even if your plaintext meets the other requirements. The <code>PackedPolicySize</code>
    *             response element indicates by percentage how close the policies and tags for your
    *             request are to the upper size limit.
    *             </p>
    *          </note>
    *
    *          <p>Passing policies to this operation returns new
    *          temporary credentials. The resulting session's permissions are the intersection of the
    *          role's identity-based policy and the session policies. You can use the role's temporary
    *          credentials in subsequent Amazon Web Services API calls to access resources in the account that owns
    *          the role. You cannot use session policies to grant more permissions than those allowed
    *          by the identity-based policy of the role that is being assumed. For more information, see
    *             <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session
    *             Policies</a> in the <i>IAM User Guide</i>.</p>
    */
  var PolicyArns: js.UndefOr[js.Array[PolicyDescriptorType]] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the
    *          IdP.</p>
    */
  var PrincipalArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Resource Name (ARN) of the role that the caller is assuming.</p>
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The base64 encoded SAML authentication response provided by the IdP.</p>
    *          <p>For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html">Configuring a Relying Party and
    *             Adding Claims</a> in the <i>IAM User Guide</i>. </p>
    */
  var SAMLAssertion: js.UndefOr[String] = js.undefined
}
object AssumeRoleWithSAMLRequest {
  
  inline def apply(): AssumeRoleWithSAMLRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithSAMLRequest]
  }
  
  extension [Self <: AssumeRoleWithSAMLRequest](x: Self) {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArns(value: js.Array[PolicyDescriptorType]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
    
    inline def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setPrincipalArn(value: String): Self = StObject.set(x, "PrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArnUndefined: Self = StObject.set(x, "PrincipalArn", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSAMLAssertion(value: String): Self = StObject.set(x, "SAMLAssertion", value.asInstanceOf[js.Any])
    
    inline def setSAMLAssertionUndefined: Self = StObject.set(x, "SAMLAssertion", js.undefined)
  }
}
