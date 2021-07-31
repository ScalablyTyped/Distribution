package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmServerAddress extends StObject {
  
  /**
    * The ID of the VM.
    */
  var vmId: js.UndefOr[VmId] = js.undefined
  
  /**
    * The ID of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
}
object VmServerAddress {
  
  @scala.inline
  def apply(): VmServerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmServerAddress]
  }
  
  @scala.inline
  implicit class VmServerAddressMutableBuilder[Self <: VmServerAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVmId(value: VmId): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
    
    @scala.inline
    def setVmManagerId(value: VmManagerId): Self = StObject.set(x, "vmManagerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmManagerIdUndefined: Self = StObject.set(x, "vmManagerId", js.undefined)
  }
}
