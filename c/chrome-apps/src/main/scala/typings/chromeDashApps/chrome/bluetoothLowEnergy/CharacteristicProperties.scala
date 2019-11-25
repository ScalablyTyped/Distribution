package typings.chromeDashApps.chrome.bluetoothLowEnergy

import typings.chromeDashApps.chromeDashAppsStrings.read_
import typings.chromeDashApps.chromeDashAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.broadcast
  - typings.chromeDashApps.chromeDashAppsStrings.read_
  - typings.chromeDashApps.chromeDashAppsStrings.writeWithoutResponse
  - typings.chromeDashApps.chromeDashAppsStrings.write_
  - typings.chromeDashApps.chromeDashAppsStrings.notify
  - typings.chromeDashApps.chromeDashAppsStrings.indicate
  - typings.chromeDashApps.chromeDashAppsStrings.authenticatedSignedWrites
  - typings.chromeDashApps.chromeDashAppsStrings.extendedProperties
  - typings.chromeDashApps.chromeDashAppsStrings.reliableWrite
  - typings.chromeDashApps.chromeDashAppsStrings.writableAuxiliaries
  - typings.chromeDashApps.chromeDashAppsStrings.encryptRead
  - typings.chromeDashApps.chromeDashAppsStrings.encryptWrite
  - typings.chromeDashApps.chromeDashAppsStrings.encryptAuthenticatedRead
  - typings.chromeDashApps.chromeDashAppsStrings.encryptAuthenticatedWrite
*/
trait CharacteristicProperties extends js.Object

object CharacteristicProperties {
  @scala.inline
  def authenticatedSignedWrites: typings.chromeDashApps.chromeDashAppsStrings.authenticatedSignedWrites = this.cast("authenticatedSignedWrites")
  @scala.inline
  def broadcast: typings.chromeDashApps.chromeDashAppsStrings.broadcast = this.cast("broadcast")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptAuthenticatedRead: typings.chromeDashApps.chromeDashAppsStrings.encryptAuthenticatedRead = this.cast("encryptAuthenticatedRead")
  @scala.inline
  def encryptAuthenticatedWrite: typings.chromeDashApps.chromeDashAppsStrings.encryptAuthenticatedWrite = this.cast("encryptAuthenticatedWrite")
  @scala.inline
  def encryptRead: typings.chromeDashApps.chromeDashAppsStrings.encryptRead = this.cast("encryptRead")
  @scala.inline
  def encryptWrite: typings.chromeDashApps.chromeDashAppsStrings.encryptWrite = this.cast("encryptWrite")
  @scala.inline
  def extendedProperties: typings.chromeDashApps.chromeDashAppsStrings.extendedProperties = this.cast("extendedProperties")
  @scala.inline
  def indicate: typings.chromeDashApps.chromeDashAppsStrings.indicate = this.cast("indicate")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def reliableWrite: typings.chromeDashApps.chromeDashAppsStrings.reliableWrite = this.cast("reliableWrite")
  @scala.inline
  def writableAuxiliaries: typings.chromeDashApps.chromeDashAppsStrings.writableAuxiliaries = this.cast("writableAuxiliaries")
  @scala.inline
  def write: write_ = this.cast("write")
  @scala.inline
  def writeWithoutResponse: typings.chromeDashApps.chromeDashAppsStrings.writeWithoutResponse = this.cast("writeWithoutResponse")
}

