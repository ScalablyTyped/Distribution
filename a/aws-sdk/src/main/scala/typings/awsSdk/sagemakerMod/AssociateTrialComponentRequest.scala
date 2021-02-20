package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component to associated with the trial.
    */
  var TrialComponentName: ExperimentEntityName = js.native
  
  /**
    * The name of the trial to associate with.
    */
  var TrialName: ExperimentEntityName = js.native
}
object AssociateTrialComponentRequest {
  
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): AssociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateTrialComponentRequest]
  }
  
  @scala.inline
  implicit class AssociateTrialComponentRequestMutableBuilder[Self <: AssociateTrialComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
