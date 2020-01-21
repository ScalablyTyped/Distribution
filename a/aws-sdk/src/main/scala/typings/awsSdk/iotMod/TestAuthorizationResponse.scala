package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestAuthorizationResponse extends js.Object {
  /**
    * The authentication results.
    */
  var authResults: js.UndefOr[AuthResults] = js.native
}

object TestAuthorizationResponse {
  @scala.inline
  def apply(authResults: AuthResults = null): TestAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    if (authResults != null) __obj.updateDynamic("authResults")(authResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAuthorizationResponse]
  }
}

