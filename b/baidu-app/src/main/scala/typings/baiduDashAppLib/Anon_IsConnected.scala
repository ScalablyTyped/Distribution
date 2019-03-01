package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConnected extends js.Object {
  var isConnected: scala.Boolean
  var networkType: baiduDashAppLib.swanNs.networkType
}

object Anon_IsConnected {
  @scala.inline
  def apply(isConnected: scala.Boolean, networkType: baiduDashAppLib.swanNs.networkType): Anon_IsConnected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isConnected")(isConnected)
    __obj.updateDynamic("networkType")(networkType)
    __obj.asInstanceOf[Anon_IsConnected]
  }
}

