package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFederationTokenResponse extends StObject {
  
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.stsMod.Credentials] = js.native
  
  /**
    * Identifiers for the federated user associated with the credentials (such as arn:aws:sts::123456789012:federated-user/Bob or 123456789012:Bob). You can use the federated user's ARN in your resource-based policies, such as an Amazon S3 bucket policy. 
    */
  var FederatedUser: js.UndefOr[typings.awsSdk.stsMod.FederatedUser] = js.native
  
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
}
object GetFederationTokenResponse {
  
  @scala.inline
  def apply(): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
  
  @scala.inline
  implicit class GetFederationTokenResponseMutableBuilder[Self <: GetFederationTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    @scala.inline
    def setFederatedUser(value: FederatedUser): Self = StObject.set(x, "FederatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedUserUndefined: Self = StObject.set(x, "FederatedUser", js.undefined)
    
    @scala.inline
    def setPackedPolicySize(value: nonNegativeIntegerType): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
  }
}
