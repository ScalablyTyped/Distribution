package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowChart
  extends CapMixin[RowChart]
     with MarginMixin[RowChart]
     with ColorMixin[RowChart]
     with BaseMixin[RowChart] {
  @JSName("elasticX")
  var elasticX_Original: IGetSet[scala.Boolean, RowChart] = js.native
  @JSName("fixedBarHeight")
  var fixedBarHeight_Original: IGetSet[scala.Double, RowChart] = js.native
  @JSName("gap")
  var gap_Original: IGetSet[scala.Double, RowChart] = js.native
  @JSName("labelOffsetX")
  var labelOffsetX_Original: IGetSet[scala.Double, RowChart] = js.native
  @JSName("labelOffsetY")
  var labelOffsetY_Original: IGetSet[scala.Double, RowChart] = js.native
  @JSName("renderTitleLabel")
  var renderTitleLabel_Original: IGetSet[scala.Boolean, RowChart] = js.native
  @JSName("titleLabelOffsetX")
  var titleLabelOffsetX_Original: IGetSet[scala.Double, RowChart] = js.native
  @JSName("xAxis")
  var xAxis_Original: IGetSet[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ _, 
    RowChart
  ] = js.native
  @JSName("x")
  var x_Original: IGetSet[Scale[scala.Double], RowChart] = js.native
  def elasticX(): scala.Boolean = js.native
  def elasticX(t: scala.Boolean): RowChart = js.native
  def fixedBarHeight(): scala.Double = js.native
  def fixedBarHeight(t: scala.Double): RowChart = js.native
  def gap(): scala.Double = js.native
  def gap(t: scala.Double): RowChart = js.native
  def labelOffsetX(): scala.Double = js.native
  def labelOffsetX(t: scala.Double): RowChart = js.native
  def labelOffsetY(): scala.Double = js.native
  def labelOffsetY(t: scala.Double): RowChart = js.native
  def renderTitleLabel(): scala.Boolean = js.native
  def renderTitleLabel(t: scala.Boolean): RowChart = js.native
  def titleLabelOffsetX(): scala.Double = js.native
  def titleLabelOffsetX(t: scala.Double): RowChart = js.native
  def x(): Scale[scala.Double] = js.native
  def x(t: Scale[scala.Double]): RowChart = js.native
  def xAxis(): js.Any = js.native
  def xAxis(t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis */ js.Any): RowChart = js.native
}

