package typings.braftEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioEmbed extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var embed: js.UndefOr[Boolean] = js.undefined
  var image: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
}

object AnonAudioEmbed {
  @scala.inline
  def apply(
    audio: js.UndefOr[Boolean] = js.undefined,
    embed: js.UndefOr[Boolean] = js.undefined,
    image: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined
  ): AnonAudioEmbed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(embed)) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudioEmbed]
  }
}

