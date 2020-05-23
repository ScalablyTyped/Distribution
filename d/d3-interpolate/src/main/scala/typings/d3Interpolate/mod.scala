package typings.d3Interpolate

import typings.d3Color.mod.ColorCommonInstance
import typings.d3Interpolate.anon.ToString
import typings.d3Interpolate.anon.ValueOf
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-interpolate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ColorGammaInterpolationFactory
    extends js.Function {
    def apply(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
    def apply(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
    def apply(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
    def apply(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
    /**
      * Returns a new interpolator factory of the same type using the specified *gamma*.
      * For example, to interpolate from purple to orange with a gamma of 2.2 in RGB space: `d3.interpolateRgb.gamma(2.2)("purple", "orange")`.
      * See Eric Brasseur’s article, [Gamma error in picture scaling](https://web.archive.org/web/20160112115812/http://www.4p8.com/eric.brasseur/gamma.html), for more on gamma correction.
      */
    def gamma(g: Double): ColorGammaInterpolationFactory = js.native
  }
  
  @js.native
  trait ZoomInterpolator
    extends js.Function {
    /**
      * Recommended duration of zoom transition in milliseconds.
      */
    var duration: Double = js.native
    def apply(t: Double): ZoomView = js.native
  }
  
  val interpolateCubehelix: ColorGammaInterpolationFactory = js.native
  val interpolateCubehelixLong: ColorGammaInterpolationFactory = js.native
  val interpolateRgb: ColorGammaInterpolationFactory = js.native
  def interpolate(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolate(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolate(a: js.Any): js.Function1[/* t */ Double, Null] = js.native
  def interpolate(a: js.Any, b: Boolean): js.Function1[/* t */ Double, Boolean] = js.native
  def interpolate(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolate(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def interpolate(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolate(a: ToString, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolate(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolate(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def interpolate(a: Date, b: Date): js.Function1[/* t */ Double, Date] = js.native
  def interpolate[U /* <: js.Object */](a: js.Any, b: U): js.Function1[/* t */ Double, U] = js.native
  def interpolate[U /* <: js.Array[_] */](a: js.Array[_], b: U): js.Function1[/* t */ Double, U] = js.native
  def interpolateArray[A /* <: js.Array[_] */](a: js.Array[_], b: A): ArrayInterpolator[A] = js.native
  def interpolateBasis(splineNodes: js.Array[Double]): js.Function1[/* t */ Double, Double] = js.native
  def interpolateBasisClosed(splineNodes: js.Array[Double]): js.Function1[/* t */ Double, Double] = js.native
  def interpolateDate(a: Date, b: Date): js.Function1[/* t */ Double, Date] = js.native
  def interpolateDiscrete[T](values: js.Array[T]): js.Function1[/* t */ Double, T] = js.native
  def interpolateHcl(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHcl(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHcl(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHcl(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHclLong(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHclLong(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHclLong(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHclLong(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsl(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsl(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsl(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsl(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHslLong(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHslLong(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHslLong(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHslLong(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHue(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolateLab(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateLab(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateLab(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateLab(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateNumber(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolateNumber(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def interpolateNumber(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolateNumber(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def interpolateObject[U /* <: js.Object */](a: js.Any, b: U): js.Function1[/* t */ Double, U] = js.native
  def interpolateRgbBasis(colors: js.Array[String | ColorCommonInstance]): js.Function1[/* t */ Double, String] = js.native
  def interpolateRgbBasisClosed(colors: js.Array[String | ColorCommonInstance]): js.Function1[/* t */ Double, String] = js.native
  def interpolateRound(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolateRound(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def interpolateRound(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def interpolateRound(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def interpolateString(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateString(a: String, b: ToString): js.Function1[/* t */ Double, String] = js.native
  def interpolateString(a: ToString, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateString(a: ToString, b: ToString): js.Function1[/* t */ Double, String] = js.native
  def interpolateTransformCss(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateTransformSvg(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateZoom(a: ZoomView, b: ZoomView): ZoomInterpolator = js.native
  def piecewise(
    interpolate: js.Function2[/* a */ ZoomView, /* b */ ZoomView, ZoomInterpolator],
    values: js.Array[ZoomView]
  ): ZoomInterpolator = js.native
  @JSName("piecewise")
  def piecewise_A_ArrayWildcard_ArrayInterpolator[A /* <: js.Array[_] */](
    interpolate: js.Function2[/* a */ js.Array[_], /* b */ A, ArrayInterpolator[A]],
    values: js.Array[A]
  ): ArrayInterpolator[A] = js.native
  @JSName("piecewise")
  def piecewise_TDataInterpolator_Function1[TData, Interpolator](interpolate: js.Function2[/* a */ TData, /* b */ TData, Interpolator], values: js.Array[TData]): js.Function1[/* t */ Double, _] = js.native
  def quantize[T](interpolator: js.Function1[/* t */ Double, T], n: Double): js.Array[T] = js.native
  type ArrayInterpolator[A /* <: js.Array[_] */] = js.Function1[/* t */ Double, A]
  type ZoomView = js.Tuple3[Double, Double, Double]
}

