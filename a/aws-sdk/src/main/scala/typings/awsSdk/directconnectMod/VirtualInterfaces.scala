package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualInterfaces extends StObject {
  
  /**
    * The virtual interfaces
    */
  var virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.undefined
}
object VirtualInterfaces {
  
  @scala.inline
  def apply(): VirtualInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterfaces]
  }
  
  @scala.inline
  implicit class VirtualInterfacesMutableBuilder[Self <: VirtualInterfaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterfaces(value: VirtualInterfaceList): Self = StObject.set(x, "virtualInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfacesUndefined: Self = StObject.set(x, "virtualInterfaces", js.undefined)
    
    @scala.inline
    def setVirtualInterfacesVarargs(value: VirtualInterface*): Self = StObject.set(x, "virtualInterfaces", js.Array(value :_*))
  }
}
