package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkInterfaceResult extends js.Object {
  
  /**
    * Information about the network interface.
    */
  var NetworkInterface: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterface] = js.native
}
object CreateNetworkInterfaceResult {
  
  @scala.inline
  def apply(): CreateNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfaceResult]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfaceResultOps[Self <: CreateNetworkInterfaceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetworkInterface(value: NetworkInterface): Self = this.set("NetworkInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterface: Self = this.set("NetworkInterface", js.undefined)
  }
}
