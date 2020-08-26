package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHandshakesForOrganizationResponse extends js.Object {
  /**
    * A list of Handshake objects with details about each of the handshakes that are associated with an organization.
    */
  var Handshakes: js.UndefOr[typings.awsSdk.organizationsMod.Handshakes] = js.native
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListHandshakesForOrganizationResponse {
  @scala.inline
  def apply(): ListHandshakesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHandshakesForOrganizationResponse]
  }
  @scala.inline
  implicit class ListHandshakesForOrganizationResponseOps[Self <: ListHandshakesForOrganizationResponse] (val x: Self) extends AnyVal {
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
    def setHandshakesVarargs(value: Handshake*): Self = this.set("Handshakes", js.Array(value :_*))
    @scala.inline
    def setHandshakes(value: Handshakes): Self = this.set("Handshakes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandshakes: Self = this.set("Handshakes", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

