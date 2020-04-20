package typings.baiduApp

import typings.baiduApp.swan.networkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsConnected extends js.Object {
  var isConnected: Boolean
  var networkType: typings.baiduApp.swan.networkType
}

object AnonIsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: networkType): AnonIsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsConnected]
  }
}

