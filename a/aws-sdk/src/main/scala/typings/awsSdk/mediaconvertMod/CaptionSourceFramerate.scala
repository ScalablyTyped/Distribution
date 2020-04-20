package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSourceFramerate extends js.Object {
  /**
    * Specify the denominator of the fraction that represents the framerate for the setting Caption source framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.native
  /**
    * Specify the numerator of the fraction that represents the framerate for the setting Caption source framerate (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max60000] = js.native
}

object CaptionSourceFramerate {
  @scala.inline
  def apply(FramerateDenominator: Int | Double = null, FramerateNumerator: Int | Double = null): CaptionSourceFramerate = {
    val __obj = js.Dynamic.literal()
    if (FramerateDenominator != null) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.asInstanceOf[js.Any])
    if (FramerateNumerator != null) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSourceFramerate]
  }
}

