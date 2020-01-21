package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerSdk.deezerSdkStrings.radio
  - typings.deezerSdk.deezerSdkStrings.artist
  - typings.deezerSdk.deezerSdkStrings.user
*/
trait RadioType extends js.Object

object RadioType {
  @scala.inline
  def artist: typings.deezerSdk.deezerSdkStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def radio: typings.deezerSdk.deezerSdkStrings.radio = this.cast("radio")
  @scala.inline
  def user: typings.deezerSdk.deezerSdkStrings.user = this.cast("user")
}

