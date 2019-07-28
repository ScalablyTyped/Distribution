package typings.bootstrapDashFileinput.bootstrapDashFileinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypeSettings extends js.Object {
  def audio(vType: String, vName: String): Boolean
  def flash(vType: String, vName: String): Boolean
  def html(vType: String, vName: String): Boolean
  def image(vType: String, vName: String): Boolean
  def `object`(vType: String, vName: String): Boolean
  def other(vType: String, vName: String): Boolean
  def text(vType: String, vName: String): Boolean
  def video(vType: String, vName: String): Boolean
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
}

