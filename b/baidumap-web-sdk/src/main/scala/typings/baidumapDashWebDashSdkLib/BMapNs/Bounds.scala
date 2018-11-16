package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Bounds")
@js.native
class Bounds protected () extends js.Object {
  def this(sw: Point, ne: Point) = this()
  def this(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double) = this()
  var maxX: scala.Double = js.native
  var maxY: scala.Double = js.native
  var minX: scala.Double = js.native
  var minY: scala.Double = js.native
  def containsBounds(bounds: Bounds): scala.Boolean = js.native
  def containsPoint(point: Point): scala.Boolean = js.native
  def equals(other: Bounds): scala.Boolean = js.native
  def extend(point: Point): scala.Unit = js.native
  def getCenter(): Point = js.native
  def getNorthEast(): Point = js.native
  def getSouthWest(): Point = js.native
  def intersects(other: Bounds): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def toSpan(): Point = js.native
}

