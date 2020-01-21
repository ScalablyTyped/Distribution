package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.managed
  - typings.chromeApps.chromeAppsStrings.unmanaged
*/
trait ManagedObject extends js.Object

object ManagedObject {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managed: typings.chromeApps.chromeAppsStrings.managed = this.cast("managed")
  @scala.inline
  def unmanaged: typings.chromeApps.chromeAppsStrings.unmanaged = this.cast("unmanaged")
}

