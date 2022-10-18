package typings.chartJs

import typings.chartJs.anon.Angle
import typings.chartJs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHelpersHelpersDotmathMod {
  
  @JSImport("chart.js/types/helpers/helpers.math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def almostEquals(x: Double, y: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def almostWhole(x: Double, epsilon: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("almostWhole")(x.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distanceBetweenPoints(pt1: X, pt2: X): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceBetweenPoints")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAngleFromPoint(centrePoint: X, anglePoint: X): Angle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleFromPoint")(centrePoint.asInstanceOf[js.Any], anglePoint.asInstanceOf[js.Any])).asInstanceOf[Angle]
  
  inline def isNumber(v: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def niceNum(range: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("niceNum")(range.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
}
