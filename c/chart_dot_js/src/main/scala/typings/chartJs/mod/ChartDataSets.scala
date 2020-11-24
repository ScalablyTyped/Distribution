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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartDataSets extends js.Object {
  
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
  implicit class ChartDataSetsOps[Self <: ChartDataSets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColorVarargs(value: (ChartColor | String)*): Self = this.set("backgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("backgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBarPercentage(value: Double): Self = this.set("barPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarPercentage: Self = this.set("barPercentage", js.undefined)
    
    @scala.inline
    def setBarThickness(value: Double | flex): Self = this.set("barThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarThickness: Self = this.set("barThickness", js.undefined)
    
    @scala.inline
    def setBorderAlignVarargs(value: BorderAlignment*): Self = this.set("borderAlign", js.Array(value :_*))
    
    @scala.inline
    def setBorderAlignFunction1(value: /* ctx */ typings.chartJs.anon.Chart => BorderAlignment): Self = this.set("borderAlign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderAlign(value: BorderAlignment | js.Array[BorderAlignment] | Scriptable[BorderAlignment]): Self = this.set("borderAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderAlign: Self = this.set("borderAlign", js.undefined)
    
    @scala.inline
    def setBorderCapStyle(value: butt | round | square): Self = this.set("borderCapStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderCapStyle: Self = this.set("borderCapStyle", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: (ChartColor | String)*): Self = this.set("borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("borderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderDashVarargs(value: Double*): Self = this.set("borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = this.set("borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDashOffset: Self = this.set("borderDashOffset", js.undefined)
    
    @scala.inline
    def setBorderJoinStyle(value: bevel | round | miter): Self = this.set("borderJoinStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderJoinStyle: Self = this.set("borderJoinStyle", js.undefined)
    
    @scala.inline
    def setBorderSkippedVarargs(value: PositionType*): Self = this.set("borderSkipped", js.Array(value :_*))
    
    @scala.inline
    def setBorderSkippedFunction1(value: /* ctx */ typings.chartJs.anon.Chart => PositionType): Self = this.set("borderSkipped", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderSkipped(value: PositionType | js.Array[PositionType] | Scriptable[PositionType]): Self = this.set("borderSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderSkipped: Self = this.set("borderSkipped", js.undefined)
    
    @scala.inline
    def setBorderWidthVarargs(value: BorderWidth*): Self = this.set("borderWidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => BorderWidth): Self = this.set("borderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBorderWidth(value: BorderWidth | js.Array[BorderWidth] | Scriptable[BorderWidth]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setCategoryPercentage(value: Double): Self = this.set("categoryPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryPercentage: Self = this.set("categoryPercentage", js.undefined)
    
    @scala.inline
    def setCubicInterpolationMode(value: default | monotone): Self = this.set("cubicInterpolationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCubicInterpolationMode: Self = this.set("cubicInterpolationMode", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (js.UndefOr[js.Array[Double] | ChartPoint | Double | Null])*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.UndefOr[js.Array[Double] | ChartPoint | Double | Null]]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean | Double | String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHideInLegendAndTooltip(value: Boolean): Self = this.set("hideInLegendAndTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideInLegendAndTooltip: Self = this.set("hideInLegendAndTooltip", js.undefined)
    
    @scala.inline
    def setHitRadiusVarargs(value: Double*): Self = this.set("hitRadius", js.Array(value :_*))
    
    @scala.inline
    def setHitRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("hitRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("hitRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitRadius: Self = this.set("hitRadius", js.undefined)
    
    @scala.inline
    def setHoverBackgroundColorVarargs(value: (ChartColor | String)*): Self = this.set("hoverBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setHoverBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("hoverBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBackgroundColor: Self = this.set("hoverBackgroundColor", js.undefined)
    
    @scala.inline
    def setHoverBorderColorVarargs(value: (ChartColor | String)*): Self = this.set("hoverBorderColor", js.Array(value :_*))
    
    @scala.inline
    def setHoverBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("hoverBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("hoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBorderColor: Self = this.set("hoverBorderColor", js.undefined)
    
    @scala.inline
    def setHoverBorderWidthVarargs(value: Double*): Self = this.set("hoverBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setHoverBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("hoverBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("hoverBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverBorderWidth: Self = this.set("hoverBorderWidth", js.undefined)
    
    @scala.inline
    def setHoverRadius(value: Double): Self = this.set("hoverRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverRadius: Self = this.set("hoverRadius", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLineTension(value: Double): Self = this.set("lineTension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineTension: Self = this.set("lineTension", js.undefined)
    
    @scala.inline
    def setMaxBarThickness(value: Double): Self = this.set("maxBarThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBarThickness: Self = this.set("maxBarThickness", js.undefined)
    
    @scala.inline
    def setMinBarLength(value: Double): Self = this.set("minBarLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBarLength: Self = this.set("minBarLength", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPointBackgroundColorVarargs(value: (ChartColor | String)*): Self = this.set("pointBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setPointBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("pointBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBackgroundColor: Self = this.set("pointBackgroundColor", js.undefined)
    
    @scala.inline
    def setPointBorderColorVarargs(value: (ChartColor | String)*): Self = this.set("pointBorderColor", js.Array(value :_*))
    
    @scala.inline
    def setPointBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("pointBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBorderColor: Self = this.set("pointBorderColor", js.undefined)
    
    @scala.inline
    def setPointBorderWidthVarargs(value: Double*): Self = this.set("pointBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setPointBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("pointBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBorderWidth: Self = this.set("pointBorderWidth", js.undefined)
    
    @scala.inline
    def setPointHitRadiusVarargs(value: Double*): Self = this.set("pointHitRadius", js.Array(value :_*))
    
    @scala.inline
    def setPointHitRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("pointHitRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHitRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointHitRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointHitRadius: Self = this.set("pointHitRadius", js.undefined)
    
    @scala.inline
    def setPointHoverBackgroundColorVarargs(value: (ChartColor | String)*): Self = this.set("pointHoverBackgroundColor", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverBackgroundColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("pointHoverBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverBackgroundColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointHoverBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointHoverBackgroundColor: Self = this.set("pointHoverBackgroundColor", js.undefined)
    
    @scala.inline
    def setPointHoverBorderColorVarargs(value: (ChartColor | String)*): Self = this.set("pointHoverBorderColor", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverBorderColorFunction1(value: /* ctx */ typings.chartJs.anon.Chart => ChartColor): Self = this.set("pointHoverBorderColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverBorderColor(value: ChartColor | js.Array[ChartColor] | Scriptable[ChartColor]): Self = this.set("pointHoverBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointHoverBorderColor: Self = this.set("pointHoverBorderColor", js.undefined)
    
    @scala.inline
    def setPointHoverBorderWidthVarargs(value: Double*): Self = this.set("pointHoverBorderWidth", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverBorderWidthFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("pointHoverBorderWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverBorderWidth(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointHoverBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointHoverBorderWidth: Self = this.set("pointHoverBorderWidth", js.undefined)
    
    @scala.inline
    def setPointHoverRadiusVarargs(value: Double*): Self = this.set("pointHoverRadius", js.Array(value :_*))
    
    @scala.inline
    def setPointHoverRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("pointHoverRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointHoverRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointHoverRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointHoverRadius: Self = this.set("pointHoverRadius", js.undefined)
    
    @scala.inline
    def setPointRadiusVarargs(value: Double*): Self = this.set("pointRadius", js.Array(value :_*))
    
    @scala.inline
    def setPointRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("pointRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRadius: Self = this.set("pointRadius", js.undefined)
    
    @scala.inline
    def setPointRotationVarargs(value: Double*): Self = this.set("pointRotation", js.Array(value :_*))
    
    @scala.inline
    def setPointRotationFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("pointRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("pointRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointRotation: Self = this.set("pointRotation", js.undefined)
    
    @scala.inline
    def setPointStyleVarargs(value: (PointStyle | HTMLImageElement | HTMLCanvasElement)*): Self = this.set("pointStyle", js.Array(value :_*))
    
    @scala.inline
    def setPointStyleFunction1(value: /* ctx */ typings.chartJs.anon.Chart => PointStyle | HTMLImageElement | HTMLCanvasElement): Self = this.set("pointStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointStyle(
      value: PointStyle | HTMLImageElement | HTMLCanvasElement | (js.Array[PointStyle | HTMLImageElement | HTMLCanvasElement]) | (Scriptable[PointStyle | HTMLImageElement | HTMLCanvasElement])
    ): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointStyle: Self = this.set("pointStyle", js.undefined)
    
    @scala.inline
    def setRadiusVarargs(value: Double*): Self = this.set("radius", js.Array(value :_*))
    
    @scala.inline
    def setRadiusFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("radius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRadius(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRotationVarargs(value: Double*): Self = this.set("rotation", js.Array(value :_*))
    
    @scala.inline
    def setRotationFunction1(value: /* ctx */ typings.chartJs.anon.Chart => Double): Self = this.set("rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRotation(value: Double | js.Array[Double] | Scriptable[Double]): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setShowLine(value: Boolean): Self = this.set("showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLine: Self = this.set("showLine", js.undefined)
    
    @scala.inline
    def setSpanGaps(value: Boolean): Self = this.set("spanGaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanGaps: Self = this.set("spanGaps", js.undefined)
    
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setSteppedLine(value: before | after | middle | Boolean): Self = this.set("steppedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteppedLine: Self = this.set("steppedLine", js.undefined)
    
    @scala.inline
    def setType(value: ChartType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setXAxisID(value: String): Self = this.set("xAxisID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisID: Self = this.set("xAxisID", js.undefined)
    
    @scala.inline
    def setYAxisID(value: String): Self = this.set("yAxisID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisID: Self = this.set("yAxisID", js.undefined)
  }
}
