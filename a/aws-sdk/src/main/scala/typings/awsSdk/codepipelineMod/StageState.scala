package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageState extends js.Object {
  
  /**
    * The state of the stage.
    */
  var actionStates: js.UndefOr[ActionStateList] = js.native
  
  var inboundExecution: js.UndefOr[StageExecution] = js.native
  
  /**
    * The state of the inbound transition, which is either enabled or disabled.
    */
  var inboundTransitionState: js.UndefOr[TransitionState] = js.native
  
  /**
    * Information about the latest execution in the stage, including its ID and status.
    */
  var latestExecution: js.UndefOr[StageExecution] = js.native
  
  /**
    * The name of the stage.
    */
  var stageName: js.UndefOr[StageName] = js.native
}
object StageState {
  
  @scala.inline
  def apply(): StageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageState]
  }
  
  @scala.inline
  implicit class StageStateOps[Self <: StageState] (val x: Self) extends AnyVal {
    
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
    def setActionStatesVarargs(value: ActionState*): Self = this.set("actionStates", js.Array(value :_*))
    
    @scala.inline
    def setActionStates(value: ActionStateList): Self = this.set("actionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionStates: Self = this.set("actionStates", js.undefined)
    
    @scala.inline
    def setInboundExecution(value: StageExecution): Self = this.set("inboundExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundExecution: Self = this.set("inboundExecution", js.undefined)
    
    @scala.inline
    def setInboundTransitionState(value: TransitionState): Self = this.set("inboundTransitionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundTransitionState: Self = this.set("inboundTransitionState", js.undefined)
    
    @scala.inline
    def setLatestExecution(value: StageExecution): Self = this.set("latestExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestExecution: Self = this.set("latestExecution", js.undefined)
    
    @scala.inline
    def setStageName(value: StageName): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
  }
}
