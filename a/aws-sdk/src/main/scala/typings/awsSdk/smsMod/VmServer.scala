package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmServer extends StObject {
  
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  
  /**
    * The type of VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
  
  /**
    * The name of the VM.
    */
  var vmName: js.UndefOr[VmName] = js.native
  
  /**
    * The VM folder path in the vCenter Server virtual machine inventory tree.
    */
  var vmPath: js.UndefOr[VmPath] = js.native
  
  /**
    * The VM server location.
    */
  var vmServerAddress: js.UndefOr[VmServerAddress] = js.native
}
object VmServer {
  
  @scala.inline
  def apply(): VmServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServer]
  }
  
  @scala.inline
  implicit class VmServerMutableBuilder[Self <: VmServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVmManagerName(value: VmManagerName): Self = StObject.set(x, "vmManagerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmManagerNameUndefined: Self = StObject.set(x, "vmManagerName", js.undefined)
    
    @scala.inline
    def setVmManagerType(value: VmManagerType): Self = StObject.set(x, "vmManagerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmManagerTypeUndefined: Self = StObject.set(x, "vmManagerType", js.undefined)
    
    @scala.inline
    def setVmName(value: VmName): Self = StObject.set(x, "vmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmNameUndefined: Self = StObject.set(x, "vmName", js.undefined)
    
    @scala.inline
    def setVmPath(value: VmPath): Self = StObject.set(x, "vmPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmPathUndefined: Self = StObject.set(x, "vmPath", js.undefined)
    
    @scala.inline
    def setVmServerAddress(value: VmServerAddress): Self = StObject.set(x, "vmServerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmServerAddressUndefined: Self = StObject.set(x, "vmServerAddress", js.undefined)
  }
}
