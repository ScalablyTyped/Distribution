package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExperimentRequest extends StObject {
  
  /**
    * Specify whether the experiment is to be considered COMPLETED or CANCELLED after it stops.
    */
  var desiredState: js.UndefOr[ExperimentStopDesiredState] = js.undefined
  
  /**
    * The name of the experiment to stop.
    */
  var experiment: ExperimentName
  
  /**
    * The name or ARN of the project that contains the experiment to stop.
    */
  var project: ProjectRef
  
  /**
    * A string that describes why you are stopping the experiment.
    */
  var reason: js.UndefOr[Description] = js.undefined
}
object StopExperimentRequest {
  
  inline def apply(experiment: ExperimentName, project: ProjectRef): StopExperimentRequest = {
    val __obj = js.Dynamic.literal(experiment = experiment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExperimentRequest]
  }
  
  extension [Self <: StopExperimentRequest](x: Self) {
    
    inline def setDesiredState(value: ExperimentStopDesiredState): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setExperiment(value: ExperimentName): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Description): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
