package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLoggingConfigurationResponse extends js.Object {
  
  /**
    * 
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.wafv2Mod.LoggingConfiguration] = js.native
}
object PutLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): PutLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutLoggingConfigurationResponseOps[Self <: PutLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setLoggingConfiguration(value: LoggingConfiguration): Self = this.set("LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("LoggingConfiguration", js.undefined)
  }
}
