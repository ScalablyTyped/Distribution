package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServersResponse extends js.Object {
  /**
    * When you can get additional results from the ListServers operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing additional file transfer protocol-enabled servers.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transferMod.NextToken] = js.native
  /**
    * An array of file transfer protocol-enabled servers that were listed.
    */
  var Servers: ListedServers = js.native
}

object ListServersResponse {
  @scala.inline
  def apply(Servers: ListedServers): ListServersResponse = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServersResponse]
  }
  @scala.inline
  implicit class ListServersResponseOps[Self <: ListServersResponse] (val x: Self) extends AnyVal {
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
    def setServersVarargs(value: ListedServer*): Self = this.set("Servers", js.Array(value :_*))
    @scala.inline
    def setServers(value: ListedServers): Self = this.set("Servers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

