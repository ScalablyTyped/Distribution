package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameCaptureSettings extends js.Object {
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.n.jpg where n is the 0-based sequence number of each Capture.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based frame sequence number zero padded to 7 decimal places.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Maximum number of captures (encoded jpg output files).
    */
  var MaxCaptures: js.UndefOr[integerMin1Max10000000] = js.native
  /**
    * JPEG Quality - a higher value equals higher quality.
    */
  var Quality: js.UndefOr[integerMin1Max100] = js.native
}

object FrameCaptureSettings {
  @scala.inline
  def apply(
    FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    MaxCaptures: js.UndefOr[integerMin1Max10000000] = js.undefined,
    Quality: js.UndefOr[integerMin1Max100] = js.undefined
  ): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxCaptures)) __obj.updateDynamic("MaxCaptures")(MaxCaptures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Quality)) __obj.updateDynamic("Quality")(Quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureSettings]
  }
}

