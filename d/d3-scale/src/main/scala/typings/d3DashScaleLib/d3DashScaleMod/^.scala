package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-scale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val scaleImplicit: d3DashScaleLib.Anon_Implicit = js.native
  def scaleBand(): d3DashScaleLib.d3DashScaleMod.ScaleBand[java.lang.String] = js.native
  @JSName("scaleBand")
  def scaleBand_DomainAnon_ToString[Domain /* <: d3DashScaleLib.Anon_ToString */](): d3DashScaleLib.d3DashScaleMod.ScaleBand[Domain] = js.native
  def scaleDiverging[T](interpolator: js.Function1[/* t */ scala.Double, T]): d3DashScaleLib.d3DashScaleMod.ScaleDiverging[T] = js.native
  def scaleIdentity(): d3DashScaleLib.d3DashScaleMod.ScaleIdentity = js.native
  def scaleLinear(): d3DashScaleLib.d3DashScaleMod.ScaleLinear[scala.Double, scala.Double] = js.native
  @JSName("scaleLinear")
  def scaleLinear_Output[Output](): d3DashScaleLib.d3DashScaleMod.ScaleLinear[Output, Output] = js.native
  @JSName("scaleLinear")
  def scaleLinear_RangeOutput[Range, Output](): d3DashScaleLib.d3DashScaleMod.ScaleLinear[Range, Output] = js.native
  def scaleLog(): d3DashScaleLib.d3DashScaleMod.ScaleLogarithmic[scala.Double, scala.Double] = js.native
  @JSName("scaleLog")
  def scaleLog_Output[Output](): d3DashScaleLib.d3DashScaleMod.ScaleLogarithmic[Output, Output] = js.native
  @JSName("scaleLog")
  def scaleLog_RangeOutput[Range, Output](): d3DashScaleLib.d3DashScaleMod.ScaleLogarithmic[Range, Output] = js.native
  def scaleOrdinal[Range](): d3DashScaleLib.d3DashScaleMod.ScaleOrdinal[java.lang.String, Range] = js.native
  def scaleOrdinal[Range](range: js.Array[Range]): d3DashScaleLib.d3DashScaleMod.ScaleOrdinal[java.lang.String, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_DomainAnon_ToStringRange[Domain /* <: d3DashScaleLib.Anon_ToString */, Range](): d3DashScaleLib.d3DashScaleMod.ScaleOrdinal[Domain, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_DomainAnon_ToStringRange[Domain /* <: d3DashScaleLib.Anon_ToString */, Range](range: js.Array[Range]): d3DashScaleLib.d3DashScaleMod.ScaleOrdinal[Domain, Range] = js.native
  def scalePoint(): d3DashScaleLib.d3DashScaleMod.ScalePoint[java.lang.String] = js.native
  @JSName("scalePoint")
  def scalePoint_DomainAnon_ToString[Domain /* <: d3DashScaleLib.Anon_ToString */](): d3DashScaleLib.d3DashScaleMod.ScalePoint[Domain] = js.native
  def scalePow(): d3DashScaleLib.d3DashScaleMod.ScalePower[scala.Double, scala.Double] = js.native
  @JSName("scalePow")
  def scalePow_Output[Output](): d3DashScaleLib.d3DashScaleMod.ScalePower[Output, Output] = js.native
  @JSName("scalePow")
  def scalePow_RangeOutput[Range, Output](): d3DashScaleLib.d3DashScaleMod.ScalePower[Range, Output] = js.native
  def scaleQuantile(): d3DashScaleLib.d3DashScaleMod.ScaleQuantile[scala.Double] = js.native
  @JSName("scaleQuantile")
  def scaleQuantile_Range[Range](): d3DashScaleLib.d3DashScaleMod.ScaleQuantile[Range] = js.native
  def scaleQuantize(): d3DashScaleLib.d3DashScaleMod.ScaleQuantize[scala.Double] = js.native
  @JSName("scaleQuantize")
  def scaleQuantize_Range[Range](): d3DashScaleLib.d3DashScaleMod.ScaleQuantize[Range] = js.native
  def scaleSequential[Output](interpolator: js.Function1[/* t */ scala.Double, Output]): d3DashScaleLib.d3DashScaleMod.ScaleSequential[Output] = js.native
  def scaleSqrt(): d3DashScaleLib.d3DashScaleMod.ScalePower[scala.Double, scala.Double] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_Output[Output](): d3DashScaleLib.d3DashScaleMod.ScalePower[Output, Output] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_RangeOutput[Range, Output](): d3DashScaleLib.d3DashScaleMod.ScalePower[Range, Output] = js.native
  def scaleThreshold(): d3DashScaleLib.d3DashScaleMod.ScaleThreshold[scala.Double, scala.Double] = js.native
  @JSName("scaleThreshold")
  def `scaleThreshold_Domain<union>Range`[Domain /* <: scala.Double | java.lang.String | stdLib.Date */, Range](): d3DashScaleLib.d3DashScaleMod.ScaleThreshold[Domain, Range] = js.native
  def scaleTime(): d3DashScaleLib.d3DashScaleMod.ScaleTime[scala.Double, scala.Double] = js.native
  @JSName("scaleTime")
  def scaleTime_Output[Output](): d3DashScaleLib.d3DashScaleMod.ScaleTime[Output, Output] = js.native
  @JSName("scaleTime")
  def scaleTime_RangeOutput[Range, Output](): d3DashScaleLib.d3DashScaleMod.ScaleTime[Range, Output] = js.native
  def scaleUtc(): d3DashScaleLib.d3DashScaleMod.ScaleTime[scala.Double, scala.Double] = js.native
  @JSName("scaleUtc")
  def scaleUtc_Output[Output](): d3DashScaleLib.d3DashScaleMod.ScaleTime[Output, Output] = js.native
  @JSName("scaleUtc")
  def scaleUtc_RangeOutput[Range, Output](): d3DashScaleLib.d3DashScaleMod.ScaleTime[Range, Output] = js.native
}

