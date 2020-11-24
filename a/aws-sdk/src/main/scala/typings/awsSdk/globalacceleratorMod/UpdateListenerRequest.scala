package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateListenerRequest extends js.Object {
  
  /**
    * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications, regardless of the port and protocol of the client request. Client affinity gives you control over whether to always route each client to the same specific endpoint. AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection. If client affinity is NONE, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address, destination port, and protocol—to select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.  If you want a given client to always be routed to the same endpoint, set client affinity to SOURCE_IP instead. When you use the SOURCE_IP setting, Global Accelerator uses the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value. The default value is NONE.
    */
  var ClientAffinity: js.UndefOr[typings.awsSdk.globalacceleratorMod.ClientAffinity] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener to update.
    */
  var ListenerArn: GenericString = js.native
  
  /**
    * The updated list of port ranges for the connections from clients to the accelerator.
    */
  var PortRanges: js.UndefOr[typings.awsSdk.globalacceleratorMod.PortRanges] = js.native
  
  /**
    * The updated protocol for the connections from clients to the accelerator.
    */
  var Protocol: js.UndefOr[typings.awsSdk.globalacceleratorMod.Protocol] = js.native
}
object UpdateListenerRequest {
  
  @scala.inline
  def apply(ListenerArn: GenericString): UpdateListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListenerRequest]
  }
  
  @scala.inline
  implicit class UpdateListenerRequestOps[Self <: UpdateListenerRequest] (val x: Self) extends AnyVal {
    
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
    def setListenerArn(value: GenericString): Self = this.set("ListenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAffinity(value: ClientAffinity): Self = this.set("ClientAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAffinity: Self = this.set("ClientAffinity", js.undefined)
    
    @scala.inline
    def setPortRangesVarargs(value: PortRange*): Self = this.set("PortRanges", js.Array(value :_*))
    
    @scala.inline
    def setPortRanges(value: PortRanges): Self = this.set("PortRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortRanges: Self = this.set("PortRanges", js.undefined)
    
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("Protocol", js.undefined)
  }
}
