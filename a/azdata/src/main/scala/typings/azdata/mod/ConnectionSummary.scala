package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionSummary extends js.Object {
  /**
  		 * database name
  		 */
  var databaseName: String
  /**
  		 * server name
  		 */
  var serverName: String
  /**
  		 * user name
  		 */
  var userName: String
}

object ConnectionSummary {
  @scala.inline
  def apply(databaseName: String, serverName: String, userName: String): ConnectionSummary = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionSummary]
  }
}

