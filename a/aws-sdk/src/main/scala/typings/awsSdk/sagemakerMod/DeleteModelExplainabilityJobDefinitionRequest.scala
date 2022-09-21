package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelExplainabilityJobDefinitionRequest extends StObject {
  
  /**
    * The name of the model explainability job definition to delete.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DeleteModelExplainabilityJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DeleteModelExplainabilityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelExplainabilityJobDefinitionRequest]
  }
  
  extension [Self <: DeleteModelExplainabilityJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
