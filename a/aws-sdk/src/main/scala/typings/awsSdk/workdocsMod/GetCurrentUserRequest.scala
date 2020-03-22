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
}

