package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationSetRequest extends js.Object {
  
  /**
    * A data structure that contains the name of the configuration set.
    */
  var ConfigurationSet: typings.awsSdk.sesMod.ConfigurationSet = js.native
}
object CreateConfigurationSetRequest {
  
  @scala.inline
  def apply(ConfigurationSet: ConfigurationSet): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSet = ConfigurationSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetRequestOps[Self <: CreateConfigurationSetRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationSet(value: ConfigurationSet): Self = this.set("ConfigurationSet", value.asInstanceOf[js.Any])
  }
}
