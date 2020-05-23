package typings.baidumapWebSdk.global.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Bounds")
@js.native
class Bounds protected ()
  extends typings.baidumapWebSdk.BMap.Bounds {
  def this(sw: typings.baidumapWebSdk.BMap.Point, ne: typings.baidumapWebSdk.BMap.Point) = this()
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  /* CompleteClass */
  override var maxX: Double = js.native
  /* CompleteClass */
  override var maxY: Double = js.native
  /* CompleteClass */
  override var minX: Double = js.native
  /* CompleteClass */
  override var minY: Double = js.native
  /* CompleteClass */
  override def containsBounds(bounds: typings.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  /* CompleteClass */
  override def containsPoint(point: typings.baidumapWebSdk.BMap.Point): Boolean = js.native
  /* CompleteClass */
  override def equals(other: typings.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  /* CompleteClass */
  override def extend(point: typings.baidumapWebSdk.BMap.Point): Unit = js.native
  /* CompleteClass */
  override def getCenter(): typings.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def getNorthEast(): typings.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def getSouthWest(): typings.baidumapWebSdk.BMap.Point = js.native
  /* CompleteClass */
  override def intersects(other: typings.baidumapWebSdk.BMap.Bounds): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def toSpan(): typings.baidumapWebSdk.BMap.Point = js.native
}

