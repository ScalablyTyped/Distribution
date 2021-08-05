package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmServer extends StObject {
  
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
  
  /**
    * The type of VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
  
  /**
    * The name of the VM.
    */
  var vmName: js.UndefOr[VmName] = js.undefined
  
  /**
    * The VM folder path in the vCenter Server virtual machine inventory tree.
    */
  var vmPath: js.UndefOr[VmPath] = js.undefined
  
  /**
    * The VM server location.
    */
  var vmServerAddress: js.UndefOr[VmServerAddress] = js.undefined
}
object VmServer {
  
  inline def apply(): VmServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServer]
  }
  
  extension [Self <: VmServer](x: Self) {
    
    inline def setVmManagerName(value: VmManagerName): Self = StObject.set(x, "vmManagerName", value.asInstanceOf[js.Any])
    
    inline def setVmManagerNameUndefined: Self = StObject.set(x, "vmManagerName", js.undefined)
    
    inline def setVmManagerType(value: VmManagerType): Self = StObject.set(x, "vmManagerType", value.asInstanceOf[js.Any])
    
    inline def setVmManagerTypeUndefined: Self = StObject.set(x, "vmManagerType", js.undefined)
    
    inline def setVmName(value: VmName): Self = StObject.set(x, "vmName", value.asInstanceOf[js.Any])
    
    inline def setVmNameUndefined: Self = StObject.set(x, "vmName", js.undefined)
    
    inline def setVmPath(value: VmPath): Self = StObject.set(x, "vmPath", value.asInstanceOf[js.Any])
    
    inline def setVmPathUndefined: Self = StObject.set(x, "vmPath", js.undefined)
    
    inline def setVmServerAddress(value: VmServerAddress): Self = StObject.set(x, "vmServerAddress", value.asInstanceOf[js.Any])
    
    inline def setVmServerAddressUndefined: Self = StObject.set(x, "vmServerAddress", js.undefined)
  }
}
