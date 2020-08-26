package typings.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypeSettings extends js.Object {
  def audio(vType: String, vName: String): Boolean = js.native
  def flash(vType: String, vName: String): Boolean = js.native
  def html(vType: String, vName: String): Boolean = js.native
  def image(vType: String, vName: String): Boolean = js.native
  def `object`(vType: String, vName: String): Boolean = js.native
  def other(vType: String, vName: String): Boolean = js.native
  def text(vType: String, vName: String): Boolean = js.native
  def video(vType: String, vName: String): Boolean = js.native
}

object FileTypeSettings {
  @scala.inline
  def apply(
    audio: (String, String) => Boolean,
    flash: (String, String) => Boolean,
    html: (String, String) => Boolean,
    image: (String, String) => Boolean,
    `object`: (String, String) => Boolean,
    other: (String, String) => Boolean,
    text: (String, String) => Boolean,
    video: (String, String) => Boolean
  ): FileTypeSettings = {
    val __obj = js.Dynamic.literal(audio = js.Any.fromFunction2(audio), flash = js.Any.fromFunction2(flash), html = js.Any.fromFunction2(html), image = js.Any.fromFunction2(image), other = js.Any.fromFunction2(other), text = js.Any.fromFunction2(text), video = js.Any.fromFunction2(video))
    __obj.updateDynamic("object")(js.Any.fromFunction2(`object`))
    __obj.asInstanceOf[FileTypeSettings]
  }
  @scala.inline
  implicit class FileTypeSettingsOps[Self <: FileTypeSettings] (val x: Self) extends AnyVal {
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
    def setAudio(value: (String, String) => Boolean): Self = this.set("audio", js.Any.fromFunction2(value))
    @scala.inline
    def setFlash(value: (String, String) => Boolean): Self = this.set("flash", js.Any.fromFunction2(value))
    @scala.inline
    def setHtml(value: (String, String) => Boolean): Self = this.set("html", js.Any.fromFunction2(value))
    @scala.inline
    def setImage(value: (String, String) => Boolean): Self = this.set("image", js.Any.fromFunction2(value))
    @scala.inline
    def setObject(value: (String, String) => Boolean): Self = this.set("object", js.Any.fromFunction2(value))
    @scala.inline
    def setOther(value: (String, String) => Boolean): Self = this.set("other", js.Any.fromFunction2(value))
    @scala.inline
    def setText(value: (String, String) => Boolean): Self = this.set("text", js.Any.fromFunction2(value))
    @scala.inline
    def setVideo(value: (String, String) => Boolean): Self = this.set("video", js.Any.fromFunction2(value))
  }
  
}

