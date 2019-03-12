package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkTypeData extends js.Object {
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: baiduDashAppLib.swanNs.networkType
}

object NetworkTypeData {
  @scala.inline
  def apply(networkType: networkType): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType)
  
    __obj.asInstanceOf[NetworkTypeData]
  }
}

