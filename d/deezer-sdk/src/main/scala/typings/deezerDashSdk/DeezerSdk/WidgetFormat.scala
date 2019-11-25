package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.square
  - typings.deezerDashSdk.deezerDashSdkStrings.classic
*/
trait WidgetFormat extends js.Object

object WidgetFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def classic: typings.deezerDashSdk.deezerDashSdkStrings.classic = this.cast("classic")
  @scala.inline
  def square: typings.deezerDashSdk.deezerDashSdkStrings.square = this.cast("square")
}

