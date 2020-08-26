package typings.chartJs.mod

import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedTickOptions extends js.Object {
  var autoSkip: js.UndefOr[Boolean] = js.native
  var autoSkipPadding: js.UndefOr[Double] = js.native
  var backdropColor: js.UndefOr[ChartColor] = js.native
  var backdropPaddingX: js.UndefOr[Double] = js.native
  var backdropPaddingY: js.UndefOr[Double] = js.native
  var beginAtZero: js.UndefOr[Boolean] = js.native
  /**
    * If the callback returns null or undefined the associated grid line will be hidden.
    */
  var callback: js.UndefOr[
    js.Function3[
      /* value */ Double | String, 
      /* index */ Double, 
      /* values */ js.Array[Double | String], 
      js.UndefOr[String | Double | Null]
    ]
  ] = js.native
  var display: js.UndefOr[Boolean] = js.native
  var fontColor: js.UndefOr[ChartColor] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var labelOffset: js.UndefOr[Double] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var max: js.UndefOr[js.Any] = js.native
  var maxRotation: js.UndefOr[Double] = js.native
  var maxTicksLimit: js.UndefOr[Double] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var minRotation: js.UndefOr[Double] = js.native
  var mirror: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  /**
    * The number of ticks to examine when deciding how many labels will fit.
    * Setting a smaller value will be faster, but may be less accurate
    * when there is large variability in label length.
    * Deault: `ticks.length`
    */
  var sampleSize: js.UndefOr[Double] = js.native
  var showLabelBackdrop: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[auto | data | labels] = js.native
  var stepSize: js.UndefOr[Double] = js.native
  var suggestedMax: js.UndefOr[Double] = js.native
  var suggestedMin: js.UndefOr[Double] = js.native
}

object NestedTickOptions {
  @scala.inline
  def apply(): NestedTickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedTickOptions]
  }
  @scala.inline
  implicit class NestedTickOptionsOps[Self <: NestedTickOptions] (val x: Self) extends AnyVal {
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
    def setAutoSkip(value: Boolean): Self = this.set("autoSkip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSkip: Self = this.set("autoSkip", js.undefined)
    @scala.inline
    def setAutoSkipPadding(value: Double): Self = this.set("autoSkipPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSkipPadding: Self = this.set("autoSkipPadding", js.undefined)
    @scala.inline
    def setBackdropColorVarargs(value: String*): Self = this.set("backdropColor", js.Array(value :_*))
    @scala.inline
    def setBackdropColor(value: ChartColor): Self = this.set("backdropColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropColor: Self = this.set("backdropColor", js.undefined)
    @scala.inline
    def setBackdropPaddingX(value: Double): Self = this.set("backdropPaddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropPaddingX: Self = this.set("backdropPaddingX", js.undefined)
    @scala.inline
    def setBackdropPaddingY(value: Double): Self = this.set("backdropPaddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropPaddingY: Self = this.set("backdropPaddingY", js.undefined)
    @scala.inline
    def setBeginAtZero(value: Boolean): Self = this.set("beginAtZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginAtZero: Self = this.set("beginAtZero", js.undefined)
    @scala.inline
    def setCallback(
      value: (/* value */ Double | String, /* index */ Double, /* values */ js.Array[Double | String]) => js.UndefOr[String | Double | Null]
    ): Self = this.set("callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFontColorVarargs(value: String*): Self = this.set("fontColor", js.Array(value :_*))
    @scala.inline
    def setFontColor(value: ChartColor): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setLabelOffset(value: Double): Self = this.set("labelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOffset: Self = this.set("labelOffset", js.undefined)
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxRotation(value: Double): Self = this.set("maxRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRotation: Self = this.set("maxRotation", js.undefined)
    @scala.inline
    def setMaxTicksLimit(value: Double): Self = this.set("maxTicksLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTicksLimit: Self = this.set("maxTicksLimit", js.undefined)
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinRotation(value: Double): Self = this.set("minRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRotation: Self = this.set("minRotation", js.undefined)
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setSampleSize(value: Double): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    @scala.inline
    def setShowLabelBackdrop(value: Boolean): Self = this.set("showLabelBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLabelBackdrop: Self = this.set("showLabelBackdrop", js.undefined)
    @scala.inline
    def setSource(value: auto | data | labels): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepSize: Self = this.set("stepSize", js.undefined)
    @scala.inline
    def setSuggestedMax(value: Double): Self = this.set("suggestedMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedMax: Self = this.set("suggestedMax", js.undefined)
    @scala.inline
    def setSuggestedMin(value: Double): Self = this.set("suggestedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedMin: Self = this.set("suggestedMin", js.undefined)
  }
  
}

