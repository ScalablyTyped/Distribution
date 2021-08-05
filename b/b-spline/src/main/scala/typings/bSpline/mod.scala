package typings.bSpline

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].apply(t.asInstanceOf[js.Any], degree.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].apply(t.asInstanceOf[js.Any], degree.asInstanceOf[js.Any], points.asInstanceOf[js.Any], knots.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: js.Array[Double], weights: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].apply(t.asInstanceOf[js.Any], degree.asInstanceOf[js.Any], points.asInstanceOf[js.Any], knots.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: Unit, weights: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].apply(t.asInstanceOf[js.Any], degree.asInstanceOf[js.Any], points.asInstanceOf[js.Any], knots.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("b-spline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
