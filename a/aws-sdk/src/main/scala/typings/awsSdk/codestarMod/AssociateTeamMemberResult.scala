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
  def apply(clientRequestToken: ClientRequestToken = null): AssociateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTeamMemberResult]
  }
}

