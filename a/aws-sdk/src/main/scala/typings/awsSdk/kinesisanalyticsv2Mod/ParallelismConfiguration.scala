package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelismConfiguration extends js.Object {
  
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. You must set this property to CUSTOM in order to change your application's AutoScalingEnabled, Parallelism, or ParallelismPerKPU properties.
    */
  var ConfigurationType: typings.awsSdk.kinesisanalyticsv2Mod.ConfigurationType = js.native
  
  /**
    * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, Kinesis Data Analytics increases the CurrentParallelism value in response to application load. The service can increase the CurrentParallelism value up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var Parallelism: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Parallelism] = js.native
  
  /**
    * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see Amazon Kinesis Data Analytics Pricing.
    */
  var ParallelismPerKPU: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismPerKPU] = js.native
}
object ParallelismConfiguration {
  
  @scala.inline
  def apply(ConfigurationType: ConfigurationType): ParallelismConfiguration = {
    val __obj = js.Dynamic.literal(ConfigurationType = ConfigurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelismConfiguration]
  }
  
  @scala.inline
  implicit class ParallelismConfigurationOps[Self <: ParallelismConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfigurationType(value: ConfigurationType): Self = this.set("ConfigurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingEnabled(value: BooleanObject): Self = this.set("AutoScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingEnabled: Self = this.set("AutoScalingEnabled", js.undefined)
    
    @scala.inline
    def setParallelism(value: Parallelism): Self = this.set("Parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelism: Self = this.set("Parallelism", js.undefined)
    
    @scala.inline
    def setParallelismPerKPU(value: ParallelismPerKPU): Self = this.set("ParallelismPerKPU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelismPerKPU: Self = this.set("ParallelismPerKPU", js.undefined)
  }
}
