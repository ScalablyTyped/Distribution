package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartistInterpolationStatic extends StObject {
  
  /**
    * Cardinal / Catmull-Rome spline interpolation is the default smoothing function in Chartist. It produces nice results where the splines will always meet the points. It produces some artifacts though when data values are increased or decreased rapidly. The line may not follow a very accurate path and if the line should be accurate this smoothing function does not produce the best results.
    */
  def cardinal(): js.Function = js.native
  def cardinal(options: IChartistCardinalInterpolationOptions): js.Function = js.native
  
  /**
    * This interpolation function does not smooth the path and the result is only containing lines and no curves.
    */
  def none(): js.Function = js.native
  def none(options: IChartistInterpolationOptions): js.Function = js.native
  
  /**
    * Simple smoothing creates horizontal handles that are positioned with a fraction of the length between two data points. You can use the divisor option to specify the amount of smoothing.
    */
  def simple(): js.Function = js.native
  def simple(options: IChartistSimpleInterpolationOptions): js.Function = js.native
  
  /**
    * Step interpolation will cause the line chart to move in steps rather than diagonal or smoothed lines. This interpolation will create additional points that will also be drawn when the showPoint option is enabled.
    */
  def step(): js.Function = js.native
  def step(options: IChartistStepInterpolationOptions): js.Function = js.native
}
