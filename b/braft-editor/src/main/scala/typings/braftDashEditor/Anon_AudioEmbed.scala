package typings.braftDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioEmbed extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var embed: js.UndefOr[Boolean] = js.undefined
  var image: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
}

object Anon_AudioEmbed {
  @scala.inline
  def apply(
    audio: js.UndefOr[Boolean] = js.undefined,
    embed: js.UndefOr[Boolean] = js.undefined,
    image: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined
  ): Anon_AudioEmbed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (!js.isUndefined(embed)) __obj.updateDynamic("embed")(embed)
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[Anon_AudioEmbed]
  }
}

