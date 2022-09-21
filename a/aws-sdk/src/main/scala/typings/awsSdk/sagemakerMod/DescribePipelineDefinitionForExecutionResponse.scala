package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineDefinitionForExecutionResponse extends StObject {
  
  /**
    * The time when the pipeline was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The JSON pipeline definition.
    */
  var PipelineDefinition: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineDefinition] = js.undefined
}
object DescribePipelineDefinitionForExecutionResponse {
  
  inline def apply(): DescribePipelineDefinitionForExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipelineDefinitionForExecutionResponse]
  }
  
  extension [Self <: DescribePipelineDefinitionForExecutionResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setPipelineDefinition(value: PipelineDefinition): Self = StObject.set(x, "PipelineDefinition", value.asInstanceOf[js.Any])
    
    inline def setPipelineDefinitionUndefined: Self = StObject.set(x, "PipelineDefinition", js.undefined)
  }
}
