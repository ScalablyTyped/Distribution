package typings.bSpline

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("b-spline", JSImport.Namespace)
  @js.native
  def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T]): T = js.native
  @JSImport("b-spline", JSImport.Namespace)
  @js.native
  def apply[T /* <: ArrayLike[Double] */](
    t: Double,
    degree: Double,
    points: js.Array[T],
    knots: js.UndefOr[scala.Nothing],
    weights: js.Array[Double]
  ): T = js.native
  @JSImport("b-spline", JSImport.Namespace)
  @js.native
  def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: js.Array[Double]): T = js.native
  @JSImport("b-spline", JSImport.Namespace)
  @js.native
  def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: js.Array[Double], weights: js.Array[Double]): T = js.native
}
