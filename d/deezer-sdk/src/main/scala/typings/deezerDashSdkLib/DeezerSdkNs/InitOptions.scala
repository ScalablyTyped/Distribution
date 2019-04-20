package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}
  */
trait InitOptions extends js.Object {
  val appId: java.lang.String
  val channelUrl: java.lang.String
  val player: js.UndefOr[PlayerOptions] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(appId: java.lang.String, channelUrl: java.lang.String, player: PlayerOptions = null): InitOptions = {
    val __obj = js.Dynamic.literal(appId = appId, channelUrl = channelUrl)
    if (player != null) __obj.updateDynamic("player")(player)
    __obj.asInstanceOf[InitOptions]
  }
}

