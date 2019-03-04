package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod.BootstrapFileInputNs

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
    audio: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    flash: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    html: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    image: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    `object`: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    other: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    text: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    video: js.Function2[java.lang.String, java.lang.String, scala.Boolean]
  ): FileTypeSettings = {
    val __obj = js.Dynamic.literal(audio = audio, flash = flash, html = html, image = image, other = other, text = text, video = video)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[FileTypeSettings]
  }
}

