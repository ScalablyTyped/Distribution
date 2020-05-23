package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedProperties extends js.Object {
  /**
    * The detected duration of the input file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The detected file size of the input file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.native
  /**
    * The detected frame rate of the input file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.native
  /**
    * The detected height of the input file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.native
  /**
    * The detected width of the input file, in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.native
}

object DetectedProperties {
  @scala.inline
  def apply(
    DurationMillis: js.UndefOr[NullableLong] = js.undefined,
    FileSize: js.UndefOr[NullableLong] = js.undefined,
    FrameRate: FloatString = null,
    Height: js.UndefOr[NullableInteger] = js.undefined,
    Width: js.UndefOr[NullableInteger] = js.undefined
  ): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationMillis)) __obj.updateDynamic("DurationMillis")(DurationMillis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FileSize)) __obj.updateDynamic("FileSize")(FileSize.get.asInstanceOf[js.Any])
    if (FrameRate != null) __obj.updateDynamic("FrameRate")(FrameRate.asInstanceOf[js.Any])
    if (!js.isUndefined(Height)) __obj.updateDynamic("Height")(Height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Width)) __obj.updateDynamic("Width")(Width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedProperties]
  }
}

