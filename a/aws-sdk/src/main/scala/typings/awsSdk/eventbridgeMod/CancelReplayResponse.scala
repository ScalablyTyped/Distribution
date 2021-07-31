package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReplayResponse extends StObject {
  
  /**
    * The ARN of the replay to cancel.
    */
  var ReplayArn: js.UndefOr[typings.awsSdk.eventbridgeMod.ReplayArn] = js.undefined
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.undefined
  
  /**
    * The reason that the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.undefined
}
object CancelReplayResponse {
  
  @scala.inline
  def apply(): CancelReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelReplayResponse]
  }
  
  @scala.inline
  implicit class CancelReplayResponseMutableBuilder[Self <: CancelReplayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplayArn(value: ReplayArn): Self = StObject.set(x, "ReplayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplayArnUndefined: Self = StObject.set(x, "ReplayArn", js.undefined)
    
    @scala.inline
    def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: ReplayStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
