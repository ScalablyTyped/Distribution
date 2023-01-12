package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFederationTokenResponse extends StObject {
  
  /**
    * <p>The temporary security credentials, which include an access key ID, a secret access key,
    *          and a security (or session) token.</p>
    *
    *          <note>
    *             <p>The size of the security token that STS API operations return is not fixed. We
    *         strongly recommend that you make no assumptions about the maximum size.</p>
    *          </note>
    */
  var Credentials: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.Credentials] = js.undefined
  
  /**
    * <p>Identifiers for the federated user associated with the credentials (such as
    *             <code>arn:aws:sts::123456789012:federated-user/Bob</code> or
    *             <code>123456789012:Bob</code>). You can use the federated user's ARN in your
    *          resource-based policies, such as an Amazon S3 bucket policy. </p>
    */
  var FederatedUser: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.FederatedUser] = js.undefined
  
  /**
    * <p>A percentage value that indicates the packed size of the session policies and session
    *       tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
    *       which means the policies and tags exceeded the allowed space.</p>
    */
  var PackedPolicySize: js.UndefOr[Double] = js.undefined
}
object GetFederationTokenResponse {
  
  inline def apply(): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFederationTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setFederatedUser(value: FederatedUser): Self = StObject.set(x, "FederatedUser", value.asInstanceOf[js.Any])
    
    inline def setFederatedUserUndefined: Self = StObject.set(x, "FederatedUser", js.undefined)
    
    inline def setPackedPolicySize(value: Double): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    inline def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
  }
}
