package typings
package cordovaDashPluginDashNetworkDashInformationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Navigator extends js.Object {
  /**
       * This plugin provides an implementation of an old version of the Network Information API.
       * It provides information about the device's cellular and wifi connection, and whether the device has an internet connection.
       */
  var connection: Connection
  // see https://github.com/apache/cordova-plugin-network-information/blob/dev/doc/index.md#api-change
  // for 
  var network: Anon_Connection
}

