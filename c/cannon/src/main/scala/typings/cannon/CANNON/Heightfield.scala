package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heightfield extends Shape {
  var cacheEnabled: Boolean
  var data: js.Array[js.Array[Double]]
  var elementSize: Double
  var maxValue: Double
  var minValue: Double
  var pillarConvex: ConvexPolyhedron
  var pillarOffset: Vec3
  def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit
  def getIndexOfPosition(x: Double, y: Double, result: js.Array[_], clamp: Boolean): Boolean
  def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[_]): Unit
  def setHeightValueAtIndex(xi: Double, yi: Double, value: Double): Unit
  def update(): Unit
  def updateMaxValue(): Unit
  def updateMinValue(): Unit
}

object Heightfield {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    cacheEnabled: Boolean,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    collisionResponse: Boolean,
    data: js.Array[js.Array[Double]],
    elementSize: Double,
    getConvexTrianglePillar: (Double, Double, Boolean) => Unit,
    getIndexOfPosition: (Double, Double, js.Array[_], Boolean) => Boolean,
    getRectMinMax: (Double, Double, Double, Double, js.Array[_]) => Unit,
    maxValue: Double,
    minValue: Double,
    pillarConvex: ConvexPolyhedron,
    pillarOffset: Vec3,
    setHeightValueAtIndex: (Double, Double, Double) => Unit,
    `type`: Double,
    update: () => Unit,
    updateBoundingSphereRadius: () => Double,
    updateMaxValue: () => Unit,
    updateMinValue: () => Unit,
    volume: () => Double
  ): Heightfield = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], cacheEnabled = cacheEnabled.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), collisionResponse = collisionResponse.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], getConvexTrianglePillar = js.Any.fromFunction3(getConvexTrianglePillar), getIndexOfPosition = js.Any.fromFunction4(getIndexOfPosition), getRectMinMax = js.Any.fromFunction5(getRectMinMax), maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pillarConvex = pillarConvex.asInstanceOf[js.Any], pillarOffset = pillarOffset.asInstanceOf[js.Any], setHeightValueAtIndex = js.Any.fromFunction3(setHeightValueAtIndex), update = js.Any.fromFunction0(update), updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), updateMaxValue = js.Any.fromFunction0(updateMaxValue), updateMinValue = js.Any.fromFunction0(updateMinValue), volume = js.Any.fromFunction0(volume))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heightfield]
  }
}

