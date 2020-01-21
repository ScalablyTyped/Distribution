package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatePipelineDefinitionInput extends js.Object {
  /**
    * The parameter objects used with the pipeline.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.native
  /**
    * The parameter values used with the pipeline.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The objects that define the pipeline changes to validate against the pipeline.
    */
  var pipelineObjects: PipelineObjectList = js.native
}

object ValidatePipelineDefinitionInput {
  @scala.inline
  def apply(
    pipelineId: id,
    pipelineObjects: PipelineObjectList,
    parameterObjects: ParameterObjectList = null,
    parameterValues: ParameterValueList = null
  ): ValidatePipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    if (parameterObjects != null) __obj.updateDynamic("parameterObjects")(parameterObjects.asInstanceOf[js.Any])
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePipelineDefinitionInput]
  }
}

