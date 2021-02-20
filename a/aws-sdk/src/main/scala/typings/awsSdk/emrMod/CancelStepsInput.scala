package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelStepsInput extends StObject {
  
  /**
    * The ClusterID for which specified steps will be canceled. Use RunJobFlow and ListClusters to get ClusterIDs. 
    */
  var ClusterId: XmlStringMaxLen256 = js.native
  
  /**
    * The option to choose for cancelling RUNNING steps. By default, the value is SEND_INTERRUPT.
    */
  var StepCancellationOption: js.UndefOr[typings.awsSdk.emrMod.StepCancellationOption] = js.native
  
  /**
    * The list of StepIDs to cancel. Use ListSteps to get steps and their states for the specified cluster.
    */
  var StepIds: StepIdsList = js.native
}
object CancelStepsInput {
  
  @scala.inline
  def apply(ClusterId: XmlStringMaxLen256, StepIds: StepIdsList): CancelStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepIds = StepIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStepsInput]
  }
  
  @scala.inline
  implicit class CancelStepsInputMutableBuilder[Self <: CancelStepsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: XmlStringMaxLen256): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepCancellationOption(value: StepCancellationOption): Self = StObject.set(x, "StepCancellationOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepCancellationOptionUndefined: Self = StObject.set(x, "StepCancellationOption", js.undefined)
    
    @scala.inline
    def setStepIds(value: StepIdsList): Self = StObject.set(x, "StepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "StepIds", js.Array(value :_*))
  }
}
