package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThingRuntimeConfigurationResponse extends js.Object {
  
  /**
    * Runtime configuration for a thing.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.greengrassMod.RuntimeConfiguration] = js.native
}
object GetThingRuntimeConfigurationResponse {
  
  @scala.inline
  def apply(): GetThingRuntimeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThingRuntimeConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetThingRuntimeConfigurationResponseOps[Self <: GetThingRuntimeConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setRuntimeConfiguration(value: RuntimeConfiguration): Self = this.set("RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfiguration: Self = this.set("RuntimeConfiguration", js.undefined)
  }
}
