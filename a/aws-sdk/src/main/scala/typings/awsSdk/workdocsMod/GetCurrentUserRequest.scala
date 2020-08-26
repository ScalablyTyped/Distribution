package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentUserRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token.
    */
  var AuthenticationToken: AuthenticationHeaderType = js.native
}

object GetCurrentUserRequest {
  @scala.inline
  def apply(AuthenticationToken: AuthenticationHeaderType): GetCurrentUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationToken = AuthenticationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentUserRequest]
  }
  @scala.inline
  implicit class GetCurrentUserRequestOps[Self <: GetCurrentUserRequest] (val x: Self) extends AnyVal {
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
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = this.set("AuthenticationToken", value.asInstanceOf[js.Any])
  }
  
}

