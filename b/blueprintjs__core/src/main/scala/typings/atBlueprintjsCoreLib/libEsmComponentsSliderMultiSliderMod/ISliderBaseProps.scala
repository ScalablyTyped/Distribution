package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISliderBaseProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Whether the slider is non-interactive.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Number of decimal places to use when rendering label value. Default value is the number of
       * decimals used in the `stepSize` prop. This prop has _no effect_ if you supply a custom
       * `labelRenderer` callback.
       * @default inferred from stepSize
       */
  var labelPrecision: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback to render a single label. Useful for formatting numbers as currency or percentages.
       * If `true`, labels will use number value formatted to `labelPrecision` decimal places.
       * If `false`, labels will not be shown.
       * @default true
       */
  var labelRenderer: js.UndefOr[
    scala.Boolean | (js.Function1[
      /* value */ scala.Double, 
      java.lang.String | reactLib.reactMod.Global.JSXNs.Element
    ])
  ] = js.undefined
  /**
       * Increment between successive labels. Must be greater than zero.
       * @default 1
       */
  var labelStepSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Maximum value of the slider.
       * @default 10
       */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
       * Minimum value of the slider.
       * @default 0
       */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether a solid bar should be rendered on the track between current and initial values,
       * or between handles for `RangeSlider`.
       * @default true
       */
  var showTrackFill: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Increment between successive values; amount by which the handle moves. Must be greater than zero.
       * @default 1
       */
  var stepSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether to show the slider in a vertical orientation.
       * @default false
       */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

