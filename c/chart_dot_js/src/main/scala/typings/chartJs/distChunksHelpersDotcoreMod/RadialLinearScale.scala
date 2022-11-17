package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.Angle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialLinearScale[O /* <: RadialLinearScaleOptions */]
  extends StObject
     with Scale2[O] {
  
  def getBasePosition(index: Double): Angle = js.native
  
  def getDistanceFromCenterForValue(value: Double): Double = js.native
  
  def getIndexAngle(index: Double): Double = js.native
  
  def getPointLabelPosition(index: Double): ChartArea = js.native
  
  def getPointPosition(index: Double, distanceFromCenter: Double): Angle = js.native
  
  def getPointPositionForValue(index: Double, value: Double): Angle = js.native
  
  def getValueForDistanceFromCenter(distance: Double): Double = js.native
  
  def setCenterPoint(leftMovement: Double, rightMovement: Double, topMovement: Double, bottomMovement: Double): Unit = js.native
}
