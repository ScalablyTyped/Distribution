package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEvaluationsResponse extends StObject {
  
  /**
    * Requests that failed because of a client or server error.
    */
  var FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
}
object PutEvaluationsResponse {
  
  @scala.inline
  def apply(): PutEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEvaluationsResponse]
  }
  
  @scala.inline
  implicit class PutEvaluationsResponseMutableBuilder[Self <: PutEvaluationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedEvaluations(value: Evaluations): Self = StObject.set(x, "FailedEvaluations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedEvaluationsUndefined: Self = StObject.set(x, "FailedEvaluations", js.undefined)
    
    @scala.inline
    def setFailedEvaluationsVarargs(value: Evaluation*): Self = StObject.set(x, "FailedEvaluations", js.Array(value :_*))
  }
}
