package typings.chartJs

import typings.chartJs.anon.Distance
import typings.chartJs.anon.Max
import typings.chartJs.distTypesGeometricMod.Point
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotmathMod {
  
  @JSImport("chart.js/dist/helpers/helpers.math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "HALF_PI")
  @js.native
  val HALF_PI: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "INFINITY")
  @js.native
  val INFINITY: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "PI")
  @js.native
  val PI: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "PITAU")
  @js.native
  val PITAU: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "QUARTER_PI")
  @js.native
  val QUARTER_PI: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "RAD_PER_DEG")
  @js.native
  val RAD_PER_DEG: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "TAU")
  @js.native
  val TAU: Double = js.native
  
  @JSImport("chart.js/dist/helpers/helpers.math", "TWO_THIRDS_PI")
  @js.native
  val TWO_THIRDS_PI: Double = js.native
  
  inline def almostEquals(x: Double, y: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def almostWhole(x: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("almostWhole")(x.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def angleBetween(angle: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleBetween")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def angleBetween(angle: Double, start: Double, end: Double, sameAngleIsFullCircle: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleBetween")(angle.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sameAngleIsFullCircle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def angleDiff(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_angleDiff")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def decimalPlaces(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_decimalPlaces")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def distanceBetweenPoints(pt1: Point, pt2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceBetweenPoints")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def factorize(value: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("_factorize")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getAngleFromPoint(centrePoint: Point, anglePoint: Point): Distance = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngleFromPoint")(centrePoint.asInstanceOf[js.Any], anglePoint.asInstanceOf[js.Any])).asInstanceOf[Distance]
  
  inline def int16Range(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_int16Range")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isBetween(value: Double, start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBetween(value: Double, start: Double, end: Double, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_isBetween")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumber(n: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(n.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def limitValue(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_limitValue")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def niceNum(range: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("niceNum")(range.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def normalizeAngle(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("_normalizeAngle")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setMinAndMaxByKey(array: js.Array[Record[String, Double]], target: Max, property: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setMinAndMaxByKey")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
}
