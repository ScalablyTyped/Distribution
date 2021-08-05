package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordPatch extends StObject {
  
  /**
    * The last modified date of the client device.
    */
  var DeviceLastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The key associated with the record patch.
    */
  var Key: RecordKey
  
  /**
    * An operation, either replace or remove.
    */
  var Op: Operation
  
  /**
    * Last known server sync count for this record. Set to 0 if unknown.
    */
  var SyncCount: Long
  
  /**
    * The value associated with the record patch.
    */
  var Value: js.UndefOr[RecordValue] = js.undefined
}
object RecordPatch {
  
  inline def apply(Key: RecordKey, Op: Operation, SyncCount: Long): RecordPatch = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Op = Op.asInstanceOf[js.Any], SyncCount = SyncCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordPatch]
  }
  
  extension [Self <: RecordPatch](x: Self) {
    
    inline def setDeviceLastModifiedDate(value: Date): Self = StObject.set(x, "DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setDeviceLastModifiedDateUndefined: Self = StObject.set(x, "DeviceLastModifiedDate", js.undefined)
    
    inline def setKey(value: RecordKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOp(value: Operation): Self = StObject.set(x, "Op", value.asInstanceOf[js.Any])
    
    inline def setSyncCount(value: Long): Self = StObject.set(x, "SyncCount", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RecordValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
