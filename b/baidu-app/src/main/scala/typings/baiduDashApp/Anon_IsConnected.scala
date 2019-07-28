package typings.baiduDashApp

import typings.baiduDashApp.swanNs.networkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConnected extends js.Object {
  var isConnected: Boolean
  var networkType: typings.baiduDashApp.swanNs.networkType
}

object Anon_IsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: networkType): Anon_IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected, networkType = networkType)
  
    __obj.asInstanceOf[Anon_IsConnected]
  }
}

