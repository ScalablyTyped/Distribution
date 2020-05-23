package typings.cordovaPluginNetworkInformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /**
    * This plugin provides an implementation of an old version of the Network Information API.
    * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
    */
  var connection: typings.cordovaPluginNetworkInformation.Connection
}

object Connection {
  @scala.inline
  def apply(connection: typings.cordovaPluginNetworkInformation.Connection): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

