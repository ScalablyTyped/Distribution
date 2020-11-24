package typings.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationConfig extends js.Object {
  
  /**
    * A list of service names that identity the target application. The AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the destination application.
    */
  var services: ServiceList = js.native
  
  /**
    * The name of the IoT thing to which you want to connect.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object DestinationConfig {
  
  @scala.inline
  def apply(services: ServiceList): DestinationConfig = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationConfig]
  }
  
  @scala.inline
  implicit class DestinationConfigOps[Self <: DestinationConfig] (val x: Self) extends AnyVal {
    
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
    def setServicesVarargs(value: Service*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: ServiceList): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
}
