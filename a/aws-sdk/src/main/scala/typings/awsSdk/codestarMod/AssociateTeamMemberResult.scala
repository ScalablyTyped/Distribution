package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTeamMemberResult extends js.Object {
  /**
    * The user- or system-generated token from the initial request that can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
}

object AssociateTeamMemberResult {
  @scala.inline
  def apply(): AssociateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTeamMemberResult]
  }
  @scala.inline
  implicit class AssociateTeamMemberResultOps[Self <: AssociateTeamMemberResult] (val x: Self) extends AnyVal {
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
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
  }
  
}

