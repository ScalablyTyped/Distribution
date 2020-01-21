package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCSVHeaderRequest extends js.Object {
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object GetCSVHeaderRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetCSVHeaderRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCSVHeaderRequest]
  }
}

