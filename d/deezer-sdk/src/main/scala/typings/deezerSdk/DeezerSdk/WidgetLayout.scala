package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerSdk.deezerSdkStrings.light
  - typings.deezerSdk.deezerSdkStrings.dark
*/
trait WidgetLayout extends js.Object

object WidgetLayout {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.deezerSdk.deezerSdkStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.deezerSdk.deezerSdkStrings.light = this.cast("light")
}

