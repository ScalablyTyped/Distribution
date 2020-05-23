package typings.azdata.mod.connection

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends ConnectionInfo {
  /**
    * A unique identifier for the connection
    */
  var connectionId: String
  /**
    * The name of the provider managing the connection (e.g. MSSQL)
    */
  var providerName: String
}

object Connection {
  @scala.inline
  def apply(connectionId: String, options: StringDictionary[js.Any], providerName: String): Connection = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

