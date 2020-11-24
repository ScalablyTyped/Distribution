package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortOverride extends js.Object {
  
  /**
    * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
    */
  var EndpointPort: js.UndefOr[PortNumber] = js.native
  
  /**
    * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
    */
  var ListenerPort: js.UndefOr[PortNumber] = js.native
}
object PortOverride {
  
  @scala.inline
  def apply(): PortOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortOverride]
  }
  
  @scala.inline
  implicit class PortOverrideOps[Self <: PortOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointPort(value: PortNumber): Self = this.set("EndpointPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointPort: Self = this.set("EndpointPort", js.undefined)
    
    @scala.inline
    def setListenerPort(value: PortNumber): Self = this.set("ListenerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerPort: Self = this.set("ListenerPort", js.undefined)
  }
}
