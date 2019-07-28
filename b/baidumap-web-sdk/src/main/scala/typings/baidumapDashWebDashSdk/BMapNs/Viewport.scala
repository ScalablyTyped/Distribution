package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var center: Point
  var zoom: Double
}

object Viewport {
  @scala.inline
  def apply(center: Point, zoom: Double): Viewport = {
    val __obj = js.Dynamic.literal(center = center, zoom = zoom)
  
    __obj.asInstanceOf[Viewport]
  }
}

