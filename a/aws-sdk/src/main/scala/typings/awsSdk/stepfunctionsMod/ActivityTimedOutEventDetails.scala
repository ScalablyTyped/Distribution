package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTimedOutEventDetails extends StObject {
  
  /**
    * A more detailed explanation of the cause of the timeout.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
}
object ActivityTimedOutEventDetails {
  
  @scala.inline
  def apply(): ActivityTimedOutEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityTimedOutEventDetails]
  }
  
  @scala.inline
  implicit class ActivityTimedOutEventDetailsMutableBuilder[Self <: ActivityTimedOutEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: SensitiveCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setError(value: SensitiveError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
