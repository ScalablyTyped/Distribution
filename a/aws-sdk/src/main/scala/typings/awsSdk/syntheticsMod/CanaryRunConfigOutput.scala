package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryRunConfigOutput extends js.Object {
  
  /**
    * Displays whether this canary run used active AWS X-Ray tracing. 
    */
  var ActiveTracing: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of 64.
    */
  var MemoryInMB: js.UndefOr[MaxSize3008] = js.native
  
  /**
    * How long the canary is allowed to run before it must stop.
    */
  var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.native
}
object CanaryRunConfigOutput {
  
  @scala.inline
  def apply(): CanaryRunConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunConfigOutput]
  }
  
  @scala.inline
  implicit class CanaryRunConfigOutputOps[Self <: CanaryRunConfigOutput] (val x: Self) extends AnyVal {
    
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
    def setMemoryInMB(value: MaxSize3008): Self = this.set("MemoryInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInMB: Self = this.set("MemoryInMB", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: MaxFifteenMinutesInSeconds): Self = this.set("TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("TimeoutInSeconds", js.undefined)
  }
}
