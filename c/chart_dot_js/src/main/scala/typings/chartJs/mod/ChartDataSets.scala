package typings.chartJs.mod

import typings.chartJs.chartJsStrings.after
import typings.chartJs.chartJsStrings.before
import typings.chartJs.chartJsStrings.bevel
import typings.chartJs.chartJsStrings.butt
import typings.chartJs.chartJsStrings.default
import typings.chartJs.chartJsStrings.flex
import typings.chartJs.chartJsStrings.middle
import typings.chartJs.chartJsStrings.miter
import typings.chartJs.chartJsStrings.monotone
import typings.chartJs.chartJsStrings.round
import typings.chartJs.chartJsStrings.square
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDataSets extends StObject {
  
  var backgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var barPercentage: js.UndefOr[Double] = js.native
  
  var barThickness: js.UndefOr[Double | flex] = js.native
  
  var borderAlign: js.UndefOr[BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]] = js.native
  
  var borderCapStyle: js.UndefOr[butt | round | square] = js.native
  
  var borderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  
  var borderDashOffset: js.UndefOr[Double] = js.native
  
  var borderJoinStyle: js.UndefOr[bevel | round | miter] = js.native
  
  var borderSkipped: js.UndefOr[PositionType | js.Array[PositionType] | Scriptable[PositionType]] = js.native
  
  var borderWidth: js.UndefOr[BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]] = js.native
  
  var categoryPercentage: js.UndefOr[Double] = js.native
  
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.native
  
  var data: js.UndefOr[js.Array[js.UndefOr[js.Array[Double] | ChartPoint | Double | Null]]] = js.native
  
  var fill: js.UndefOr[Boolean | Double | String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var hideInLegendAndTooltip: js.UndefOr[Boolean] = js.native
  
  var hitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var hoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var hoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var hoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var hoverRadius: js.UndefOr[Double] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var lineTension: js.UndefOr[Double] = js.native
  
  var maxBarThickness: js.UndefOr[Double] = js.native
  
  var minBarLength: js.UndefOr[Double] = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var pointBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var pointBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var pointBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var pointHitRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var pointHoverBackgroundColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var pointHoverBorderColor: js.UndefOr[ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]] = js.native
  
  var pointHoverBorderWidth: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var pointHoverRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var pointRadius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var pointRotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var pointStyle: js.UndefOr[
    PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
  ] = js.native
  
  var radius: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var rotation: js.UndefOr[Double | js.Array[Double] | Scriptable[Double]] = js.native
  
  var showLine: js.UndefOr[Boolean] = js.native
  
  var spanGaps: js.UndefOr[Boolean] = js.native
  
  var stack: js.UndefOr[String] = js.native
  
  var steppedLine: js.UndefOr[before | after | middle | Boolean] = js.native
  
  var `type`: js.UndefOr[ChartType | String] = js.native
  
  var weight: js.UndefOr[Double] = js.native
  
  var xAxisID: js.UndefOr[String] = js.native
  
  var yAxisID: js.UndefOr[String] = js.native
}
object ChartDataSets {
  
  @scala.inline
  def apply(): ChartDataSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataSets]
  }
  
  @scala.inline
  implicit class ChartDataSetsMutableBuilder[Self <: ChartDataSets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBarPercentage(value: Double): Self = StObject.set(x, "barPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarPercentageUndefined: Self = StObject.set(x, "barPercentage", js.undefined)
    
    @scala.inline
    def setBarThickness(value: Double | flex): Self = StObject.set(x, "barThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarThicknessUndefined: Self = StObject.set(x, "barThickness", js.undefined)
    
    @scala.inline
    def setBorderAlign(value: BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]): Self = StObject.set(x, "borderAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderAlignFunction1(value: /* ctx */ typings.chartJs.anon.Chart => BorderAlignment): Self = StObject.set(x, "borderAlign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderAlignUndefined: Self = StObject.set(x, "borderAlign", js.undefined)
    
    @scala.inline
    def setBorderAlignVarargs(value: BorderAlignment*): Self = StObject.set(x, "borderAlign", js.Array(value :_*))
    
    @scala.inline
    def setBorderCapStyle(value: butt | round | square): Self = StObject.set(x, "borderCapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderCapStyleUndefined: Self = StObject.set(x, "borderCapStyle", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    @scala.inline
    def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderJoinStyle(value: bevel | round | miter): Self = StObject.set(x, "borderJoinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderJoinStyleUndefined: Self = StObject.set(x, "borderJoinStyle", js.undefined)
    
    @scala.inline
    def setBorderSkipped(value: PositionType | js.Array[PositionType] | Scriptable[PositionType]): Self = StObject.set(x, "borderSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderSkippedFunction1(value: /* ctx */ typings.chartJs.anon.Chart => PositionType): Self = StObject.set(x, "borderSkipped", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderSkippedUndefined: Self = StObject.set(x, "borderSkipped", js.undefined)
    
    @scala.inline
    def setBorderSkippedVarargs(value: PositionType*): Self = StObject.set(x, "borderSkipped", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidth(value: BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => BorderWidth): Self = StObject.set(x, "borderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBorderWidthVarargs(value: BorderWidth*): Self = StObject.set(x, "borderWidth", js.Array(value :_*))
    
    @scala.inline
    def setCategoryPercentage(value: Double): Self = StObject.set(x, "categoryPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryPercentageUndefined: Self = StObject.set(x, "categoryPercentage", js.undefined)
    
    @scala.inline
    def setCubicInterpolationMode(value: default | monotone): Self = StObject.set(x, "cubicInterpolationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubicInterpolationModeUndefined: Self = StObject.set(x, "cubicInterpolationMode", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.UndefOr[js.Array[Double] | ChartPoint | Double | Null]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (js.UndefOr[js.Array[Double] | ChartPoint | Double | Null])*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: Boolean | Double | String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHideInLegendAndTooltip(value: Boolean): Self = StObject.set(x, "hideInLegendAndTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideInLegendAndTooltipUndefined: Self = StObject.set(x, "hideInLegendAndTooltip", js.undefined)
    
    @scala.inline
    def setHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "hitRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "hitRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHitRadiusUndefined: Self = StObject.set(x, "hitRadius", js.undefined)
    
    @scala.inline
    def setHitRadiusVarargs(value: Double*): Self = StObject.set(x, "hitRadius", js.Array(value :_*))
    
    @scala.inline
    def setHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "hoverBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverBackgroundColorUndefined: Self = StObject.set(x, "hoverBackgroundColor", js.undefined)
    
    @scala.inline
    def setHoverBackgroundColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "hoverBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "hoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "hoverBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverBorderColorUndefined: Self = StObject.set(x, "hoverBorderColor", js.undefined)
    
    @scala.inline
    def setHoverBorderColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "hoverBorderColor", js.Array(value :_*))
    
    @scala.inline
    def setHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "hoverBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "hoverBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverBorderWidthUndefined: Self = StObject.set(x, "hoverBorderWidth", js.undefined)
    
    @scala.inline
    def setHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "hoverBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setHoverRadius(value: Double): Self = StObject.set(x, "hoverRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverRadiusUndefined: Self = StObject.set(x, "hoverRadius", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLineTension(value: Double): Self = StObject.set(x, "lineTension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTensionUndefined: Self = StObject.set(x, "lineTension", js.undefined)
    
    @scala.inline
    def setMaxBarThickness(value: Double): Self = StObject.set(x, "maxBarThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBarThicknessUndefined: Self = StObject.set(x, "maxBarThickness", js.undefined)
    
    @scala.inline
    def setMinBarLength(value: Double): Self = StObject.set(x, "minBarLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBarLengthUndefined: Self = StObject.set(x, "minBarLength", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPointBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "pointBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "pointBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointBackgroundColorUndefined: Self = StObject.set(x, "pointBackgroundColor", js.undefined)
    
    @scala.inline
    def setPointBackgroundColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "pointBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setPointBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "pointBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "pointBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointBorderColorUndefined: Self = StObject.set(x, "pointBorderColor", js.undefined)
    
    @scala.inline
    def setPointBorderColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "pointBorderColor", js.Array(value :_*))
    
    @scala.inline
    def setPointBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "pointBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "pointBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointBorderWidthUndefined: Self = StObject.set(x, "pointBorderWidth", js.undefined)
    
    @scala.inline
    def setPointBorderWidthVarargs(value: Double*): Self = StObject.set(x, "pointBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setPointHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "pointHitRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointHitRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "pointHitRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHitRadiusUndefined: Self = StObject.set(x, "pointHitRadius", js.undefined)
    
    @scala.inline
    def setPointHitRadiusVarargs(value: Double*): Self = StObject.set(x, "pointHitRadius", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointHoverBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "pointHoverBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverBackgroundColorUndefined: Self = StObject.set(x, "pointHoverBackgroundColor", js.undefined)
    
    @scala.inline
    def setPointHoverBackgroundColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "pointHoverBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = StObject.set(x, "pointHoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointHoverBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = StObject.set(x, "pointHoverBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverBorderColorUndefined: Self = StObject.set(x, "pointHoverBorderColor", js.undefined)
    
    @scala.inline
    def setPointHoverBorderColorVarargs(value: (ChartColor | String)*): Self = StObject.set(x, "pointHoverBorderColor", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "pointHoverBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointHoverBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "pointHoverBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverBorderWidthUndefined: Self = StObject.set(x, "pointHoverBorderWidth", js.undefined)
    
    @scala.inline
    def setPointHoverBorderWidthVarargs(value: Double*): Self = StObject.set(x, "pointHoverBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "pointHoverRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointHoverRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "pointHoverRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverRadiusUndefined: Self = StObject.set(x, "pointHoverRadius", js.undefined)
    
    @scala.inline
    def setPointHoverRadiusVarargs(value: Double*): Self = StObject.set(x, "pointHoverRadius", js.Array(value :_*))
    
    @scala.inline
    def setPointRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "pointRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
    
    @scala.inline
    def setPointRadiusVarargs(value: Double*): Self = StObject.set(x, "pointRadius", js.Array(value :_*))
    
    @scala.inline
    def setPointRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "pointRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointRotationFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "pointRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointRotationUndefined: Self = StObject.set(x, "pointRotation", js.undefined)
    
    @scala.inline
    def setPointRotationVarargs(value: Double*): Self = StObject.set(x, "pointRotation", js.Array(value :_*))
    
    @scala.inline
    def setPointStyle(
      value: PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
    ): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointStyleFunction1(value: /* ctx */ typings.chartJs.anon.Chart => PointStyle | HTMLImageElement | HTMLCanvasElement): Self = StObject.set(x, "pointStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
    
    @scala.inline
    def setPointStyleVarargs(value: (PointStyle | HTMLImageElement | HTMLCanvasElement)*): Self = StObject.set(x, "pointStyle", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "radius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value :_*))
    
    @scala.inline
    def setRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = StObject.set(x, "rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setRotationVarargs(value: Double*): Self = StObject.set(x, "rotation", js.Array(value :_*))
    
    @scala.inline
    def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
    
    @scala.inline
    def setSpanGaps(value: Boolean): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanGapsUndefined: Self = StObject.set(x, "spanGaps", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setSteppedLine(value: before | after | middle | Boolean): Self = StObject.set(x, "steppedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteppedLineUndefined: Self = StObject.set(x, "steppedLine", js.undefined)
    
    @scala.inline
    def setType(value: ChartType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    @scala.inline
    def setXAxisID(value: String): Self = StObject.set(x, "xAxisID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisIDUndefined: Self = StObject.set(x, "xAxisID", js.undefined)
    
    @scala.inline
    def setYAxisID(value: String): Self = StObject.set(x, "yAxisID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisIDUndefined: Self = StObject.set(x, "yAxisID", js.undefined)
  }
}
