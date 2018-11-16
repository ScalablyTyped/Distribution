package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Heightfield")
@js.native
class Heightfield protected () extends Shape {
  def this(data: js.Array[scala.Double]) = this()
  def this(data: js.Array[scala.Double], options: IHightfield) = this()
  var cacheEnabled: scala.Boolean = js.native
  var data: js.Array[js.Array[scala.Double]] = js.native
  var elementSize: scala.Double = js.native
  var maxValue: scala.Double = js.native
  var minValue: scala.Double = js.native
  var pillarConvex: ConvexPolyhedron = js.native
  var pillarOffset: Vec3 = js.native
  def getConvexTrianglePillar(xi: scala.Double, yi: scala.Double, getUpperTriangle: scala.Boolean): scala.Unit = js.native
  def getIndexOfPosition(x: scala.Double, y: scala.Double, result: js.Array[_], clamp: scala.Boolean): scala.Boolean = js.native
  def getRectMinMax(
    iMinX: scala.Double,
    iMinY: scala.Double,
    iMaxX: scala.Double,
    iMaxY: scala.Double,
    result: js.Array[_]
  ): scala.Unit = js.native
  def setHeightValueAtIndex(xi: scala.Double, yi: scala.Double, value: scala.Double): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def updateMaxValue(): scala.Unit = js.native
  def updateMinValue(): scala.Unit = js.native
}

