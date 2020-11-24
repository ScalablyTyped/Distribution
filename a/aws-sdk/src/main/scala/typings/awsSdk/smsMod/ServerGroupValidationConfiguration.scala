package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupValidationConfiguration extends js.Object {
  
  /**
    * The ID of the server group.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  
  /**
    * The validation configuration.
    */
  var serverValidationConfigurations: js.UndefOr[ServerValidationConfigurations] = js.native
}
object ServerGroupValidationConfiguration {
  
  @scala.inline
  def apply(): ServerGroupValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupValidationConfiguration]
  }
  
  @scala.inline
  implicit class ServerGroupValidationConfigurationOps[Self <: ServerGroupValidationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setServerGroupId(value: ServerGroupId): Self = this.set("serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroupId: Self = this.set("serverGroupId", js.undefined)
    
    @scala.inline
    def setServerValidationConfigurationsVarargs(value: ServerValidationConfiguration*): Self = this.set("serverValidationConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServerValidationConfigurations(value: ServerValidationConfigurations): Self = this.set("serverValidationConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerValidationConfigurations: Self = this.set("serverValidationConfigurations", js.undefined)
  }
}
