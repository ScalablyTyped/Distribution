package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationStep extends StObject {
  
  /**
    * 
    Information about the step and its status.
    
    */
  var StepInfo: js.UndefOr[ClusterOperationStepInfo] = js.native
  
  /**
    * 
    The name of the step.
    
    */
  var StepName: js.UndefOr[string] = js.native
}
object ClusterOperationStep {
  
  @scala.inline
  def apply(): ClusterOperationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStep]
  }
  
  @scala.inline
  implicit class ClusterOperationStepMutableBuilder[Self <: ClusterOperationStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepInfo(value: ClusterOperationStepInfo): Self = StObject.set(x, "StepInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepInfoUndefined: Self = StObject.set(x, "StepInfo", js.undefined)
    
    @scala.inline
    def setStepName(value: string): Self = StObject.set(x, "StepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNameUndefined: Self = StObject.set(x, "StepName", js.undefined)
  }
}
