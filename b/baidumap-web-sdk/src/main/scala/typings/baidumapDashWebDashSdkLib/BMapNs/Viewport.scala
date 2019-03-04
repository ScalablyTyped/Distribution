package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var center: Point
  var zoom: scala.Double
}

object Viewport {
  @scala.inline
  def apply(center: Point, zoom: scala.Double): Viewport = {
    val __obj = js.Dynamic.literal(center = center, zoom = zoom)
  
    __obj.asInstanceOf[Viewport]
  }
}

