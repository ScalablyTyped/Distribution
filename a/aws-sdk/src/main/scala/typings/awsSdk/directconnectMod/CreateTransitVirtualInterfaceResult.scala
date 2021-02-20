package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTransitVirtualInterfaceResult extends StObject {
  
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}
object CreateTransitVirtualInterfaceResult {
  
  @scala.inline
  def apply(): CreateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitVirtualInterfaceResult]
  }
  
  @scala.inline
  implicit class CreateTransitVirtualInterfaceResultMutableBuilder[Self <: CreateTransitVirtualInterfaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterface(value: VirtualInterface): Self = StObject.set(x, "virtualInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceUndefined: Self = StObject.set(x, "virtualInterface", js.undefined)
  }
}
