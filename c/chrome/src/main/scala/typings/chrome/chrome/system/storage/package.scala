package typings.chrome.chrome.system

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  type SystemStorageAttachedEvent = typings.chrome.chrome.events.Event[
    js.Function1[/* info */ typings.chrome.chrome.system.storage.StorageUnitInfo, scala.Unit]
  ]
  type SystemStorageDetachedEvent = typings.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
