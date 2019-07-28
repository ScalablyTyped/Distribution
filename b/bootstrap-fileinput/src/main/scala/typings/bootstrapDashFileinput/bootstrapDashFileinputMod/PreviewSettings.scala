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

