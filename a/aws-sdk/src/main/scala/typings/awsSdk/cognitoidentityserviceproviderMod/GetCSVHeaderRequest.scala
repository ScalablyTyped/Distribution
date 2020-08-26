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
  @scala.inline
  implicit class GetCSVHeaderRequestOps[Self <: GetCSVHeaderRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

