package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServersResponse extends js.Object {
  /**
    * When you can get additional results from the ListServers operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing additional servers.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
  /**
    * An array of servers that were listed.
    */
  var Servers: ListedServers = js.native
}

object ListServersResponse {
  @scala.inline
  def apply(Servers: ListedServers, NextToken: NextToken = null): ListServersResponse = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServersResponse]
  }
}

