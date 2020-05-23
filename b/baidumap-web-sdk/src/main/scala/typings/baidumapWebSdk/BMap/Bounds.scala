package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
  def containsBounds(bounds: Bounds): Boolean
  def containsPoint(point: Point): Boolean
  def equals(other: Bounds): Boolean
  def extend(point: Point): Unit
  def getCenter(): Point
  def getNorthEast(): Point
  def getSouthWest(): Point
  def intersects(other: Bounds): Boolean
  def isEmpty(): Boolean
  def toSpan(): Point
}

object Bounds {
  @scala.inline
  def apply(
    containsBounds: Bounds => Boolean,
    containsPoint: Point => Boolean,
    equals: Bounds => Boolean,
    extend: Point => Unit,
    getCenter: () => Point,
    getNorthEast: () => Point,
    getSouthWest: () => Point,
    intersects: Bounds => Boolean,
    isEmpty: () => Boolean,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    toSpan: () => Point
  ): Bounds = {
    val __obj = js.Dynamic.literal(containsBounds = js.Any.fromFunction1(containsBounds), containsPoint = js.Any.fromFunction1(containsPoint), equals = js.Any.fromFunction1(equals), extend = js.Any.fromFunction1(extend), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], toSpan = js.Any.fromFunction0(toSpan))
    __obj.asInstanceOf[Bounds]
  }
}

