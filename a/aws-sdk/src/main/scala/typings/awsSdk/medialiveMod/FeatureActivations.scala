package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureActivations extends StObject {
  
  /**
    * Enables the Input Prepare feature. You can create Input Prepare actions in the schedule only if this feature is enabled.
  If you disable the feature on an existing schedule, make sure that you first delete all input prepare actions from the schedule.
    */
  var InputPrepareScheduleActions: js.UndefOr[FeatureActivationsInputPrepareScheduleActions] = js.undefined
}
object FeatureActivations {
  
  @scala.inline
  def apply(): FeatureActivations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureActivations]
  }
  
  @scala.inline
  implicit class FeatureActivationsMutableBuilder[Self <: FeatureActivations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputPrepareScheduleActions(value: FeatureActivationsInputPrepareScheduleActions): Self = StObject.set(x, "InputPrepareScheduleActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPrepareScheduleActionsUndefined: Self = StObject.set(x, "InputPrepareScheduleActions", js.undefined)
  }
}
