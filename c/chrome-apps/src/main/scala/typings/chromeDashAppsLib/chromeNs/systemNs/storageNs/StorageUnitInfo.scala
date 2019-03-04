package typings
package chromeDashAppsLib.chromeNs.systemNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageUnitInfo extends js.Object {
  /** The total amount of the storage space, in bytes. */
  var capacity: chromeDashAppsLib.chromeNs.integer
  /**
    * The transient ID that uniquely identifies the storage device.
    * This ID will be persistent within the same run of a single application.
    * It will not be a persistent identifier between different runs of an application, or between different applications.
    */
  var id: java.lang.String
  /** The name of the storage unit. */
  var name: java.lang.String
  /**
    * The media type of the storage unit.
    * fixed: The storage has fixed media, e.g. hard disk or SSD.
    * removable: The storage is removable, e.g. USB flash drive.
    * unknown: The storage type is unknown.
    * @see enum StorageUnitType
    */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_FIXED, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_FIXED[keyof chrome-apps.Anon_FIXED] */ js.Any
    ]
  ]
}

object StorageUnitInfo {
  @scala.inline
  def apply(
    capacity: chromeDashAppsLib.chromeNs.integer,
    id: java.lang.String,
    name: java.lang.String,
    `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_FIXED, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_FIXED[keyof chrome-apps.Anon_FIXED] */ js.Any
      ]
    ]
  ): StorageUnitInfo = {
    val __obj = js.Dynamic.literal(capacity = capacity, id = id, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageUnitInfo]
  }
}

