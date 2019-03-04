package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusStation extends js.Object {
  var name: java.lang.String
  var position: Point
}

object BusStation {
  @scala.inline
  def apply(name: java.lang.String, position: Point): BusStation = {
    val __obj = js.Dynamic.literal(name = name, position = position)
  
    __obj.asInstanceOf[BusStation]
  }
}

