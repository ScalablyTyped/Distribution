package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageType extends StObject {
  
  var StorageSubTypeName: js.UndefOr[typings.awsSdk.esMod.StorageSubTypeName] = js.undefined
  
  /**
    * List of limits that are applicable for given storage type. 
    */
  var StorageTypeLimits: js.UndefOr[StorageTypeLimitList] = js.undefined
  
  var StorageTypeName: js.UndefOr[typings.awsSdk.esMod.StorageTypeName] = js.undefined
}
object StorageType {
  
  inline def apply(): StorageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageType]
  }
  
  extension [Self <: StorageType](x: Self) {
    
    inline def setStorageSubTypeName(value: StorageSubTypeName): Self = StObject.set(x, "StorageSubTypeName", value.asInstanceOf[js.Any])
    
    inline def setStorageSubTypeNameUndefined: Self = StObject.set(x, "StorageSubTypeName", js.undefined)
    
    inline def setStorageTypeLimits(value: StorageTypeLimitList): Self = StObject.set(x, "StorageTypeLimits", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeLimitsUndefined: Self = StObject.set(x, "StorageTypeLimits", js.undefined)
    
    inline def setStorageTypeLimitsVarargs(value: StorageTypeLimit*): Self = StObject.set(x, "StorageTypeLimits", js.Array(value*))
    
    inline def setStorageTypeName(value: StorageTypeName): Self = StObject.set(x, "StorageTypeName", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeNameUndefined: Self = StObject.set(x, "StorageTypeName", js.undefined)
  }
}
