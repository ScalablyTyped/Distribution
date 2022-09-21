package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepConfig extends StObject {
  
  /**
    * The action to take when the step fails. Use one of the following values:    TERMINATE_CLUSTER - Shuts down the cluster.    CANCEL_AND_WAIT - Cancels any pending steps and returns the cluster to the WAITING state.    CONTINUE - Continues to the next step in the queue.    TERMINATE_JOB_FLOW - Shuts down the cluster. TERMINATE_JOB_FLOW is provided for backward compatibility. We recommend using TERMINATE_CLUSTER instead.   If a cluster's StepConcurrencyLevel is greater than 1, do not use AddJobFlowSteps to submit a step with this parameter set to CANCEL_AND_WAIT or TERMINATE_CLUSTER. The step is not submitted and the action fails with a message that the ActionOnFailure setting is not valid. If you change a cluster's StepConcurrencyLevel to be greater than 1 while a step is running, the ActionOnFailure parameter may not behave as you expect. In this case, for a step that fails with this parameter set to CANCEL_AND_WAIT, pending steps and the running step are not canceled; for a step that fails with this parameter set to TERMINATE_CLUSTER, the cluster does not terminate.
    */
  var ActionOnFailure: js.UndefOr[typings.awsSdk.emrMod.ActionOnFailure] = js.undefined
  
  /**
    * The JAR file used for the step.
    */
  var HadoopJarStep: HadoopJarStepConfig
  
  /**
    * The name of the step.
    */
  var Name: XmlStringMaxLen256
}
object StepConfig {
  
  inline def apply(HadoopJarStep: HadoopJarStepConfig, Name: XmlStringMaxLen256): StepConfig = {
    val __obj = js.Dynamic.literal(HadoopJarStep = HadoopJarStep.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepConfig]
  }
  
  extension [Self <: StepConfig](x: Self) {
    
    inline def setActionOnFailure(value: ActionOnFailure): Self = StObject.set(x, "ActionOnFailure", value.asInstanceOf[js.Any])
    
    inline def setActionOnFailureUndefined: Self = StObject.set(x, "ActionOnFailure", js.undefined)
    
    inline def setHadoopJarStep(value: HadoopJarStepConfig): Self = StObject.set(x, "HadoopJarStep", value.asInstanceOf[js.Any])
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
