package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// For chrome managed storage
/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.integer
  - typings.chromeDashApps.chromeDashAppsStrings.string
  - typings.chromeDashApps.chromeDashAppsStrings.number
*/
trait JSONBasicTypes extends js.Object

object JSONBasicTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.chromeDashApps.chromeDashAppsStrings.integer = this.cast("integer")
  @scala.inline
  def number: typings.chromeDashApps.chromeDashAppsStrings.number = this.cast("number")
  @scala.inline
  def string: typings.chromeDashApps.chromeDashAppsStrings.string = this.cast("string")
}

