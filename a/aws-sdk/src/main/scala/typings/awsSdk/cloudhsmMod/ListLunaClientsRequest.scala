package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLunaClientsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListLunaClients. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListLunaClientsRequest {
  @scala.inline
  def apply(NextToken: PaginationToken = null): ListLunaClientsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLunaClientsRequest]
  }
}

