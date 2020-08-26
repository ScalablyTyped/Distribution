package typings.chrome.chrome.system.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageUnitInfo extends js.Object {
  /** The total amount of the storage space, in bytes. */
  var capacity: Double = js.native
  /** The transient ID that uniquely identifies the storage device. This ID will be persistent within the same run of a single application. It will not be a persistent identifier between different runs of an application, or between different applications. */
  var id: String = js.native
  /** The name of the storage unit. */
  var name: String = js.native
  /**
    * The media type of the storage unit.
    * fixed: The storage has fixed media, e.g. hard disk or SSD.
    * removable: The storage is removable, e.g. USB flash drive.
    * unknown: The storage type is unknown.
    */
  var `type`: String = js.native
}

object StorageUnitInfo {
  @scala.inline
  def apply(capacity: Double, id: String, name: String, `type`: String): StorageUnitInfo = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageUnitInfo]
  }
  @scala.inline
  implicit class StorageUnitInfoOps[Self <: StorageUnitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

