package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordPatch extends StObject {
  
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
  implicit class RecordPatchMutableBuilder[Self <: RecordPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceLastModifiedDate(value: Date): Self = StObject.set(x, "DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLastModifiedDateUndefined: Self = StObject.set(x, "DeviceLastModifiedDate", js.undefined)
    
    @scala.inline
    def setKey(value: RecordKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: Operation): Self = StObject.set(x, "Op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncCount(value: Long): Self = StObject.set(x, "SyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RecordValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
