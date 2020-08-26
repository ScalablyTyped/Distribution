package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPoolClientsResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  /**
    * The user pool clients in the response that lists user pool clients.
    */
  var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.native
}

object ListUserPoolClientsResponse {
  @scala.inline
  def apply(): ListUserPoolClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPoolClientsResponse]
  }
  @scala.inline
  implicit class ListUserPoolClientsResponseOps[Self <: ListUserPoolClientsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationKey): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserPoolClientsVarargs(value: UserPoolClientDescription*): Self = this.set("UserPoolClients", js.Array(value :_*))
    @scala.inline
    def setUserPoolClients(value: UserPoolClientListType): Self = this.set("UserPoolClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolClients: Self = this.set("UserPoolClients", js.undefined)
  }
  
}

