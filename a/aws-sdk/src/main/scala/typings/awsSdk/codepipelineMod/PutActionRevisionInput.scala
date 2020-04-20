package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutActionRevisionInput extends js.Object {
  /**
    * The name of the action that processes the revision.
    */
  var actionName: ActionName = js.native
  /**
    * Represents information about the version (or revision) of an action.
    */
  var actionRevision: ActionRevision = js.native
  /**
    * The name of the pipeline that starts processing the revision to the source.
    */
  var pipelineName: PipelineName = js.native
  /**
    * The name of the stage that contains the action that acts on the revision.
    */
  var stageName: StageName = js.native
}

object PutActionRevisionInput {
  @scala.inline
  def apply(
    actionName: ActionName,
    actionRevision: ActionRevision,
    pipelineName: PipelineName,
    stageName: StageName
  ): PutActionRevisionInput = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionRevision = actionRevision.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutActionRevisionInput]
  }
}

