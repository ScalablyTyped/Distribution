package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiSliderProps extends ISliderBaseProps {
  /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
  var defaultTrackIntent: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent] = js.undefined
  /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[scala.Double], scala.Unit]] = js.undefined
  /** Callback invoked when a handle is released. Receives handle values in sorted order. */
  var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[scala.Double], scala.Unit]] = js.undefined
}

