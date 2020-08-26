package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[Date] = js.native
  /**
    * The key for the record.
    */
  var Key: js.UndefOr[RecordKey] = js.native
  /**
    * The user/device that made the last change to this record.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * The date on which the record was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  /**
    * The server sync count for this record.
    */
  var SyncCount: js.UndefOr[Long] = js.native
  /**
    * The value for the record.
    */
  var Value: js.UndefOr[RecordValue] = js.native
}

object Record {
  @scala.inline
  def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceLastModifiedDate(value: Date): Self = this.set("DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceLastModifiedDate: Self = this.set("DeviceLastModifiedDate", js.undefined)
    @scala.inline
    def setKey(value: RecordKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setSyncCount(value: Long): Self = this.set("SyncCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncCount: Self = this.set("SyncCount", js.undefined)
    @scala.inline
    def setValue(value: RecordValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

