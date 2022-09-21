package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStorageVirtualMachineResponse extends StObject {
  
  /**
    * Describes the lifecycle state of the SVM being deleted.
    */
  var Lifecycle: js.UndefOr[StorageVirtualMachineLifecycle] = js.undefined
  
  /**
    * The ID of the SVM Amazon FSx is deleting.
    */
  var StorageVirtualMachineId: js.UndefOr[typings.awsSdk.fsxMod.StorageVirtualMachineId] = js.undefined
}
object DeleteStorageVirtualMachineResponse {
  
  inline def apply(): DeleteStorageVirtualMachineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteStorageVirtualMachineResponse]
  }
  
  extension [Self <: DeleteStorageVirtualMachineResponse](x: Self) {
    
    inline def setLifecycle(value: StorageVirtualMachineLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setStorageVirtualMachineId(value: StorageVirtualMachineId): Self = StObject.set(x, "StorageVirtualMachineId", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineIdUndefined: Self = StObject.set(x, "StorageVirtualMachineId", js.undefined)
  }
}
