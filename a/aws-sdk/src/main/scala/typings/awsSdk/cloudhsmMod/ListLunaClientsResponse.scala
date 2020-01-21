package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLunaClientsResponse extends js.Object {
  /**
    * The list of clients.
    */
  var ClientList: typings.awsSdk.cloudhsmMod.ClientList = js.native
  /**
    * If not null, more results are available. Pass this to ListLunaClients to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListLunaClientsResponse {
  @scala.inline
  def apply(ClientList: ClientList, NextToken: PaginationToken = null): ListLunaClientsResponse = {
    val __obj = js.Dynamic.literal(ClientList = ClientList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLunaClientsResponse]
  }
}

