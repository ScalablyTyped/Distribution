package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def lngLatToPoint(lngLat: Point): Pixel
  def pointToLngLat(point: Pixel): Point
}

object Projection {
  @scala.inline
  def apply(lngLatToPoint: Point => Pixel, pointToLngLat: Pixel => Point): Projection = {
    val __obj = js.Dynamic.literal(lngLatToPoint = js.Any.fromFunction1(lngLatToPoint), pointToLngLat = js.Any.fromFunction1(pointToLngLat))
  
    __obj.asInstanceOf[Projection]
  }
}

