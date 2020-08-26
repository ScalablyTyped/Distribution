package typings.blueprintjsCore.multiSliderMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderBaseProps
  extends IProps
     with IIntentProps {
  /**
    * Whether the slider is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Number of decimal places to use when rendering label value. Default value is the number of
    * decimals used in the `stepSize` prop. This prop has _no effect_ if you supply a custom
    * `labelRenderer` callback.
    * @default inferred from stepSize
    */
  var labelPrecision: js.UndefOr[Double] = js.native
  /**
    * Callback to render a single label. Useful for formatting numbers as currency or percentages.
    * If `true`, labels will use number value formatted to `labelPrecision` decimal places.
    * If `false`, labels will not be shown.
    * @default true
    */
  var labelRenderer: js.UndefOr[Boolean | (js.Function1[/* value */ Double, String | Element])] = js.native
  /**
    * Increment between successive labels. Must be greater than zero.
    * @default 1
    */
  var labelStepSize: js.UndefOr[Double] = js.native
  /**
    * Maximum value of the slider.
    * @default 10
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum value of the slider.
    * @default 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Whether a solid bar should be rendered on the track between current and initial values,
    * or between handles for `RangeSlider`.
    * @default true
    */
  var showTrackFill: js.UndefOr[Boolean] = js.native
  /**
    * Increment between successive values; amount by which the handle moves. Must be greater than zero.
    * @default 1
    */
  var stepSize: js.UndefOr[Double] = js.native
  /**
    * Whether to show the slider in a vertical orientation.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object ISliderBaseProps {
  @scala.inline
  def apply(): ISliderBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderBaseProps]
  }
  @scala.inline
  implicit class ISliderBasePropsOps[Self <: ISliderBaseProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLabelPrecision(value: Double): Self = this.set("labelPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPrecision: Self = this.set("labelPrecision", js.undefined)
    @scala.inline
    def setLabelRendererFunction1(value: /* value */ Double => String | Element): Self = this.set("labelRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelRenderer(value: Boolean | (js.Function1[/* value */ Double, String | Element])): Self = this.set("labelRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelRenderer: Self = this.set("labelRenderer", js.undefined)
    @scala.inline
    def setLabelStepSize(value: Double): Self = this.set("labelStepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStepSize: Self = this.set("labelStepSize", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setShowTrackFill(value: Boolean): Self = this.set("showTrackFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTrackFill: Self = this.set("showTrackFill", js.undefined)
    @scala.inline
    def setStepSize(value: Double): Self = this.set("stepSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepSize: Self = this.set("stepSize", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

