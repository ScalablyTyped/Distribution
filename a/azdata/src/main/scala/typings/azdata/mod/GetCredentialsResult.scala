package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsResult extends ResultStatus {
  var credentials: js.Array[CredentialInfo] = js.native
}

object GetCredentialsResult {
  @scala.inline
  def apply(credentials: js.Array[CredentialInfo], errorMessage: String, success: Boolean): GetCredentialsResult = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResult]
  }
  @scala.inline
  implicit class GetCredentialsResultOps[Self <: GetCredentialsResult] (val x: Self) extends AnyVal {
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
    def setCredentialsVarargs(value: CredentialInfo*): Self = this.set("credentials", js.Array(value :_*))
    @scala.inline
    def setCredentials(value: js.Array[CredentialInfo]): Self = this.set("credentials", value.asInstanceOf[js.Any])
  }
  
}

