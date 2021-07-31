package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineDefinitionOutput extends StObject {
  
  /**
    * The parameter objects used in the pipeline definition.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
  
  /**
    * The parameter values used in the pipeline definition.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  
  /**
    * The objects defined in the pipeline.
    */
  var pipelineObjects: js.UndefOr[PipelineObjectList] = js.undefined
}
object GetPipelineDefinitionOutput {
  
  @scala.inline
  def apply(): GetPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineDefinitionOutput]
  }
  
  @scala.inline
  implicit class GetPipelineDefinitionOutputMutableBuilder[Self <: GetPipelineDefinitionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterObjects(value: ParameterObjectList): Self = StObject.set(x, "parameterObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterObjectsUndefined: Self = StObject.set(x, "parameterObjects", js.undefined)
    
    @scala.inline
    def setParameterObjectsVarargs(value: ParameterObject*): Self = StObject.set(x, "parameterObjects", js.Array(value :_*))
    
    @scala.inline
    def setParameterValues(value: ParameterValueList): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    @scala.inline
    def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "parameterValues", js.Array(value :_*))
    
    @scala.inline
    def setPipelineObjects(value: PipelineObjectList): Self = StObject.set(x, "pipelineObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineObjectsUndefined: Self = StObject.set(x, "pipelineObjects", js.undefined)
    
    @scala.inline
    def setPipelineObjectsVarargs(value: PipelineObject*): Self = StObject.set(x, "pipelineObjects", js.Array(value :_*))
  }
}
