package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerSdk.deezerSdkStrings.small
  - typings.deezerSdk.deezerSdkStrings.medium
  - typings.deezerSdk.deezerSdkStrings.big
*/
trait WidgetSize extends js.Object

object WidgetSize {
  @scala.inline
  def big: typings.deezerSdk.deezerSdkStrings.big = this.cast("big")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def medium: typings.deezerSdk.deezerSdkStrings.medium = this.cast("medium")
  @scala.inline
  def small: typings.deezerSdk.deezerSdkStrings.small = this.cast("small")
}

