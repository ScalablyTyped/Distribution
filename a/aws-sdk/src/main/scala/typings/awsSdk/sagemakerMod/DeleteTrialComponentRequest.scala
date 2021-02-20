package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrialComponentRequest extends StObject {
  
  /**
    * The name of the component to delete.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}
object DeleteTrialComponentRequest {
  
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): DeleteTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrialComponentRequest]
  }
  
  @scala.inline
  implicit class DeleteTrialComponentRequestMutableBuilder[Self <: DeleteTrialComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentName(value: ExperimentEntityName): Self = StObject.set(x, "TrialComponentName", value.asInstanceOf[js.Any])
  }
}
