package typings.chromeDashApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.managed
  - typings.chromeDashApps.chromeDashAppsStrings.unmanaged
*/
trait ManagedObject extends js.Object

object ManagedObject {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managed: typings.chromeDashApps.chromeDashAppsStrings.managed = this.cast("managed")
  @scala.inline
  def unmanaged: typings.chromeDashApps.chromeDashAppsStrings.unmanaged = this.cast("unmanaged")
}

