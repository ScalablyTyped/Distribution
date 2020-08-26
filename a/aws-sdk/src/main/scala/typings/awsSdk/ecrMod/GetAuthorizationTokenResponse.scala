package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenResponse extends js.Object {
  /**
    * A list of authorization token data objects that correspond to the registryIds values in the request.
    */
  var authorizationData: js.UndefOr[AuthorizationDataList] = js.native
}

object GetAuthorizationTokenResponse {
  @scala.inline
  def apply(): GetAuthorizationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenResponse]
  }
  @scala.inline
  implicit class GetAuthorizationTokenResponseOps[Self <: GetAuthorizationTokenResponse] (val x: Self) extends AnyVal {
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
    def setAuthorizationDataVarargs(value: AuthorizationData*): Self = this.set("authorizationData", js.Array(value :_*))
    @scala.inline
    def setAuthorizationData(value: AuthorizationDataList): Self = this.set("authorizationData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationData: Self = this.set("authorizationData", js.undefined)
  }
  
}

