package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSigningCertificateRequest extends StObject {
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object GetSigningCertificateRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningCertificateRequest]
  }
  
  @scala.inline
  implicit class GetSigningCertificateRequestMutableBuilder[Self <: GetSigningCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
