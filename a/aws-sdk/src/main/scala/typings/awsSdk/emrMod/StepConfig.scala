package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepConfig extends StObject {
  
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is provided for backward compatibility. We recommend using TERMINATE_CLUSTER instead.
    */
  var ActionOnFailure: js.UndefOr[typings.awsSdk.emrMod.ActionOnFailure] = js.native
  
  /**
    * The JAR file used for the step.
    */
  var HadoopJarStep: HadoopJarStepConfig = js.native
  
  /**
    * The name of the step.
    */
  var Name: XmlStringMaxLen256 = js.native
}
object StepConfig {
  
  @scala.inline
  def apply(HadoopJarStep: HadoopJarStepConfig, Name: XmlStringMaxLen256): StepConfig = {
    val __obj = js.Dynamic.literal(HadoopJarStep = HadoopJarStep.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepConfig]
  }
  
  @scala.inline
  implicit class StepConfigMutableBuilder[Self <: StepConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionOnFailure(value: ActionOnFailure): Self = StObject.set(x, "ActionOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionOnFailureUndefined: Self = StObject.set(x, "ActionOnFailure", js.undefined)
    
    @scala.inline
    def setHadoopJarStep(value: HadoopJarStepConfig): Self = StObject.set(x, "HadoopJarStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
