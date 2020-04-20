package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsResult extends ResultStatus {
  var credentials: js.Array[CredentialInfo]
}

object GetCredentialsResult {
  @scala.inline
  def apply(credentials: js.Array[CredentialInfo], errorMessage: String, success: Boolean): GetCredentialsResult = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResult]
  }
}

