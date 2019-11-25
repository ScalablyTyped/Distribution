package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.radio
  - typings.deezerDashSdk.deezerDashSdkStrings.artist
  - typings.deezerDashSdk.deezerDashSdkStrings.user
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  def artist: typings.deezerDashSdk.deezerDashSdkStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def radio: typings.deezerDashSdk.deezerDashSdkStrings.radio = this.cast("radio")
  @scala.inline
  def user: typings.deezerDashSdk.deezerDashSdkStrings.user = this.cast("user")
}

