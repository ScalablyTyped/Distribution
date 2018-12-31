package typings
package chromeDashAppsLib.chromeNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncStorageArea extends StorageArea {
  /**
    * The maximum number of items that can be stored in sync storage.
    * Updates that would cause this limit to be exceeded will fail immediately
    * and set runtime.lastError.
    */
  val MAX_ITEMS: chromeDashAppsLib.chromeDashAppsLibNumbers.`512` = js.native
  /**
    * @deprecated since Chrome 40.
    * The storage.sync API no longer has a sustained write operation quota.
    */
  val MAX_SUSTAINED_WRITE_OPERATIONS_PER_MINUTE: chromeDashAppsLib.chromeNs.deprecated = js.native
  /**
    * The maximum number of set, remove, or clear operations that can be performed each hour.
    * This is 1 every 2 seconds, a lower ceiling than the short term higher writes-per-minute limit.
    * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
    */
  val MAX_WRITE_OPERATIONS_PER_HOUR: chromeDashAppsLib.chromeDashAppsLibNumbers.`1800` = js.native
  /**
    * The maximum number of set, remove, or clear operations that can be performed each minute.
    * This is 2 per second, providing higher throughput than writes-per-hour over a shorter period of time.
    * Updates that would cause this limit to be exceeded fail immediately and set runtime.lastError.
    * @since Chrome 40.
    */
  val MAX_WRITE_OPERATIONS_PER_MINUTE: chromeDashAppsLib.chromeDashAppsLibNumbers.`120` = js.native
  /** The maximum total amount (in bytes) of data that can be stored in
    * sync storage, as measured by the JSON stringification of every value
    * plus every key's length. Updates that would cause this limit to be
    * exceeded fail immediately and set runtime.lastError.
    */
  val QUOTA_BYTES: chromeDashAppsLib.chromeDashAppsLibNumbers.`102400` = js.native
  /**
    * The maximum size (in bytes) of each individual item in sync storage,
    * as measured by the JSON stringification of its value plus its key length.
    * Updates containing items larger than this limit will fail immediately and
    * set runtime.lastError.
    */
  val QUOTA_BYTES_PER_ITEM: chromeDashAppsLib.chromeDashAppsLibNumbers.`8192` = js.native
}

