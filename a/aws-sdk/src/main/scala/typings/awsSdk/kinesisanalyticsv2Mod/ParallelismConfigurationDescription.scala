package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelismConfigurationDescription extends js.Object {
  
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var AutoScalingEnabled: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. 
    */
  var ConfigurationType: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ConfigurationType] = js.native
  
  /**
    * Describes the current number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, Kinesis Data Analytics can increase this value in response to application load. The service can increase this value up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var CurrentParallelism: js.UndefOr[Parallelism] = js.native
  
  /**
    * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var Parallelism: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Parallelism] = js.native
  
  /**
    * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPU: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismPerKPU] = js.native
}
object ParallelismConfigurationDescription {
  
  @scala.inline
  def apply(): ParallelismConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelismConfigurationDescription]
  }
  
  @scala.inline
  implicit class ParallelismConfigurationDescriptionOps[Self <: ParallelismConfigurationDescription] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingEnabled(value: BooleanObject): Self = this.set("AutoScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingEnabled: Self = this.set("AutoScalingEnabled", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: ConfigurationType): Self = this.set("ConfigurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationType: Self = this.set("ConfigurationType", js.undefined)
    
    @scala.inline
    def setCurrentParallelism(value: Parallelism): Self = this.set("CurrentParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentParallelism: Self = this.set("CurrentParallelism", js.undefined)
    
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
