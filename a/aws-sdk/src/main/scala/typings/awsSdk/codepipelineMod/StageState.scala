package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageState extends StObject {
  
  /**
    * The state of the stage.
    */
  var actionStates: js.UndefOr[ActionStateList] = js.undefined
  
  var inboundExecution: js.UndefOr[StageExecution] = js.undefined
  
  /**
    * The state of the inbound transition, which is either enabled or disabled.
    */
  var inboundTransitionState: js.UndefOr[TransitionState] = js.undefined
  
  /**
    * Information about the latest execution in the stage, including its ID and status.
    */
  var latestExecution: js.UndefOr[StageExecution] = js.undefined
  
  /**
    * The name of the stage.
    */
  var stageName: js.UndefOr[StageName] = js.undefined
}
object StageState {
  
  @scala.inline
  def apply(): StageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageState]
  }
  
  @scala.inline
  implicit class StageStateMutableBuilder[Self <: StageState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionStates(value: ActionStateList): Self = StObject.set(x, "actionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionStatesUndefined: Self = StObject.set(x, "actionStates", js.undefined)
    
    @scala.inline
    def setActionStatesVarargs(value: ActionState*): Self = StObject.set(x, "actionStates", js.Array(value :_*))
    
    @scala.inline
    def setInboundExecution(value: StageExecution): Self = StObject.set(x, "inboundExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundExecutionUndefined: Self = StObject.set(x, "inboundExecution", js.undefined)
    
    @scala.inline
    def setInboundTransitionState(value: TransitionState): Self = StObject.set(x, "inboundTransitionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundTransitionStateUndefined: Self = StObject.set(x, "inboundTransitionState", js.undefined)
    
    @scala.inline
    def setLatestExecution(value: StageExecution): Self = StObject.set(x, "latestExecution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestExecutionUndefined: Self = StObject.set(x, "latestExecution", js.undefined)
    
    @scala.inline
    def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
  }
}
