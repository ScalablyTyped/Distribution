package typings.bootstrapFileinput.mod

import typings.bootstrapFileinput.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewSettings extends js.Object {
  var audio: js.UndefOr[AnonHeight] = js.undefined
  var flash: js.UndefOr[AnonHeight] = js.undefined
  var html: js.UndefOr[AnonHeight] = js.undefined
  var image: js.UndefOr[AnonHeight] = js.undefined
  var `object`: js.UndefOr[AnonHeight] = js.undefined
  var other: js.UndefOr[AnonHeight] = js.undefined
  var text: js.UndefOr[AnonHeight] = js.undefined
  var video: js.UndefOr[AnonHeight] = js.undefined
}

object PreviewSettings {
  @scala.inline
  def apply(
    audio: AnonHeight = null,
    flash: AnonHeight = null,
    html: AnonHeight = null,
    image: AnonHeight = null,
    `object`: AnonHeight = null,
    other: AnonHeight = null,
    text: AnonHeight = null,
    video: AnonHeight = null
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

