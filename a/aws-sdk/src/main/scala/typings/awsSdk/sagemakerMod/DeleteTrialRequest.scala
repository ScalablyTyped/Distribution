package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrialRequest extends StObject {
  
  /**
    * The name of the trial to delete.
    */
  var TrialName: ExperimentEntityName = js.native
}
object DeleteTrialRequest {
  
  @scala.inline
  def apply(TrialName: ExperimentEntityName): DeleteTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrialRequest]
  }
  
  @scala.inline
  implicit class DeleteTrialRequestMutableBuilder[Self <: DeleteTrialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
