package typings.chartJs.mod

import typings.chartJs.anon.Angle
import typings.chartJs.anon.BottomLeft
import typings.chartJs.distChunksHelpersDotcoreMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialLinearScale extends LinearScaleBase {
  
  var _padding: ChartArea = js.native
  
  var _pointLabelItems: js.Array[Any] = js.native
  
  /** @type {string[]} */
  var _pointLabels: js.Array[String] = js.native
  
  /**
    * @protected
    */
  /* protected */ def drawGrid(): scala.Unit = js.native
  
  /**
    * @protected
    */
  /* protected */ def drawLabels(): scala.Unit = js.native
  
  /** @type {number} */
  var drawingArea: Double = js.native
  
  def generateTickLabels(ticks: Any): scala.Unit = js.native
  
  def getBasePosition(index: Any): Angle = js.native
  
  def getDistanceFromCenterForValue(value: Any): Double = js.native
  
  def getIndexAngle(index: Any): Double = js.native
  
  def getPointLabelContext(index: Any): Any = js.native
  
  def getPointLabelPosition(index: Any): BottomLeft = js.native
  
  def getPointPosition(index: Any, distanceFromCenter: Any): Angle = js.native
  def getPointPosition(index: Any, distanceFromCenter: Any, additionalAngle: Double): Angle = js.native
  
  def getPointPositionForValue(index: Any, value: Any): Angle = js.native
  
  def getValueForDistanceFromCenter(distance: Any): Any = js.native
  
  def setCenterPoint(leftMovement: Any, rightMovement: Any, topMovement: Any, bottomMovement: Any): scala.Unit = js.native
  
  /** @type {number} */
  var xCenter: Double = js.native
  
  /** @type {number} */
  var yCenter: Double = js.native
}
