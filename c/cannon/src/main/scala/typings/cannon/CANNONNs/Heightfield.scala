package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Heightfield")
@js.native
class Heightfield protected () extends Shape {
  def this(data: js.Array[Double]) = this()
  def this(data: js.Array[Double], options: IHightfield) = this()
  var cacheEnabled: Boolean = js.native
  var data: js.Array[js.Array[Double]] = js.native
  var elementSize: Double = js.native
  var maxValue: Double = js.native
  var minValue: Double = js.native
  var pillarConvex: ConvexPolyhedron = js.native
  var pillarOffset: Vec3 = js.native
  def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit = js.native
  def getIndexOfPosition(x: Double, y: Double, result: js.Array[_], clamp: Boolean): Boolean = js.native
  def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[_]): Unit = js.native
  def setHeightValueAtIndex(xi: Double, yi: Double, value: Double): Unit = js.native
  def update(): Unit = js.native
  def updateMaxValue(): Unit = js.native
  def updateMinValue(): Unit = js.native
}

