package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangedConnectionInfo extends js.Object {
  /**
    * Summary of details containing any connection changes.
    */
  var connection: ConnectionSummary
  /**
    * Owner URI of the connection that changed.
    */
  var connectionUri: String
}

object ChangedConnectionInfo {
  @scala.inline
  def apply(connection: ConnectionSummary, connectionUri: String): ChangedConnectionInfo = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], connectionUri = connectionUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedConnectionInfo]
  }
}

