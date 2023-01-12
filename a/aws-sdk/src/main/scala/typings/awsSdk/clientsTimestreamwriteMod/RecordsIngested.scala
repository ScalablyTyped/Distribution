package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordsIngested extends StObject {
  
  /**
    * Count of records ingested into the magnetic store.
    */
  var MagneticStore: js.UndefOr[Integer] = js.undefined
  
  /**
    * Count of records ingested into the memory store.
    */
  var MemoryStore: js.UndefOr[Integer] = js.undefined
  
  /**
    * Total count of successfully ingested records.
    */
  var Total: js.UndefOr[Integer] = js.undefined
}
object RecordsIngested {
  
  inline def apply(): RecordsIngested = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordsIngested]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordsIngested] (val x: Self) extends AnyVal {
    
    inline def setMagneticStore(value: Integer): Self = StObject.set(x, "MagneticStore", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreUndefined: Self = StObject.set(x, "MagneticStore", js.undefined)
    
    inline def setMemoryStore(value: Integer): Self = StObject.set(x, "MemoryStore", value.asInstanceOf[js.Any])
    
    inline def setMemoryStoreUndefined: Self = StObject.set(x, "MemoryStore", js.undefined)
    
    inline def setTotal(value: Integer): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
