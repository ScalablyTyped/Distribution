package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDelegatedAdministratorsResponse extends js.Object {
  /**
    * The list of delegated administrators in your organization.
    */
  var DelegatedAdministrators: js.UndefOr[typings.awsSdk.organizationsMod.DelegatedAdministrators] = js.native
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListDelegatedAdministratorsResponse {
  @scala.inline
  def apply(): ListDelegatedAdministratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatedAdministratorsResponse]
  }
  @scala.inline
  implicit class ListDelegatedAdministratorsResponseOps[Self <: ListDelegatedAdministratorsResponse] (val x: Self) extends AnyVal {
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
    def setDelegatedAdministratorsVarargs(value: DelegatedAdministrator*): Self = this.set("DelegatedAdministrators", js.Array(value :_*))
    @scala.inline
    def setDelegatedAdministrators(value: DelegatedAdministrators): Self = this.set("DelegatedAdministrators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatedAdministrators: Self = this.set("DelegatedAdministrators", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

