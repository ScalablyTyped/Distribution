package typings
package d3DashScaleLib.d3DashScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-scale", JSImport.Namespace)
@js.native
object d3DashScaleModMembers extends js.Object {
  val scaleImplicit: d3DashScaleLib.Anon_Name = js.native
  def scaleBand(): ScaleBand[java.lang.String] = js.native
  @JSName("scaleBand")
  def scaleBand_DomainAnon_ToString[Domain /* <: d3DashScaleLib.Anon_ToString */](): ScaleBand[Domain] = js.native
  def scaleIdentity(): ScaleIdentity = js.native
  def scaleLinear(): ScaleLinear[scala.Double, scala.Double] = js.native
  @JSName("scaleLinear")
  def scaleLinear_Output[Output](): ScaleLinear[Output, Output] = js.native
  @JSName("scaleLinear")
  def scaleLinear_RangeOutput[Range, Output](): ScaleLinear[Range, Output] = js.native
  def scaleLog(): ScaleLogarithmic[scala.Double, scala.Double] = js.native
  @JSName("scaleLog")
  def scaleLog_Output[Output](): ScaleLogarithmic[Output, Output] = js.native
  @JSName("scaleLog")
  def scaleLog_RangeOutput[Range, Output](): ScaleLogarithmic[Range, Output] = js.native
  def scaleOrdinal[Range](): ScaleOrdinal[java.lang.String, Range] = js.native
  def scaleOrdinal[Range](range: js.Array[Range]): ScaleOrdinal[java.lang.String, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_DomainAnon_ToStringRange[Domain /* <: d3DashScaleLib.Anon_ToString */, Range](): ScaleOrdinal[Domain, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_DomainAnon_ToStringRange[Domain /* <: d3DashScaleLib.Anon_ToString */, Range](range: js.Array[Range]): ScaleOrdinal[Domain, Range] = js.native
  def scalePoint(): ScalePoint[java.lang.String] = js.native
  @JSName("scalePoint")
  def scalePoint_DomainAnon_ToString[Domain /* <: d3DashScaleLib.Anon_ToString */](): ScalePoint[Domain] = js.native
  def scalePow(): ScalePower[scala.Double, scala.Double] = js.native
  @JSName("scalePow")
  def scalePow_Output[Output](): ScalePower[Output, Output] = js.native
  @JSName("scalePow")
  def scalePow_RangeOutput[Range, Output](): ScalePower[Range, Output] = js.native
  def scaleQuantile(): ScaleQuantile[scala.Double] = js.native
  @JSName("scaleQuantile")
  def scaleQuantile_Range[Range](): ScaleQuantile[Range] = js.native
  def scaleQuantize(): ScaleQuantize[scala.Double] = js.native
  @JSName("scaleQuantize")
  def scaleQuantize_Range[Range](): ScaleQuantize[Range] = js.native
  def scaleSequential[Output](interpolator: js.Function1[/* t */ scala.Double, Output]): ScaleSequential[Output] = js.native
  def scaleSqrt(): ScalePower[scala.Double, scala.Double] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_Output[Output](): ScalePower[Output, Output] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_RangeOutput[Range, Output](): ScalePower[Range, Output] = js.native
  def scaleThreshold(): ScaleThreshold[scala.Double, scala.Double] = js.native
  @JSName("scaleThreshold")
  def `scaleThreshold_Domain<union>Range`[Domain /* <: scala.Double | java.lang.String | stdLib.Date */, Range](): ScaleThreshold[Domain, Range] = js.native
  def scaleTime(): ScaleTime[scala.Double, scala.Double] = js.native
  @JSName("scaleTime")
  def scaleTime_Output[Output](): ScaleTime[Output, Output] = js.native
  @JSName("scaleTime")
  def scaleTime_RangeOutput[Range, Output](): ScaleTime[Range, Output] = js.native
  def scaleUtc(): ScaleTime[scala.Double, scala.Double] = js.native
  @JSName("scaleUtc")
  def scaleUtc_Output[Output](): ScaleTime[Output, Output] = js.native
  @JSName("scaleUtc")
  def scaleUtc_RangeOutput[Range, Output](): ScaleTime[Range, Output] = js.native
}

