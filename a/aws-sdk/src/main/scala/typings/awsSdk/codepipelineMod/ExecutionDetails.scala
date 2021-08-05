package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionDetails extends StObject {
  
  /**
    * The system-generated unique ID of this action used to identify this job worker in any external systems, such as AWS CodeDeploy.
    */
  var externalExecutionId: js.UndefOr[ExecutionId] = js.undefined
  
  /**
    * The percentage of work completed on the action, represented on a scale of 0 to 100 percent.
    */
  var percentComplete: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The summary of the current status of the actions.
    */
  var summary: js.UndefOr[ExecutionSummary] = js.undefined
}
object ExecutionDetails {
  
  inline def apply(): ExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionDetails]
  }
  
  extension [Self <: ExecutionDetails](x: Self) {
    
    inline def setExternalExecutionId(value: ExecutionId): Self = StObject.set(x, "externalExecutionId", value.asInstanceOf[js.Any])
    
    inline def setExternalExecutionIdUndefined: Self = StObject.set(x, "externalExecutionId", js.undefined)
    
    inline def setPercentComplete(value: Percentage): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setSummary(value: ExecutionSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
