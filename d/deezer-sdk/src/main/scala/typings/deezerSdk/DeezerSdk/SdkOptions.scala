package typings.deezerSdk.DeezerSdk

import typings.deezerSdk.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready}
  */
trait SdkOptions extends js.Object {
  /**
    * In addition to the PlayerState properties,
    * {@link https://developers.deezer.com/sdk/javascript/ready | DZ.ready} also documents the
    * property current_track, but the author of this comment was not able no retrieve it.
    */
  val player: PlayerState
  val token: AnonAccesstoken
}

object SdkOptions {
  @scala.inline
  def apply(player: PlayerState, token: AnonAccesstoken): SdkOptions = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SdkOptions]
  }
}

