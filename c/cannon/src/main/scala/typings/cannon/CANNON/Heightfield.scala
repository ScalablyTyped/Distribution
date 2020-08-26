package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heightfield extends Shape {
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
  @scala.inline
  implicit class HeightfieldOps[Self <: Heightfield] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheEnabled(value: Boolean): Self = this.set("cacheEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Array[Double]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[Double]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementSize(value: Double): Self = this.set("elementSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetConvexTrianglePillar(value: (Double, Double, Boolean) => Unit): Self = this.set("getConvexTrianglePillar", js.Any.fromFunction3(value))
    @scala.inline
    def setGetIndexOfPosition(value: (Double, Double, js.Array[_], Boolean) => Boolean): Self = this.set("getIndexOfPosition", js.Any.fromFunction4(value))
    @scala.inline
    def setGetRectMinMax(value: (Double, Double, Double, Double, js.Array[_]) => Unit): Self = this.set("getRectMinMax", js.Any.fromFunction5(value))
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPillarConvex(value: ConvexPolyhedron): Self = this.set("pillarConvex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPillarOffset(value: Vec3): Self = this.set("pillarOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetHeightValueAtIndex(value: (Double, Double, Double) => Unit): Self = this.set("setHeightValueAtIndex", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateMaxValue(value: () => Unit): Self = this.set("updateMaxValue", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateMinValue(value: () => Unit): Self = this.set("updateMinValue", js.Any.fromFunction0(value))
  }
  
}

