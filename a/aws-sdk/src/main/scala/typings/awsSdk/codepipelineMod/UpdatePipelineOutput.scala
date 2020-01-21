package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineOutput extends js.Object {
  /**
    * The structure of the updated pipeline.
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
}

object UpdatePipelineOutput {
  @scala.inline
  def apply(pipeline: PipelineDeclaration = null): UpdatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineOutput]
  }
}

