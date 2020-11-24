package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerInstance extends js.Object {
  
  /**
    * The URL of the broker's Web Console.
    */
  var ConsoleURL: js.UndefOr[string] = js.native
  
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[listOfString] = js.native
  
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker. Does not apply to RabbitMQ brokers
    */
  var IpAddress: js.UndefOr[string] = js.native
}
object BrokerInstance {
  
  @scala.inline
  def apply(): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstance]
  }
  
  @scala.inline
  implicit class BrokerInstanceOps[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    
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
    def setConsoleURL(value: string): Self = this.set("ConsoleURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleURL: Self = this.set("ConsoleURL", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: string*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: listOfString): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setIpAddress(value: string): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
  }
}
