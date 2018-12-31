package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderRangeSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRangeSliderProps
  extends atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps {
  /** Callback invoked when the range value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, scala.Unit]] = js.undefined
  /** Callback invoked when a handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, scala.Unit]] = js.undefined
  /**
    * Range value of slider. Handles will be rendered at each position in the range.
    * @default [0, 10]
    */
  var value: js.UndefOr[NumberRange] = js.undefined
}

