package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def lngLatToPoint(lngLat: Point): Pixel
  def pointToLngLat(point: Pixel): Point
}

