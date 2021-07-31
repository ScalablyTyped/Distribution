package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentRequest extends StObject {
  
  /**
    * The name of the experiment to delete.
    */
  var ExperimentName: ExperimentEntityName
}
object DeleteExperimentRequest {
  
  @scala.inline
  def apply(ExperimentName: ExperimentEntityName): DeleteExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentRequest]
  }
  
  @scala.inline
  implicit class DeleteExperimentRequestMutableBuilder[Self <: DeleteExperimentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
  }
}
