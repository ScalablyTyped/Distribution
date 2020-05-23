package typings.braftEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Embed extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var embed: js.UndefOr[Boolean] = js.undefined
  var image: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
}

object Embed {
  @scala.inline
  def apply(
    audio: js.UndefOr[Boolean] = js.undefined,
    embed: js.UndefOr[Boolean] = js.undefined,
    image: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined
  ): Embed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(embed)) __obj.updateDynamic("embed")(embed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Embed]
  }
}

