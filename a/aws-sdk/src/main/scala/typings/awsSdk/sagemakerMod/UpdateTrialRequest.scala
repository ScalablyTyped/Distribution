package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrialRequest extends StObject {
  
  /**
    * The name of the trial as displayed. The name doesn't need to be unique. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The name of the trial to update.
    */
  var TrialName: ExperimentEntityName
}
object UpdateTrialRequest {
  
  @scala.inline
  def apply(TrialName: ExperimentEntityName): UpdateTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialRequest]
  }
  
  @scala.inline
  implicit class UpdateTrialRequestMutableBuilder[Self <: UpdateTrialRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = StObject.set(x, "TrialName", value.asInstanceOf[js.Any])
  }
}
