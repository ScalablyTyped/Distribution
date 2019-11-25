package typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmMod

import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.`%`
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.ch
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.dashed
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.dotted
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.double
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.em
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.ex
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.groove
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.hidden
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.inset
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.none
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.outset
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.px
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.rem
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.ridge
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.solid
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.vh
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.vmin
import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.vw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double | String] = js.undefined
  var defaultRhythmBorderStyle: js.UndefOr[
    solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
  ] = js.undefined
  var defaultRhythmBorderWidth: js.UndefOr[String] = js.undefined
  var minLinePadding: js.UndefOr[String] = js.undefined
  var rhythmUnit: js.UndefOr[`%` | em | ex | ch | px | rem | vw | vh | vmin] = js.undefined
  var roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseFontSize: String = null,
    baseLineHeight: Double | String = null,
    defaultRhythmBorderStyle: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset = null,
    defaultRhythmBorderWidth: String = null,
    minLinePadding: String = null,
    rhythmUnit: `%` | em | ex | ch | px | rem | vw | vh | vmin = null,
    roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (baseLineHeight != null) __obj.updateDynamic("baseLineHeight")(baseLineHeight.asInstanceOf[js.Any])
    if (defaultRhythmBorderStyle != null) __obj.updateDynamic("defaultRhythmBorderStyle")(defaultRhythmBorderStyle.asInstanceOf[js.Any])
    if (defaultRhythmBorderWidth != null) __obj.updateDynamic("defaultRhythmBorderWidth")(defaultRhythmBorderWidth.asInstanceOf[js.Any])
    if (minLinePadding != null) __obj.updateDynamic("minLinePadding")(minLinePadding.asInstanceOf[js.Any])
    if (rhythmUnit != null) __obj.updateDynamic("rhythmUnit")(rhythmUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(roundToNearestHalfLine)) __obj.updateDynamic("roundToNearestHalfLine")(roundToNearestHalfLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

