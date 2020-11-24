package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureHealthCheckOutput extends js.Object {
  
  /**
    * The updated health check.
    */
  var HealthCheck: js.UndefOr[typings.awsSdk.elbMod.HealthCheck] = js.native
}
object ConfigureHealthCheckOutput {
  
  @scala.inline
  def apply(): ConfigureHealthCheckOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureHealthCheckOutput]
  }
  
  @scala.inline
  implicit class ConfigureHealthCheckOutputOps[Self <: ConfigureHealthCheckOutput] (val x: Self) extends AnyVal {
    
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
    def setHealthCheck(value: HealthCheck): Self = this.set("HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("HealthCheck", js.undefined)
  }
}
