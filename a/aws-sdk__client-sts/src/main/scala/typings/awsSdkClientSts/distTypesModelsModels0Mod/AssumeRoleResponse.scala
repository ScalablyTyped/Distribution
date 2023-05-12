package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleResponse extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) and the assumed role ID, which are identifiers that you
    *          can use to refer to the resulting temporary security credentials. For example, you can
    *          reference these credentials as a principal in a resource-based policy by using the ARN or
    *          assumed role ID. The ARN and ID include the <code>RoleSessionName</code> that you specified
    *          when you called <code>AssumeRole</code>. </p>
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumedRoleUser] = js.undefined
  
  /**
    * <p>The temporary security credentials, which include an access key ID, a secret access key,
    *          and a security (or session) token.</p>
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
    * <p>The source identity specified by the principal that is calling the
    *             <code>AssumeRole</code> operation.</p>
    *          <p>You can require users to specify a source identity when they assume a role. You do this
    *          by using the <code>sts:SourceIdentity</code> condition key in a role trust policy. You can
    *          use source identity information in CloudTrail logs to determine who took actions with a role.
    *          You can use the <code>aws:SourceIdentity</code> condition key to further control access to
    *          Amazon Web Services resources based on the value of source identity. For more information about using
    *          source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
    *             actions taken with assumed roles</a> in the
    *          <i>IAM User Guide</i>.</p>
    *          <p>The regex used to validate this parameter is a string of characters consisting of upper-
    *          and lower-case alphanumeric characters with no spaces. You can also include underscores or
    *          any of the following characters: =,.@-</p>
    */
  var SourceIdentity: js.UndefOr[String] = js.undefined
}
object AssumeRoleResponse {
  
  inline def apply(): AssumeRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssumeRoleResponse] (val x: Self) extends AnyVal {
    
    inline def setAssumedRoleUser(value: AssumedRoleUser): Self = StObject.set(x, "AssumedRoleUser", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleUserUndefined: Self = StObject.set(x, "AssumedRoleUser", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setPackedPolicySize(value: Double): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    inline def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
    
    inline def setSourceIdentity(value: String): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
  }
}
