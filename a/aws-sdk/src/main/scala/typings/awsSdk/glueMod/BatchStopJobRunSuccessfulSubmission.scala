package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStopJobRunSuccessfulSubmission extends StObject {
  
  /**
    * The name of the job definition used in the job run that was stopped.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * The JobRunId of the job run that was stopped.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}
object BatchStopJobRunSuccessfulSubmission {
  
  @scala.inline
  def apply(): BatchStopJobRunSuccessfulSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
  }
  
  @scala.inline
  implicit class BatchStopJobRunSuccessfulSubmissionMutableBuilder[Self <: BatchStopJobRunSuccessfulSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setJobRunId(value: IdString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
