package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHandshakesForAccountResponse extends js.Object {
  /**
    * A list of Handshake objects with details about each of the handshakes that is associated with the specified account.
    */
  var Handshakes: js.UndefOr[typings.awsSdk.organizationsMod.Handshakes] = js.native
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}

object ListHandshakesForAccountResponse {
  @scala.inline
  def apply(Handshakes: Handshakes = null, NextToken: NextToken = null): ListHandshakesForAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshakes != null) __obj.updateDynamic("Handshakes")(Handshakes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHandshakesForAccountResponse]
  }
}

