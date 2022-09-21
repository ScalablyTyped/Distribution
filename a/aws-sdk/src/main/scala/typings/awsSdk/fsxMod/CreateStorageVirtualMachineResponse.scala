package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageVirtualMachineResponse extends StObject {
  
  /**
    * Returned after a successful CreateStorageVirtualMachine operation; describes the SVM just created.
    */
  var StorageVirtualMachine: js.UndefOr[typings.awsSdk.fsxMod.StorageVirtualMachine] = js.undefined
}
object CreateStorageVirtualMachineResponse {
  
  inline def apply(): CreateStorageVirtualMachineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageVirtualMachineResponse]
  }
  
  extension [Self <: CreateStorageVirtualMachineResponse](x: Self) {
    
    inline def setStorageVirtualMachine(value: StorageVirtualMachine): Self = StObject.set(x, "StorageVirtualMachine", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineUndefined: Self = StObject.set(x, "StorageVirtualMachine", js.undefined)
  }
}
