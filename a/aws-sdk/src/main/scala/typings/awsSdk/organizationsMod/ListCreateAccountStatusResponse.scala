package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreateAccountStatusResponse extends js.Object {
  /**
    * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
    */
  var CreateAccountStatuses: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatuses] = js.native
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListCreateAccountStatusResponse {
  @scala.inline
  def apply(): ListCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreateAccountStatusResponse]
  }
  @scala.inline
  implicit class ListCreateAccountStatusResponseOps[Self <: ListCreateAccountStatusResponse] (val x: Self) extends AnyVal {
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
    def setCreateAccountStatusesVarargs(value: CreateAccountStatus*): Self = this.set("CreateAccountStatuses", js.Array(value :_*))
    @scala.inline
    def setCreateAccountStatuses(value: CreateAccountStatuses): Self = this.set("CreateAccountStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateAccountStatuses: Self = this.set("CreateAccountStatuses", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

