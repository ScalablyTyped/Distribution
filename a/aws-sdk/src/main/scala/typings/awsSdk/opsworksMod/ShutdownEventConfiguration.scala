package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShutdownEventConfiguration extends StObject {
  
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
  implicit class ShutdownEventConfigurationMutableBuilder[Self <: ShutdownEventConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelayUntilElbConnectionsDrained(value: Boolean): Self = StObject.set(x, "DelayUntilElbConnectionsDrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUntilElbConnectionsDrainedUndefined: Self = StObject.set(x, "DelayUntilElbConnectionsDrained", js.undefined)
    
    @scala.inline
    def setExecutionTimeout(value: Integer): Self = StObject.set(x, "ExecutionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeoutUndefined: Self = StObject.set(x, "ExecutionTimeout", js.undefined)
  }
}
