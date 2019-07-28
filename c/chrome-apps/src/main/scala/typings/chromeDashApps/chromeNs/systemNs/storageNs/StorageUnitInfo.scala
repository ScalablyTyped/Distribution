package typings.chromeDashApps.chromeNs.systemNs.storageNs

import typings.chromeDashApps.Anon_FIXED
import typings.chromeDashApps.chromeDashAppsStrings.fixed
import typings.chromeDashApps.chromeDashAppsStrings.removable
import typings.chromeDashApps.chromeDashAppsStrings.unknown
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.chromeDashApps.chromeNs.integer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageUnitInfo extends js.Object {
  /** The total amount of the storage space, in bytes. */
  var capacity: integer
  /**
    * The transient ID that uniquely identifies the storage device.
    * This ID will be persistent within the same run of a single application.
    * It will not be a persistent identifier between different runs of an application, or between different applications.
    */
  var id: String
  /** The name of the storage unit. */
  var name: String
  /**
    * The media type of the storage unit.
    * fixed: The storage has fixed media, e.g. hard disk or SSD.
    * removable: The storage is removable, e.g. USB flash drive.
    * unknown: The storage type is unknown.
    * @see enum StorageUnitType
    */
  var `type`: ToStringLiteral[Anon_FIXED, String, Exclude[String, fixed | removable | unknown]]
}

object StorageUnitInfo {
  @scala.inline
  def apply(
    capacity: integer,
    id: String,
    name: String,
    `type`: ToStringLiteral[Anon_FIXED, String, Exclude[String, fixed | removable | unknown]]
  ): StorageUnitInfo = {
    val __obj = js.Dynamic.literal(capacity = capacity, id = id, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageUnitInfo]
  }
}

