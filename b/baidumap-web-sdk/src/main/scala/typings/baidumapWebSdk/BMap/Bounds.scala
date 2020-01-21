package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Bounds")
@js.native
class Bounds protected () extends js.Object {
  def this(sw: Point, ne: Point) = this()
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  def containsBounds(bounds: Bounds): Boolean = js.native
  def containsPoint(point: Point): Boolean = js.native
  def equals(other: Bounds): Boolean = js.native
  def extend(point: Point): Unit = js.native
  def getCenter(): Point = js.native
  def getNorthEast(): Point = js.native
  def getSouthWest(): Point = js.native
  def intersects(other: Bounds): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def toSpan(): Point = js.native
}

