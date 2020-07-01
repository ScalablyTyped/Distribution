package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSourceFramerate extends js.Object {
  /**
    * Specify the denominator of the fraction that represents the frame rate for the setting Caption source frame rate (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.native
  /**
    * Specify the numerator of the fraction that represents the frame rate for the setting Caption source frame rate (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max60000] = js.native
}

object CaptionSourceFramerate {
  @scala.inline
  def apply(
    FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.undefined,
    FramerateNumerator: js.UndefOr[integerMin1Max60000] = js.undefined
  ): CaptionSourceFramerate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSourceFramerate]
  }
}

