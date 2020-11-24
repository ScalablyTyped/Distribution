package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableStageTransitionInput extends js.Object {
  
  /**
    * The name of the pipeline in which you want to enable the flow of artifacts from one stage to another.
    */
  var pipelineName: PipelineName = js.native
  
  /**
    * The name of the stage where you want to enable the transition of artifacts, either into the stage (inbound) or from that stage to the next stage (outbound).
    */
  var stageName: StageName = js.native
  
  /**
    * Specifies whether artifacts are allowed to enter the stage and be processed by the actions in that stage (inbound) or whether already processed artifacts are allowed to transition to the next stage (outbound).
    */
  var transitionType: StageTransitionType = js.native
}
object EnableStageTransitionInput {
  
  @scala.inline
  def apply(pipelineName: PipelineName, stageName: StageName, transitionType: StageTransitionType): EnableStageTransitionInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableStageTransitionInput]
  }
  
  @scala.inline
  implicit class EnableStageTransitionInputOps[Self <: EnableStageTransitionInput] (val x: Self) extends AnyVal {
    
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
    def setPipelineName(value: PipelineName): Self = this.set("pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: StageName): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionType(value: StageTransitionType): Self = this.set("transitionType", value.asInstanceOf[js.Any])
  }
}
