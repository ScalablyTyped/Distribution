package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPipelineDefinitionInput extends StObject {
  
  /**
    * The parameter objects used with the pipeline.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
  
  /**
    * The parameter values used with the pipeline.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  
  /**
    * The objects that define the pipeline. These objects overwrite the existing pipeline definition.
    */
  var pipelineObjects: PipelineObjectList
}
object PutPipelineDefinitionInput {
  
  inline def apply(pipelineId: id, pipelineObjects: PipelineObjectList): PutPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPipelineDefinitionInput]
  }
  
  extension [Self <: PutPipelineDefinitionInput](x: Self) {
    
    inline def setParameterObjects(value: ParameterObjectList): Self = StObject.set(x, "parameterObjects", value.asInstanceOf[js.Any])
    
    inline def setParameterObjectsUndefined: Self = StObject.set(x, "parameterObjects", js.undefined)
    
    inline def setParameterObjectsVarargs(value: ParameterObject*): Self = StObject.set(x, "parameterObjects", js.Array(value*))
    
    inline def setParameterValues(value: ParameterValueList): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    inline def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    inline def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "parameterValues", js.Array(value*))
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setPipelineObjects(value: PipelineObjectList): Self = StObject.set(x, "pipelineObjects", value.asInstanceOf[js.Any])
    
    inline def setPipelineObjectsVarargs(value: PipelineObject*): Self = StObject.set(x, "pipelineObjects", js.Array(value*))
  }
}
