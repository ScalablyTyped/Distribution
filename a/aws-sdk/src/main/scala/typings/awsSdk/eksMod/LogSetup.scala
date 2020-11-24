package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogSetup extends js.Object {
  
  /**
    * If a log type is enabled, that log type exports its control plane logs to CloudWatch Logs. If a log type isn't enabled, that log type doesn't export its control plane logs. Each individual log type can be enabled or disabled independently.
    */
  var enabled: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * The available cluster control plane log types.
    */
  var types: js.UndefOr[LogTypes] = js.native
}
object LogSetup {
  
  @scala.inline
  def apply(): LogSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSetup]
  }
  
  @scala.inline
  implicit class LogSetupOps[Self <: LogSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: BoxedBoolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: LogType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: LogTypes): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
