package typings.chromeDashApps.chrome.extensionTypes

import typings.chromeDashApps.chromeDashAppsStrings.user_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since Chrome 66.
  * @description The origin of injected CSS.
  **/
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.author
  - typings.chromeDashApps.chromeDashAppsStrings.user_
*/
trait CSSOrigin extends js.Object

object CSSOrigin {
  @scala.inline
  def author: typings.chromeDashApps.chromeDashAppsStrings.author = this.cast("author")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def user: user_ = this.cast("user")
}

