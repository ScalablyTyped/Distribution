package typings.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// For chrome managed storage
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.integer
  - typings.chromeApps.chromeAppsStrings.string
  - typings.chromeApps.chromeAppsStrings.number
*/
trait JSONBasicTypes extends js.Object

object JSONBasicTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.chromeApps.chromeAppsStrings.integer = this.cast("integer")
  @scala.inline
  def number: typings.chromeApps.chromeAppsStrings.number = this.cast("number")
  @scala.inline
  def string: typings.chromeApps.chromeAppsStrings.string = this.cast("string")
}

