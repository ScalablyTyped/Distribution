package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionTimedOutEventDetails extends StObject {
  
  /**
    * A more detailed explanation of the cause of the timeout.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
}
object ExecutionTimedOutEventDetails {
  
  @scala.inline
  def apply(): ExecutionTimedOutEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionTimedOutEventDetails]
  }
  
  @scala.inline
  implicit class ExecutionTimedOutEventDetailsMutableBuilder[Self <: ExecutionTimedOutEventDetails] (val x: Self) extends AnyVal {
    
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
