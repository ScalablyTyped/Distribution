package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateTrialComponentRequest extends StObject {
  
  /**
    * The name of the component to disassociate from the trial.
    */
  var TrialComponentName: ExperimentEntityName = js.native
  
  /**
    * The name of the trial to disassociate from.
    */
  var TrialName: ExperimentEntityName = js.native
}
object DisassociateTrialComponentRequest {
  
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): DisassociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrialComponentRequest]
  }
  
  @scala.inline
  implicit class DisassociateTrialComponentRequestMutableBuilder[Self <: DisassociateTrialComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
