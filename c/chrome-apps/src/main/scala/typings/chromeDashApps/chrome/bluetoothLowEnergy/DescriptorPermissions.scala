package typings.chromeDashApps.chrome.bluetoothLowEnergy

import typings.chromeDashApps.chromeDashAppsStrings.read_
import typings.chromeDashApps.chromeDashAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.read_
  - typings.chromeDashApps.chromeDashAppsStrings.write_
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedRead
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedWrite
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedRead
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedWrite
*/
trait DescriptorPermissions extends js.Object

object DescriptorPermissions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptedAuthenticatedRead: typings.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedRead = this.cast("encryptedAuthenticatedRead")
  @scala.inline
  def encryptedAuthenticatedWrite: typings.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedWrite = this.cast("encryptedAuthenticatedWrite")
  @scala.inline
  def encryptedRead: typings.chromeDashApps.chromeDashAppsStrings.encryptedRead = this.cast("encryptedRead")
  @scala.inline
  def encryptedWrite: typings.chromeDashApps.chromeDashAppsStrings.encryptedWrite = this.cast("encryptedWrite")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def write: write_ = this.cast("write")
}

