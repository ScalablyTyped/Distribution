package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBGPPeerResponse extends StObject {
  
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}
object DeleteBGPPeerResponse {
  
  @scala.inline
  def apply(): DeleteBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBGPPeerResponse]
  }
  
  @scala.inline
  implicit class DeleteBGPPeerResponseMutableBuilder[Self <: DeleteBGPPeerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualInterface(value: VirtualInterface): Self = StObject.set(x, "virtualInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualInterfaceUndefined: Self = StObject.set(x, "virtualInterface", js.undefined)
  }
}
