package typings.chromeApps.chrome.tts

import typings.chromeApps.chromeAppsStrings.female
import typings.chromeApps.chromeAppsStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A description of a voice available for speech synthesis. */
@js.native
trait TtsVoice extends js.Object {
  /** All of the callback event types that this voice is capable of sending. */
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  /** The ID of the extension providing this voice. */
  var extensionsId: js.UndefOr[String] = js.native
  /**
    * @deprecated Deprecated since Chrome 70. Gender is deprecated and will be ignored.
    * @description This voice's gender.
    */
  var gender: js.UndefOr[male | female] = js.native
  /** The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.native
  /**
    * If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
    * @since Chrome 33.
    */
  var remote: js.UndefOr[Boolean] = js.native
  /** The name of the voice. */
  var voiceName: js.UndefOr[String] = js.native
}

object TtsVoice {
  @scala.inline
  def apply(): TtsVoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtsVoice]
  }
  @scala.inline
  implicit class TtsVoiceOps[Self <: TtsVoice] (val x: Self) extends AnyVal {
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
    def setEventTypesVarargs(value: String*): Self = this.set("eventTypes", js.Array(value :_*))
    @scala.inline
    def setEventTypes(value: js.Array[String]): Self = this.set("eventTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypes: Self = this.set("eventTypes", js.undefined)
    @scala.inline
    def setExtensionsId(value: String): Self = this.set("extensionsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionsId: Self = this.set("extensionsId", js.undefined)
    @scala.inline
    def setGender(value: male | female): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setRemote(value: Boolean): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    @scala.inline
    def setVoiceName(value: String): Self = this.set("voiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoiceName: Self = this.set("voiceName", js.undefined)
  }
  
}

