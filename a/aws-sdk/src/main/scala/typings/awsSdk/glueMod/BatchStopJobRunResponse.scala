package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopJobRunResponse extends StObject {
  
  /**
    * A list of the errors that were encountered in trying to stop JobRuns, including the JobRunId for which each error was encountered and details about the error.
    */
  var Errors: js.UndefOr[BatchStopJobRunErrorList] = js.undefined
  
  /**
    * A list of the JobRuns that were successfully submitted for stopping.
    */
  var SuccessfulSubmissions: js.UndefOr[BatchStopJobRunSuccessfulSubmissionList] = js.undefined
}
object BatchStopJobRunResponse {
  
  @scala.inline
  def apply(): BatchStopJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunResponse]
  }
  
  @scala.inline
  implicit class BatchStopJobRunResponseMutableBuilder[Self <: BatchStopJobRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchStopJobRunErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchStopJobRunError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulSubmissions(value: BatchStopJobRunSuccessfulSubmissionList): Self = StObject.set(x, "SuccessfulSubmissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulSubmissionsUndefined: Self = StObject.set(x, "SuccessfulSubmissions", js.undefined)
    
    @scala.inline
    def setSuccessfulSubmissionsVarargs(value: BatchStopJobRunSuccessfulSubmission*): Self = StObject.set(x, "SuccessfulSubmissions", js.Array(value :_*))
  }
}
