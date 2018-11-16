package typings
package chromeDashAppsLib.chromeNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalStorageArea extends StorageArea {
  /**
               * The maximum amount (in bytes) of data that can be stored in local storage,
               * as measured by the JSON stringification of every value plus every key's length.
               * This value will be ignored if the extension has the unlimitedStorage permission.
               * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
               * @see Permissions: 'unlimitedStorage'
               * @default 5242880
               */
  val QUOTA_BYTES: chromeDashAppsLib.chromeDashAppsLibNumbers.`5242880` = js.native
}

