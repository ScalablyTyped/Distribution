package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypeSettings extends js.Object {
  def audio(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def flash(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def html(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def image(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def `object`(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def other(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def text(vType: java.lang.String, vName: java.lang.String): scala.Boolean
  def video(vType: java.lang.String, vName: java.lang.String): scala.Boolean
}

object FileTypeSettings {
  @scala.inline
  def apply(
    audio: (java.lang.String, java.lang.String) => scala.Boolean,
    flash: (java.lang.String, java.lang.String) => scala.Boolean,
    html: (java.lang.String, java.lang.String) => scala.Boolean,
    image: (java.lang.String, java.lang.String) => scala.Boolean,
    `object`: (java.lang.String, java.lang.String) => scala.Boolean,
    other: (java.lang.String, java.lang.String) => scala.Boolean,
    text: (java.lang.String, java.lang.String) => scala.Boolean,
    video: (java.lang.String, java.lang.String) => scala.Boolean
  ): FileTypeSettings = {
    val __obj = js.Dynamic.literal(audio = js.Any.fromFunction2(audio), flash = js.Any.fromFunction2(flash), html = js.Any.fromFunction2(html), image = js.Any.fromFunction2(image), other = js.Any.fromFunction2(other), text = js.Any.fromFunction2(text), video = js.Any.fromFunction2(video))
    __obj.updateDynamic("object")(js.Any.fromFunction2(`object`))
    __obj.asInstanceOf[FileTypeSettings]
  }
}

