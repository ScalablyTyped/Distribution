package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizationTokenResult extends js.Object {
  /**
    *  The returned authentication token. 
    */
  var authorizationToken: js.UndefOr[String] = js.native
  /**
    *  A timestamp that specifies the date and time the authorization token expires. 
    */
  var expiration: js.UndefOr[Timestamp] = js.native
}

object GetAuthorizationTokenResult {
  @scala.inline
  def apply(): GetAuthorizationTokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenResult]
  }
  @scala.inline
  implicit class GetAuthorizationTokenResultOps[Self <: GetAuthorizationTokenResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorizationToken(value: String): Self = this.set("authorizationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationToken: Self = this.set("authorizationToken", js.undefined)
    @scala.inline
    def setExpiration(value: Timestamp): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
  }
  
}

