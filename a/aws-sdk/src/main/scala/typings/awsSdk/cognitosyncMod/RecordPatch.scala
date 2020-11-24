package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordPatch extends js.Object {
  
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * The key associated with the record patch.
    */
  var Key: RecordKey = js.native
  
  /**
    * An operation, either replace or remove.
    */
  var Op: Operation = js.native
  
  /**
    * Last known server sync count for this record. Set to 0 if unknown.
    */
  var SyncCount: Long = js.native
  
  /**
    * The value associated with the record patch.
    */
  var Value: js.UndefOr[RecordValue] = js.native
}
object RecordPatch {
  
  @scala.inline
  def apply(Key: RecordKey, Op: Operation, SyncCount: Long): RecordPatch = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Op = Op.asInstanceOf[js.Any], SyncCount = SyncCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordPatch]
  }
  
  @scala.inline
  implicit class RecordPatchOps[Self <: RecordPatch] (val x: Self) extends AnyVal {
    
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
    def setKey(value: RecordKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: Operation): Self = this.set("Op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncCount(value: Long): Self = this.set("SyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLastModifiedDate(value: Date): Self = this.set("DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceLastModifiedDate: Self = this.set("DeviceLastModifiedDate", js.undefined)
    
    @scala.inline
    def setValue(value: RecordValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
