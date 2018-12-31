package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderProps
  extends atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod.ISliderBaseProps {
  /**
    * Initial value of the slider. This determines the other end of the
    * track fill: from `initialValue` to `value`.
    * @default 0
    */
  var initialValue: js.UndefOr[scala.Double] = js.undefined
  /** Callback invoked when the value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /** Callback invoked when the handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Value of slider.
    * @default 0
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

