package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPipelineDefinitionOutput extends js.Object {
  /**
    * Indicates whether there were validation errors, and the pipeline definition is stored but cannot be activated until you correct the pipeline and call PutPipelineDefinition to commit the corrected pipeline.
    */
  var errored: Boolean = js.native
  /**
    * The validation errors that are associated with the objects defined in pipelineObjects.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
  /**
    * The validation warnings that are associated with the objects defined in pipelineObjects.
    */
  var validationWarnings: js.UndefOr[ValidationWarnings] = js.native
}

object PutPipelineDefinitionOutput {
  @scala.inline
  def apply(
    errored: Boolean,
    validationErrors: ValidationErrors = null,
    validationWarnings: ValidationWarnings = null
  ): PutPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationWarnings != null) __obj.updateDynamic("validationWarnings")(validationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPipelineDefinitionOutput]
  }
}

