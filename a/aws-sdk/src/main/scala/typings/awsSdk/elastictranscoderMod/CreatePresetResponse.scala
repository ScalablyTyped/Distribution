package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresetResponse extends js.Object {
  /**
    * A section of the response body that provides information about the preset that is created.
    */
  var Preset: js.UndefOr[typings.awsSdk.elastictranscoderMod.Preset] = js.native
  /**
    * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created the preset because the settings might produce acceptable output.
    */
  var Warning: js.UndefOr[String] = js.native
}

object CreatePresetResponse {
  @scala.inline
  def apply(): CreatePresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresetResponse]
  }
  @scala.inline
  implicit class CreatePresetResponseOps[Self <: CreatePresetResponse] (val x: Self) extends AnyVal {
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
    def setPreset(value: Preset): Self = this.set("Preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("Preset", js.undefined)
    @scala.inline
    def setWarning(value: String): Self = this.set("Warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
  
}

