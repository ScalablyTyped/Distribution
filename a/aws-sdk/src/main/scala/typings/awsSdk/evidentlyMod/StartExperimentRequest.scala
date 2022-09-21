package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExperimentRequest extends StObject {
  
  /**
    * The date and time to end the experiment. This must be no more than 30 days after the experiment starts.
    */
  var analysisCompleteTime: js.Date
  
  /**
    * The name of the experiment to start.
    */
  var experiment: ExperimentName
  
  /**
    * The name or ARN of the project that contains the experiment to start.
    */
  var project: ProjectRef
}
object StartExperimentRequest {
  
  inline def apply(analysisCompleteTime: js.Date, experiment: ExperimentName, project: ProjectRef): StartExperimentRequest = {
    val __obj = js.Dynamic.literal(analysisCompleteTime = analysisCompleteTime.asInstanceOf[js.Any], experiment = experiment.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExperimentRequest]
  }
  
  extension [Self <: StartExperimentRequest](x: Self) {
    
    inline def setAnalysisCompleteTime(value: js.Date): Self = StObject.set(x, "analysisCompleteTime", value.asInstanceOf[js.Any])
    
    inline def setExperiment(value: ExperimentName): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
