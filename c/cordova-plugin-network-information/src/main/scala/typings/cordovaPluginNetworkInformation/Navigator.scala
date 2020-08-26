package typings.cordovaPluginNetworkInformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /**
    * This plugin provides an implementation of an old version of the Network Information API.
    * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
    */
  var connection: Connection = js.native
  // see https://github.com/apache/cordova-plugin-network-information/blob/dev/doc/index.md#api-change
  // for 
  var network: typings.cordovaPluginNetworkInformation.anon.Connection = js.native
}

object Navigator {
  @scala.inline
  def apply(connection: Connection, network: typings.cordovaPluginNetworkInformation.anon.Connection): Navigator = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
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
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork(value: typings.cordovaPluginNetworkInformation.anon.Connection): Self = this.set("network", value.asInstanceOf[js.Any])
  }
  
}

