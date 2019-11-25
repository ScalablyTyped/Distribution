package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}
  */
trait InitOptions extends js.Object {
  val appId: String
  val channelUrl: String
  val player: js.UndefOr[PlayerOptions] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(appId: String, channelUrl: String, player: PlayerOptions = null): InitOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

