package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShutdownEventConfiguration extends js.Object {
  
  /**
    * Whether to enable Elastic Load Balancing connection draining. For more information, see Connection Draining 
    */
  var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.native
  
  /**
    * The time, in seconds, that AWS OpsWorks Stacks will wait after triggering a Shutdown event before shutting down an instance.
    */
  var ExecutionTimeout: js.UndefOr[Integer] = js.native
}
object ShutdownEventConfiguration {
  
  @scala.inline
  def apply(): ShutdownEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShutdownEventConfiguration]
  }
  
  @scala.inline
  implicit class ShutdownEventConfigurationOps[Self <: ShutdownEventConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDelayUntilElbConnectionsDrained(value: Boolean): Self = this.set("DelayUntilElbConnectionsDrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayUntilElbConnectionsDrained: Self = this.set("DelayUntilElbConnectionsDrained", js.undefined)
    
    @scala.inline
    def setExecutionTimeout(value: Integer): Self = this.set("ExecutionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTimeout: Self = this.set("ExecutionTimeout", js.undefined)
  }
}
