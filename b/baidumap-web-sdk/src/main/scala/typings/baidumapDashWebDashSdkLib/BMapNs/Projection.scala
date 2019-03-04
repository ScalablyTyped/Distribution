package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def lngLatToPoint(lngLat: Point): Pixel
  def pointToLngLat(point: Pixel): Point
}

object Projection {
  @scala.inline
  def apply(lngLatToPoint: js.Function1[Point, Pixel], pointToLngLat: js.Function1[Pixel, Point]): Projection = {
    val __obj = js.Dynamic.literal(lngLatToPoint = lngLatToPoint, pointToLngLat = pointToLngLat)
  
    __obj.asInstanceOf[Projection]
  }
}

