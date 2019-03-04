package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBeaconsSuccess extends js.Object {
  var beacons: js.Array[Beacon]
  var errMsg: java.lang.String
}

object GetBeaconsSuccess {
  @scala.inline
  def apply(beacons: js.Array[Beacon], errMsg: java.lang.String): GetBeaconsSuccess = {
    val __obj = js.Dynamic.literal(beacons = beacons, errMsg = errMsg)
  
    __obj.asInstanceOf[GetBeaconsSuccess]
  }
}

