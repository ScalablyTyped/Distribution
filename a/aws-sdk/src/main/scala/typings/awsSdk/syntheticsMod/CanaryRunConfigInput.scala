package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryRunConfigInput extends js.Object {
  
  /**
    * Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see  Canaries and X-Ray tracing. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
    */
  var ActiveTracing: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Specifies the keys and values to use for any environment variables used in the canary script. Use the following format: { "key1" : "value1", "key2" : "value2", ...} Keys must start with a letter and be at least two characters. The total size of your environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your environment variables. For more information about reserved keys, see  Runtime environment variables.
    */
  var EnvironmentVariables: js.UndefOr[EnvironmentVariablesMap] = js.native
  
  /**
    * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of 64.
    */
  var MemoryInMB: js.UndefOr[MaxSize3008] = js.native
  
  /**
    * How long the canary is allowed to run before it must stop. You can't set this time to be longer than the frequency of the runs of this canary. If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
    */
  var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.native
}
object CanaryRunConfigInput {
  
  @scala.inline
  def apply(): CanaryRunConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunConfigInput]
  }
  
  @scala.inline
  implicit class CanaryRunConfigInputOps[Self <: CanaryRunConfigInput] (val x: Self) extends AnyVal {
    
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
    def setActiveTracing(value: NullableBoolean): Self = this.set("ActiveTracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveTracing: Self = this.set("ActiveTracing", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: EnvironmentVariablesMap): Self = this.set("EnvironmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("EnvironmentVariables", js.undefined)
    
    @scala.inline
    def setMemoryInMB(value: MaxSize3008): Self = this.set("MemoryInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInMB: Self = this.set("MemoryInMB", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: MaxFifteenMinutesInSeconds): Self = this.set("TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("TimeoutInSeconds", js.undefined)
  }
}
