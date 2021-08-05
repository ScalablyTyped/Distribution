package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageRuleType extends StObject {
  
  /**
    * The amount of storage allocated, in bytes.
    */
  var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined
  
  /**
    * The type of storage.
    */
  var StorageType: js.UndefOr[typings.awsSdk.workdocsMod.StorageType] = js.undefined
}
object StorageRuleType {
  
  inline def apply(): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageRuleType]
  }
  
  extension [Self <: StorageRuleType](x: Self) {
    
    inline def setStorageAllocatedInBytes(value: PositiveSizeType): Self = StObject.set(x, "StorageAllocatedInBytes", value.asInstanceOf[js.Any])
    
    inline def setStorageAllocatedInBytesUndefined: Self = StObject.set(x, "StorageAllocatedInBytes", js.undefined)
    
    inline def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
