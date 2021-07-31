package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortOverride extends StObject {
  
  /**
    * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
    */
  var EndpointPort: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
    */
  var ListenerPort: js.UndefOr[PortNumber] = js.undefined
}
object PortOverride {
  
  @scala.inline
  def apply(): PortOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortOverride]
  }
  
  @scala.inline
  implicit class PortOverrideMutableBuilder[Self <: PortOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointPort(value: PortNumber): Self = StObject.set(x, "EndpointPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPortUndefined: Self = StObject.set(x, "EndpointPort", js.undefined)
    
    @scala.inline
    def setListenerPort(value: PortNumber): Self = StObject.set(x, "ListenerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerPortUndefined: Self = StObject.set(x, "ListenerPort", js.undefined)
  }
}
