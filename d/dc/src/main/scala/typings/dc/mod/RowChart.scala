package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowChart
  extends StObject
     with CapMixin[RowChart]
     with MarginMixin[RowChart]
     with ColorMixin[RowChart]
     with BaseMixin[RowChart] {
  
  def elasticX(): Boolean = js.native
  def elasticX(t: Boolean): RowChart = js.native
  @JSName("elasticX")
  var elasticX_Original: IGetSet[Boolean, RowChart] = js.native
  
  def fixedBarHeight(): Boolean | Double = js.native
  def fixedBarHeight(t: Boolean): RowChart = js.native
  def fixedBarHeight(t: Double): RowChart = js.native
  @JSName("fixedBarHeight")
  var fixedBarHeight_Original: IGetSet[Boolean | Double, RowChart] = js.native
  
  def gap(): Double = js.native
  def gap(t: Double): RowChart = js.native
  @JSName("gap")
  var gap_Original: IGetSet[Double, RowChart] = js.native
  
  def labelOffsetX(): Double = js.native
  def labelOffsetX(t: Double): RowChart = js.native
  @JSName("labelOffsetX")
  var labelOffsetX_Original: IGetSet[Double, RowChart] = js.native
  
  def labelOffsetY(): Double = js.native
  def labelOffsetY(t: Double): RowChart = js.native
  @JSName("labelOffsetY")
  var labelOffsetY_Original: IGetSet[Double, RowChart] = js.native
  
  def renderTitleLabel(): Boolean = js.native
  def renderTitleLabel(t: Boolean): RowChart = js.native
  @JSName("renderTitleLabel")
  var renderTitleLabel_Original: IGetSet[Boolean, RowChart] = js.native
  
  def titleLabelOffsetX(): Double = js.native
  def titleLabelOffsetX(t: Double): RowChart = js.native
  @JSName("titleLabelOffsetX")
  var titleLabelOffsetX_Original: IGetSet[Double, RowChart] = js.native
  
  def x(): Scale[Double] = js.native
  def x(t: Scale[Double]): RowChart = js.native
  
  def xAxis(): Any = js.native
  def xAxis(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ Any
  ): RowChart = js.native
  @JSName("xAxis")
  var xAxis_Original: IGetSet[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify d3.svg.Axis */ Any, 
    RowChart
  ] = js.native
  
  @JSName("x")
  var x_Original: IGetSet[Scale[Double], RowChart] = js.native
}
