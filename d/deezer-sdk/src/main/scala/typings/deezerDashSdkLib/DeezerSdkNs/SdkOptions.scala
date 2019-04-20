package typings
package deezerDashSdkLib.DeezerSdkNs

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
  val token: deezerDashSdkLib.Anon_Accesstoken
}

object SdkOptions {
  @scala.inline
  def apply(player: PlayerState, token: deezerDashSdkLib.Anon_Accesstoken): SdkOptions = {
    val __obj = js.Dynamic.literal(player = player, token = token)
  
    __obj.asInstanceOf[SdkOptions]
  }
}

