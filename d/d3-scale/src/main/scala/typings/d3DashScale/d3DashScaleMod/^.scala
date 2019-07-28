package typings.d3DashScale.d3DashScaleMod

import typings.d3DashScale.Anon_ToString
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-scale", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def scaleBand(): ScaleBand[String] = js.native
  @JSName("scaleBand")
  def scaleBand_Domain_Anon_ToString[Domain /* <: Anon_ToString */](): ScaleBand[Domain] = js.native
  def scaleDiverging[T](interpolator: js.Function1[/* t */ Double, T]): ScaleDiverging[T] = js.native
  def scaleIdentity(): ScaleIdentity = js.native
  def scaleLinear(): ScaleLinear[Double, Double] = js.native
  @JSName("scaleLinear")
  def scaleLinear_Output[Output](): ScaleLinear[Output, Output] = js.native
  @JSName("scaleLinear")
  def scaleLinear_RangeOutput[Range, Output](): ScaleLinear[Range, Output] = js.native
  def scaleLog(): ScaleLogarithmic[Double, Double] = js.native
  @JSName("scaleLog")
  def scaleLog_Output[Output](): ScaleLogarithmic[Output, Output] = js.native
  @JSName("scaleLog")
  def scaleLog_RangeOutput[Range, Output](): ScaleLogarithmic[Range, Output] = js.native
  def scaleOrdinal[Range](): ScaleOrdinal[String, Range] = js.native
  def scaleOrdinal[Range](range: js.Array[Range]): ScaleOrdinal[String, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_Domain_Anon_ToStringRange[Domain /* <: Anon_ToString */, Range](): ScaleOrdinal[Domain, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_Domain_Anon_ToStringRange[Domain /* <: Anon_ToString */, Range](range: js.Array[Range]): ScaleOrdinal[Domain, Range] = js.native
  def scalePoint(): ScalePoint[String] = js.native
  @JSName("scalePoint")
  def scalePoint_Domain_Anon_ToString[Domain /* <: Anon_ToString */](): ScalePoint[Domain] = js.native
  def scalePow(): ScalePower[Double, Double] = js.native
  @JSName("scalePow")
  def scalePow_Output[Output](): ScalePower[Output, Output] = js.native
  @JSName("scalePow")
  def scalePow_RangeOutput[Range, Output](): ScalePower[Range, Output] = js.native
  def scaleQuantile(): ScaleQuantile[Double] = js.native
  @JSName("scaleQuantile")
  def scaleQuantile_Range[Range](): ScaleQuantile[Range] = js.native
  def scaleQuantize(): ScaleQuantize[Double] = js.native
  @JSName("scaleQuantize")
  def scaleQuantize_Range[Range](): ScaleQuantize[Range] = js.native
  def scaleSequential[Output](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential[Output] = js.native
  def scaleSqrt(): ScalePower[Double, Double] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_Output[Output](): ScalePower[Output, Output] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_RangeOutput[Range, Output](): ScalePower[Range, Output] = js.native
  def scaleThreshold(): ScaleThreshold[Double, Double] = js.native
  @JSName("scaleThreshold")
  def scaleThreshold_Domain_UnionDoubleStringDateRange[Domain /* <: Double | String | Date */, Range](): ScaleThreshold[Domain, Range] = js.native
  def scaleTime(): ScaleTime[Double, Double] = js.native
  @JSName("scaleTime")
  def scaleTime_Output[Output](): ScaleTime[Output, Output] = js.native
  @JSName("scaleTime")
  def scaleTime_RangeOutput[Range, Output](): ScaleTime[Range, Output] = js.native
  def scaleUtc(): ScaleTime[Double, Double] = js.native
  @JSName("scaleUtc")
  def scaleUtc_Output[Output](): ScaleTime[Output, Output] = js.native
  @JSName("scaleUtc")
  def scaleUtc_RangeOutput[Range, Output](): ScaleTime[Range, Output] = js.native
}

