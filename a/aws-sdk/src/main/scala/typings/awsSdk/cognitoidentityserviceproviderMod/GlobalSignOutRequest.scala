package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSignOutRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
}

object GlobalSignOutRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): GlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSignOutRequest]
  }
  @scala.inline
  implicit class GlobalSignOutRequestOps[Self <: GlobalSignOutRequest] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
  }
  
}

