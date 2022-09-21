package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelStepsInput extends StObject {
  
  /**
    * The ClusterID for the specified steps that will be canceled. Use RunJobFlow and ListClusters to get ClusterIDs. 
    */
  var ClusterId: XmlStringMaxLen256
  
  /**
    * The option to choose to cancel RUNNING steps. By default, the value is SEND_INTERRUPT.
    */
  var StepCancellationOption: js.UndefOr[typings.awsSdk.emrMod.StepCancellationOption] = js.undefined
  
  /**
    * The list of StepIDs to cancel. Use ListSteps to get steps and their states for the specified cluster.
    */
  var StepIds: StepIdsList
}
object CancelStepsInput {
  
  inline def apply(ClusterId: XmlStringMaxLen256, StepIds: StepIdsList): CancelStepsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepIds = StepIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStepsInput]
  }
  
  extension [Self <: CancelStepsInput](x: Self) {
    
    inline def setClusterId(value: XmlStringMaxLen256): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setStepCancellationOption(value: StepCancellationOption): Self = StObject.set(x, "StepCancellationOption", value.asInstanceOf[js.Any])
    
    inline def setStepCancellationOptionUndefined: Self = StObject.set(x, "StepCancellationOption", js.undefined)
    
    inline def setStepIds(value: StepIdsList): Self = StObject.set(x, "StepIds", value.asInstanceOf[js.Any])
    
    inline def setStepIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "StepIds", js.Array(value*))
  }
}
