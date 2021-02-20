package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelismConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabledUpdate: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service, or if a custom parallelism is used. You must set this property to CUSTOM in order to change your application's AutoScalingEnabled, Parallelism, or ParallelismPerKPU properties.
    */
  var ConfigurationTypeUpdate: js.UndefOr[ConfigurationType] = js.native
  
  /**
    * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPUUpdate: js.UndefOr[ParallelismPerKPU] = js.native
  
  /**
    * Describes updates to the initial number of parallel tasks an application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service will reduce CurrentParallelism down to the Parallelism setting.
    */
  var ParallelismUpdate: js.UndefOr[Parallelism] = js.native
}
object ParallelismConfigurationUpdate {
  
  @scala.inline
  def apply(): ParallelismConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelismConfigurationUpdate]
  }
  
  @scala.inline
  implicit class ParallelismConfigurationUpdateMutableBuilder[Self <: ParallelismConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingEnabledUpdate(value: BooleanObject): Self = StObject.set(x, "AutoScalingEnabledUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingEnabledUpdateUndefined: Self = StObject.set(x, "AutoScalingEnabledUpdate", js.undefined)
    
    @scala.inline
    def setConfigurationTypeUpdate(value: ConfigurationType): Self = StObject.set(x, "ConfigurationTypeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationTypeUpdateUndefined: Self = StObject.set(x, "ConfigurationTypeUpdate", js.undefined)
    
    @scala.inline
    def setParallelismPerKPUUpdate(value: ParallelismPerKPU): Self = StObject.set(x, "ParallelismPerKPUUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismPerKPUUpdateUndefined: Self = StObject.set(x, "ParallelismPerKPUUpdate", js.undefined)
    
    @scala.inline
    def setParallelismUpdate(value: Parallelism): Self = StObject.set(x, "ParallelismUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismUpdateUndefined: Self = StObject.set(x, "ParallelismUpdate", js.undefined)
  }
}
