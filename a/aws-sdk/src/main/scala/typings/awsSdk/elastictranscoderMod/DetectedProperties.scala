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
  def apply(): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedProperties]
  }
  @scala.inline
  implicit class DetectedPropertiesOps[Self <: DetectedProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDurationMillis(value: NullableLong): Self = this.set("DurationMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMillis: Self = this.set("DurationMillis", js.undefined)
    @scala.inline
    def setFileSize(value: NullableLong): Self = this.set("FileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("FileSize", js.undefined)
    @scala.inline
    def setFrameRate(value: FloatString): Self = this.set("FrameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("FrameRate", js.undefined)
    @scala.inline
    def setHeight(value: NullableInteger): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    @scala.inline
    def setWidth(value: NullableInteger): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
  }
  
}

