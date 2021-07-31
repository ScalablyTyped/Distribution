package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInterfaceResult extends StObject {
  
  /**
    * Information about the network interface.
    */
  var NetworkInterface: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterface] = js.undefined
}
object CreateNetworkInterfaceResult {
  
  @scala.inline
  def apply(): CreateNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfaceResult]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfaceResultMutableBuilder[Self <: CreateNetworkInterfaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkInterface(value: NetworkInterface): Self = StObject.set(x, "NetworkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceUndefined: Self = StObject.set(x, "NetworkInterface", js.undefined)
  }
}
