package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectionsOutput extends js.Object {
  /**
    * A list of connections and the details for each connection, such as status, owner, and provider type.
    */
  var Connections: js.UndefOr[ConnectionList] = js.native
  /**
    * A token that can be used in the next ListConnections call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarconnectionsMod.NextToken] = js.native
}

object ListConnectionsOutput {
  @scala.inline
  def apply(): ListConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsOutput]
  }
  @scala.inline
  implicit class ListConnectionsOutputOps[Self <: ListConnectionsOutput] (val x: Self) extends AnyVal {
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
    def setConnectionsVarargs(value: Connection*): Self = this.set("Connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: ConnectionList): Self = this.set("Connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("Connections", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

