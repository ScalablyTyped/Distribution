package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends StObject {
  
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
  implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceLastModifiedDate(value: Date): Self = StObject.set(x, "DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceLastModifiedDateUndefined: Self = StObject.set(x, "DeviceLastModifiedDate", js.undefined)
    
    @scala.inline
    def setKey(value: RecordKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setSyncCount(value: Long): Self = StObject.set(x, "SyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncCountUndefined: Self = StObject.set(x, "SyncCount", js.undefined)
    
    @scala.inline
    def setValue(value: RecordValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
