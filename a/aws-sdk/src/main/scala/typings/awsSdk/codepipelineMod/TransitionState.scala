package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionState extends StObject {
  
  /**
    * The user-specified reason why the transition between two stages of a pipeline was disabled.
    */
  var disabledReason: js.UndefOr[DisabledReason] = js.undefined
  
  /**
    * Whether the transition between stages is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  
  /**
    * The timestamp when the transition state was last changed.
    */
  var lastChangedAt: js.UndefOr[LastChangedAt] = js.undefined
  
  /**
    * The ID of the user who last changed the transition state.
    */
  var lastChangedBy: js.UndefOr[LastChangedBy] = js.undefined
}
object TransitionState {
  
  @scala.inline
  def apply(): TransitionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionState]
  }
  
  @scala.inline
  implicit class TransitionStateMutableBuilder[Self <: TransitionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledReason(value: DisabledReason): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLastChangedAt(value: LastChangedAt): Self = StObject.set(x, "lastChangedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedAtUndefined: Self = StObject.set(x, "lastChangedAt", js.undefined)
    
    @scala.inline
    def setLastChangedBy(value: LastChangedBy): Self = StObject.set(x, "lastChangedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedByUndefined: Self = StObject.set(x, "lastChangedBy", js.undefined)
  }
}
