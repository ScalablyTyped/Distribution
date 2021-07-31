package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentStatus extends StObject {
  
  /**
    * If the component failed, a message describing why.
    */
  var Message: js.UndefOr[TrialComponentStatusMessage] = js.undefined
  
  /**
    * The status of the trial component.
    */
  var PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus] = js.undefined
}
object TrialComponentStatus {
  
  @scala.inline
  def apply(): TrialComponentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentStatus]
  }
  
  @scala.inline
  implicit class TrialComponentStatusMutableBuilder[Self <: TrialComponentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: TrialComponentStatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setPrimaryStatus(value: TrialComponentPrimaryStatus): Self = StObject.set(x, "PrimaryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryStatusUndefined: Self = StObject.set(x, "PrimaryStatus", js.undefined)
  }
}
