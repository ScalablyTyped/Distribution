package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppValidationConfigurationResponse extends js.Object {
  
  /**
    * The configuration for application validation.
    */
  var appValidationConfigurations: js.UndefOr[AppValidationConfigurations] = js.native
  
  /**
    * The configuration for instance validation.
    */
  var serverGroupValidationConfigurations: js.UndefOr[ServerGroupValidationConfigurations] = js.native
}
object GetAppValidationConfigurationResponse {
  
  @scala.inline
  def apply(): GetAppValidationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppValidationConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetAppValidationConfigurationResponseOps[Self <: GetAppValidationConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setAppValidationConfigurationsVarargs(value: AppValidationConfiguration*): Self = this.set("appValidationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAppValidationConfigurations(value: AppValidationConfigurations): Self = this.set("appValidationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppValidationConfigurations: Self = this.set("appValidationConfigurations", js.undefined)
    
    @scala.inline
    def setServerGroupValidationConfigurationsVarargs(value: ServerGroupValidationConfiguration*): Self = this.set("serverGroupValidationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServerGroupValidationConfigurations(value: ServerGroupValidationConfigurations): Self = this.set("serverGroupValidationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroupValidationConfigurations: Self = this.set("serverGroupValidationConfigurations", js.undefined)
  }
}
