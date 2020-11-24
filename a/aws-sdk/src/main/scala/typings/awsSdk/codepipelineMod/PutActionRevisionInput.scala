package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class PutActionRevisionInputOps[Self <: PutActionRevisionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionName(value: ActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionRevision(value: ActionRevision): Self = this.set("actionRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: StageName): Self = this.set("stageName", value.asInstanceOf[js.Any])
  }
}
