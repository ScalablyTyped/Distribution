package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  /**
    * The application's name.
    */
  var AppName: ResourceName = js.native
  
  /**
    * The application's port number, for example 80.
    */
  var Port: IPPortNumber = js.native
  
  /**
    * The IP protocol name or number. The name can be one of tcp, udp, or icmp. For information on possible numbers, see Protocol Numbers.
    */
  var Protocol: typings.awsSdk.fmsMod.Protocol = js.native
}
object App {
  
  @scala.inline
  def apply(AppName: ResourceName, Port: IPPortNumber, Protocol: Protocol): App = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: ResourceName): Self = this.set("AppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: IPPortNumber): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("Protocol", value.asInstanceOf[js.Any])
  }
}
