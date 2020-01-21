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
  def apply(Connections: ConnectionList = null, NextToken: NextToken = null): ListConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    if (Connections != null) __obj.updateDynamic("Connections")(Connections.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectionsOutput]
  }
}

