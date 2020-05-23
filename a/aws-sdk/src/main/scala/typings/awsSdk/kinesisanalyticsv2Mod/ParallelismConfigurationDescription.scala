package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, Kinesis Data Analytics can increase this value in response to application load. The service can increase this value up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var CurrentParallelism: js.UndefOr[Parallelism] = js.native
  /**
    * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform. If AutoScalingEnabled is set to True, then Kinesis Data Analytics can increase the CurrentParallelism value in response to application load. The service can increase CurrentParallelism up to the maximum parallelism, which is ParalellismPerKPU times the maximum KPUs for the application. The maximum KPUs for an application is 32 by default, and can be increased by requesting a limit increase. If application load is reduced, the service can reduce the CurrentParallelism value down to the Parallelism setting.
    */
  var Parallelism: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Parallelism] = js.native
  /**
    * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var ParallelismPerKPU: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismPerKPU] = js.native
}

object ParallelismConfigurationDescription {
  @scala.inline
  def apply(
    AutoScalingEnabled: js.UndefOr[BooleanObject] = js.undefined,
    ConfigurationType: ConfigurationType = null,
    CurrentParallelism: js.UndefOr[Parallelism] = js.undefined,
    Parallelism: js.UndefOr[Parallelism] = js.undefined,
    ParallelismPerKPU: js.UndefOr[ParallelismPerKPU] = js.undefined
  ): ParallelismConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoScalingEnabled)) __obj.updateDynamic("AutoScalingEnabled")(AutoScalingEnabled.get.asInstanceOf[js.Any])
    if (ConfigurationType != null) __obj.updateDynamic("ConfigurationType")(ConfigurationType.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentParallelism)) __obj.updateDynamic("CurrentParallelism")(CurrentParallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Parallelism)) __obj.updateDynamic("Parallelism")(Parallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ParallelismPerKPU)) __obj.updateDynamic("ParallelismPerKPU")(ParallelismPerKPU.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelismConfigurationDescription]
  }
}

