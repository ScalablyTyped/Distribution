package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateTransitVirtualInterfaceResult extends StObject {
  
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}
object AllocateTransitVirtualInterfaceResult {
  
  inline def apply(): AllocateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceResult]
  }
  
  extension [Self <: AllocateTransitVirtualInterfaceResult](x: Self) {
    
    inline def setVirtualInterface(value: VirtualInterface): Self = StObject.set(x, "virtualInterface", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceUndefined: Self = StObject.set(x, "virtualInterface", js.undefined)
  }
}
