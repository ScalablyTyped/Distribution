package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte27SourceSettings extends js.Object {
  /**
    * The pid field is used in conjunction with the caption selector languageCode field as follows:
    - Specify PID and Language: Extracts captions from that PID; the language is "informational".
    - Specify PID and omit Language: Extracts the specified PID.
    - Omit PID and specify Language: Extracts the specified language, whichever PID that happens to be.
    - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all languages will be passed through.
    */
  var Pid: js.UndefOr[integerMin1] = js.native
}

object Scte27SourceSettings {
  @scala.inline
  def apply(): Scte27SourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scte27SourceSettings]
  }
  @scala.inline
  implicit class Scte27SourceSettingsOps[Self <: Scte27SourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPid(value: integerMin1): Self = this.set("Pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePid: Self = this.set("Pid", js.undefined)
  }
  
}

