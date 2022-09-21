package typings.cannon.mod

import typings.cannon.CANNON.IHightfield
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Heightfield")
@js.native
open class Heightfield protected ()
  extends StObject
     with typings.cannon.CANNON.Heightfield {
  def this(data: js.Array[Double]) = this()
  def this(data: js.Array[Double], options: IHightfield) = this()
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  var cacheEnabled: Boolean = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var data: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var elementSize: Double = js.native
  
  /* CompleteClass */
  override def getConvexTrianglePillar(xi: Double, yi: Double, getUpperTriangle: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def getIndexOfPosition(x: Double, y: Double, result: js.Array[Any], clamp: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def getRectMinMax(iMinX: Double, iMinY: Double, iMaxX: Double, iMaxY: Double, result: js.Array[Any]): Unit = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var maxValue: Double = js.native
  
  /* CompleteClass */
  var minValue: Double = js.native
  
  /* CompleteClass */
  var pillarConvex: typings.cannon.CANNON.ConvexPolyhedron = js.native
  
  /* CompleteClass */
  var pillarOffset: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def setHeightValueAtIndex(xi: Double, yi: Double, value: Double): Unit = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def updateMaxValue(): Unit = js.native
  
  /* CompleteClass */
  override def updateMinValue(): Unit = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
}
