package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningCertificateRequest extends js.Object {
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
}

