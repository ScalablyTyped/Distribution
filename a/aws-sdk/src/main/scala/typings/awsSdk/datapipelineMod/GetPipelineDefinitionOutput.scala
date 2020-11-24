package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPipelineDefinitionOutput extends js.Object {
  
  /**
    * The parameter objects used in the pipeline definition.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.native
  
  /**
    * The parameter values used in the pipeline definition.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  
  /**
    * The objects defined in the pipeline.
    */
  var pipelineObjects: js.UndefOr[PipelineObjectList] = js.native
}
object GetPipelineDefinitionOutput {
  
  @scala.inline
  def apply(): GetPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineDefinitionOutput]
  }
  
  @scala.inline
  implicit class GetPipelineDefinitionOutputOps[Self <: GetPipelineDefinitionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameterObjectsVarargs(value: ParameterObject*): Self = this.set("parameterObjects", js.Array(value :_*))
    
    @scala.inline
    def setParameterObjects(value: ParameterObjectList): Self = this.set("parameterObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterObjects: Self = this.set("parameterObjects", js.undefined)
    
    @scala.inline
    def setParameterValuesVarargs(value: ParameterValue*): Self = this.set("parameterValues", js.Array(value :_*))
    
    @scala.inline
    def setParameterValues(value: ParameterValueList): Self = this.set("parameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterValues: Self = this.set("parameterValues", js.undefined)
    
    @scala.inline
    def setPipelineObjectsVarargs(value: PipelineObject*): Self = this.set("pipelineObjects", js.Array(value :_*))
    
    @scala.inline
    def setPipelineObjects(value: PipelineObjectList): Self = this.set("pipelineObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineObjects: Self = this.set("pipelineObjects", js.undefined)
  }
}
