package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThingRuntimeConfigurationRequest extends js.Object {
  
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}
object GetThingRuntimeConfigurationRequest {
  
  @scala.inline
  def apply(ThingName: string): GetThingRuntimeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThingRuntimeConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetThingRuntimeConfigurationRequestOps[Self <: GetThingRuntimeConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setThingName(value: string): Self = this.set("ThingName", value.asInstanceOf[js.Any])
  }
}
