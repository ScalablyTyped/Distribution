package typings.chrome.chrome.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.unspecified
  - typings.chrome.chromeStrings.no_restriction
  - typings.chrome.chromeStrings.lax
  - typings.chrome.chromeStrings.strict
*/
trait SameSiteStatus extends js.Object

object SameSiteStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lax: typings.chrome.chromeStrings.lax = this.cast("lax")
  @scala.inline
  def no_restriction: typings.chrome.chromeStrings.no_restriction = this.cast("no_restriction")
  @scala.inline
  def strict: typings.chrome.chromeStrings.strict = this.cast("strict")
  @scala.inline
  def unspecified: typings.chrome.chromeStrings.unspecified = this.cast("unspecified")
}

