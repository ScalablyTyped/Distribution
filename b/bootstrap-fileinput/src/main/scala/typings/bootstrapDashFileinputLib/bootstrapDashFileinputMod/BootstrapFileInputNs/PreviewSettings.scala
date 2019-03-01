package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod.BootstrapFileInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewSettings extends js.Object {
  var audio: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var flash: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var html: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var image: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var `object`: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var other: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var text: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
  var video: js.UndefOr[bootstrapDashFileinputLib.Anon_Height] = js.undefined
}

object PreviewSettings {
  @scala.inline
  def apply(
    audio: bootstrapDashFileinputLib.Anon_Height = null,
    flash: bootstrapDashFileinputLib.Anon_Height = null,
    html: bootstrapDashFileinputLib.Anon_Height = null,
    image: bootstrapDashFileinputLib.Anon_Height = null,
    `object`: bootstrapDashFileinputLib.Anon_Height = null,
    other: bootstrapDashFileinputLib.Anon_Height = null,
    text: bootstrapDashFileinputLib.Anon_Height = null,
    video: bootstrapDashFileinputLib.Anon_Height = null
  ): PreviewSettings = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (flash != null) __obj.updateDynamic("flash")(flash)
    if (html != null) __obj.updateDynamic("html")(html)
    if (image != null) __obj.updateDynamic("image")(image)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (other != null) __obj.updateDynamic("other")(other)
    if (text != null) __obj.updateDynamic("text")(text)
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[PreviewSettings]
  }
}

