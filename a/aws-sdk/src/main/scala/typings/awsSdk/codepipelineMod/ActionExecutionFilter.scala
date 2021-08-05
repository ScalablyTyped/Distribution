package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionExecutionFilter extends StObject {
  
  /**
    * The pipeline execution ID used to filter action execution history.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}
object ActionExecutionFilter {
  
  inline def apply(): ActionExecutionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionFilter]
  }
  
  extension [Self <: ActionExecutionFilter](x: Self) {
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
