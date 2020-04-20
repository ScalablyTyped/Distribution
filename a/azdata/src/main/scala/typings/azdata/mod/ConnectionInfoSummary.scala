package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfoSummary extends js.Object {
  /**
  		 * connection id returned from service host.
  		 */
  var connectionId: String
  /**
  		 * information about the actual connection established
  		 */
  var connectionSummary: ConnectionSummary
  /**
  		 * Error message returned from the engine, if any.
  		 */
  var errorMessage: String
  /**
  		 * Error number returned from the engine, if any.
  		 */
  var errorNumber: Double
  /**
  		 * any diagnostic messages return from the service host.
  		 */
  var messages: String
  /**
  		 * URI identifying the owner of the connection
  		 */
  var ownerUri: String
  /**
  		 * Information about the connected server.
  		 */
  var serverInfo: ServerInfo
}

object ConnectionInfoSummary {
  @scala.inline
  def apply(
    connectionId: String,
    connectionSummary: ConnectionSummary,
    errorMessage: String,
    errorNumber: Double,
    messages: String,
    ownerUri: String,
    serverInfo: ServerInfo
  ): ConnectionInfoSummary = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], connectionSummary = connectionSummary.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorNumber = errorNumber.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfoSummary]
  }
}

