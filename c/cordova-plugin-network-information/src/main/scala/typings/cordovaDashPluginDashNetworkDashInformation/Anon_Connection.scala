package typings.cordovaDashPluginDashNetworkDashInformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  /**
    * This plugin provides an implementation of an old version of the Network Information API.
    * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
    */
  var connection: Connection
}

object Anon_Connection {
  @scala.inline
  def apply(connection: Connection): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

