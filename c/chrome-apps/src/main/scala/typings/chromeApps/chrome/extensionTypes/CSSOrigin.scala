package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chromeAppsStrings.user_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 66.
  * @description The origin of injected CSS.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.author
  - typings.chromeApps.chromeAppsStrings.user_
*/
trait CSSOrigin extends js.Object

object CSSOrigin {
  @scala.inline
  def author: typings.chromeApps.chromeAppsStrings.author = this.cast("author")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def user: user_ = this.cast("user")
}

