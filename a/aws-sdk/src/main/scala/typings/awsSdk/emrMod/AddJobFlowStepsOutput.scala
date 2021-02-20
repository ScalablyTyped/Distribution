package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddJobFlowStepsOutput extends StObject {
  
  /**
    * The identifiers of the list of steps added to the job flow.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.native
}
object AddJobFlowStepsOutput {
  
  @scala.inline
  def apply(): AddJobFlowStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddJobFlowStepsOutput]
  }
  
  @scala.inline
  implicit class AddJobFlowStepsOutputMutableBuilder[Self <: AddJobFlowStepsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepIds(value: StepIdsList): Self = StObject.set(x, "StepIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdsUndefined: Self = StObject.set(x, "StepIds", js.undefined)
    
    @scala.inline
    def setStepIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "StepIds", js.Array(value :_*))
  }
}
