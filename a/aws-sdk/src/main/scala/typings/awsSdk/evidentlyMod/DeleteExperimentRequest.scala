package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentRequest extends StObject {
  
  /**
    * The name of the experiment to delete.
    */
  var experiment: ExperimentName
  
  /**
    * The name or ARN of the project that contains the experiment to delete.
    */
  var project: ProjectRef
}
object DeleteExperimentRequest {
  
  inline def apply(experiment: ExperimentName, project: ProjectRef): DeleteExperimentRequest = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentRequest]
  }
  
  extension [Self <: DeleteExperimentRequest](x: Self) {
    
    inline def setExperiment(value: ExperimentName): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
