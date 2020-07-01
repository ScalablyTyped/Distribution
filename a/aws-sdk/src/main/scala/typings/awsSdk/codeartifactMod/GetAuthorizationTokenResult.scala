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
  def apply(authorizationToken: String = null, expiration: Timestamp = null): GetAuthorizationTokenResult = {
    val __obj = js.Dynamic.literal()
    if (authorizationToken != null) __obj.updateDynamic("authorizationToken")(authorizationToken.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizationTokenResult]
  }
}

