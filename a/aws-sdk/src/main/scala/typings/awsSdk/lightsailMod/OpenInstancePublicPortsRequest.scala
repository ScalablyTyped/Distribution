package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenInstancePublicPortsRequest extends js.Object {
  
  /**
    * The name of the instance for which to open ports.
    */
  var instanceName: ResourceName = js.native
  
  /**
    * An object to describe the ports to open for the specified instance.
    */
  var portInfo: PortInfo = js.native
}
object OpenInstancePublicPortsRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): OpenInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenInstancePublicPortsRequest]
  }
  
  @scala.inline
  implicit class OpenInstancePublicPortsRequestOps[Self <: OpenInstancePublicPortsRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortInfo(value: PortInfo): Self = this.set("portInfo", value.asInstanceOf[js.Any])
  }
}
