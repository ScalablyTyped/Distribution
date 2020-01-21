package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPipelineDefinitionInput extends js.Object {
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The version of the pipeline definition to retrieve. Set this parameter to latest (default) to use the last definition saved to the pipeline or active to use the last definition that was activated.
    */
  var version: js.UndefOr[String] = js.native
}

object GetPipelineDefinitionInput {
  @scala.inline
  def apply(pipelineId: id, version: String = null): GetPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineDefinitionInput]
  }
}

