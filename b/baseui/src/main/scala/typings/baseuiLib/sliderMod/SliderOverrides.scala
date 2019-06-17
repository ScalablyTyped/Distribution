package typings
package baseuiLib.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOverrides extends js.Object {
  var InnerThumb: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var InnerTrack: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Thumb: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var ThumbValue: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Tick: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var TickBar: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Track: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object SliderOverrides {
  @scala.inline
  def apply(
    InnerThumb: baseuiLib.Override[_] = null,
    InnerTrack: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Thumb: baseuiLib.Override[_] = null,
    ThumbValue: baseuiLib.Override[_] = null,
    Tick: baseuiLib.Override[_] = null,
    TickBar: baseuiLib.Override[_] = null,
    Track: baseuiLib.Override[_] = null
  ): SliderOverrides = {
    val __obj = js.Dynamic.literal()
    if (InnerThumb != null) __obj.updateDynamic("InnerThumb")(InnerThumb.asInstanceOf[js.Any])
    if (InnerTrack != null) __obj.updateDynamic("InnerTrack")(InnerTrack.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Thumb != null) __obj.updateDynamic("Thumb")(Thumb.asInstanceOf[js.Any])
    if (ThumbValue != null) __obj.updateDynamic("ThumbValue")(ThumbValue.asInstanceOf[js.Any])
    if (Tick != null) __obj.updateDynamic("Tick")(Tick.asInstanceOf[js.Any])
    if (TickBar != null) __obj.updateDynamic("TickBar")(TickBar.asInstanceOf[js.Any])
    if (Track != null) __obj.updateDynamic("Track")(Track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOverrides]
  }
}

