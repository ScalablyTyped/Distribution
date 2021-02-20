package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDetail extends StObject {
  
  /**
    * The description of the step status.
    */
  var ExecutionStatusDetail: StepExecutionStatusDetail = js.native
  
  /**
    * The step configuration.
    */
  var StepConfig: typings.awsSdk.emrMod.StepConfig = js.native
}
object StepDetail {
  
  @scala.inline
  def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], StepConfig = StepConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDetail]
  }
  
  @scala.inline
  implicit class StepDetailMutableBuilder[Self <: StepDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionStatusDetail(value: StepExecutionStatusDetail): Self = StObject.set(x, "ExecutionStatusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepConfig(value: StepConfig): Self = StObject.set(x, "StepConfig", value.asInstanceOf[js.Any])
  }
}
