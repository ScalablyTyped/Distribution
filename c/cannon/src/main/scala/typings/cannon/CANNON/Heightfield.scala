package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heightfield
  extends StObject
     with Shape {
  
  var cacheEnabled: Boolean
  
  var data: js.Array[js.Array[Double]]
  
  var elementSize: Double
  
  def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit
  
  def getIndexOfPosition(x: Double, y: Double, result: js.Array[js.Any], clamp: Boolean): Boolean
  
  def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[js.Any]): Unit
  
  var maxValue: Double
  
  var minValue: Double
  
  var pillarConvex: ConvexPolyhedron
  
  var pillarOffset: Vec3
  
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
    getIndexOfPosition: (Double, Double, js.Array[js.Any], Boolean) => Boolean,
    getRectMinMax: (Double, Double, Double, Double, js.Array[js.Any]) => Unit,
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
  implicit class HeightfieldMutableBuilder[Self <: Heightfield] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setElementSize(value: Double): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConvexTrianglePillar(value: (Double, Double, Boolean) => Unit): Self = StObject.set(x, "getConvexTrianglePillar", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetIndexOfPosition(value: (Double, Double, js.Array[js.Any], Boolean) => Boolean): Self = StObject.set(x, "getIndexOfPosition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetRectMinMax(value: (Double, Double, Double, Double, js.Array[js.Any]) => Unit): Self = StObject.set(x, "getRectMinMax", js.Any.fromFunction5(value))
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPillarConvex(value: ConvexPolyhedron): Self = StObject.set(x, "pillarConvex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPillarOffset(value: Vec3): Self = StObject.set(x, "pillarOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHeightValueAtIndex(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setHeightValueAtIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateMaxValue(value: () => Unit): Self = StObject.set(x, "updateMaxValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateMinValue(value: () => Unit): Self = StObject.set(x, "updateMinValue", js.Any.fromFunction0(value))
  }
}
