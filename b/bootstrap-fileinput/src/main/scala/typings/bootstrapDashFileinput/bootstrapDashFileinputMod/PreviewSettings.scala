package typings.bootstrapDashFileinput.bootstrapDashFileinputMod

import typings.bootstrapDashFileinput.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewSettings extends js.Object {
  var audio: js.UndefOr[Anon_Height] = js.undefined
  var flash: js.UndefOr[Anon_Height] = js.undefined
  var html: js.UndefOr[Anon_Height] = js.undefined
  var image: js.UndefOr[Anon_Height] = js.undefined
  var `object`: js.UndefOr[Anon_Height] = js.undefined
  var other: js.UndefOr[Anon_Height] = js.undefined
  var text: js.UndefOr[Anon_Height] = js.undefined
  var video: js.UndefOr[Anon_Height] = js.undefined
}

object PreviewSettings {
  @scala.inline
  def apply(
    audio: Anon_Height = null,
    flash: Anon_Height = null,
    html: Anon_Height = null,
    image: Anon_Height = null,
    `object`: Anon_Height = null,
    other: Anon_Height = null,
    text: Anon_Height = null,
    video: Anon_Height = null
  ): PreviewSettings = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (flash != null) __obj.updateDynamic("flash")(flash.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewSettings]
  }
}

