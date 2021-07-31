package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClassificationJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.undefined
}
object CreateClassificationJobResponse {
  
  @scala.inline
  def apply(): CreateClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClassificationJobResponse]
  }
  
  @scala.inline
  implicit class CreateClassificationJobResponseMutableBuilder[Self <: CreateClassificationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobArn(value: string): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    @scala.inline
    def setJobId(value: string): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}
