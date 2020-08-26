package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/init | DZ.init}\
  * {@link https://developers.deezer.com/sdk/javascript/player | Initialize a player}
  */
@js.native
trait InitOptions extends js.Object {
  val appId: String = js.native
  val channelUrl: String = js.native
  val player: js.UndefOr[PlayerOptions] = js.native
}

object InitOptions {
  @scala.inline
  def apply(appId: String, channelUrl: String): InitOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelUrl(value: String): Self = this.set("channelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayer(value: PlayerOptions): Self = this.set("player", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
  }
  
}

