package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusStation extends js.Object {
  var name: String
  var position: Point
}

object BusStation {
  @scala.inline
  def apply(name: String, position: Point): BusStation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BusStation]
  }
}

