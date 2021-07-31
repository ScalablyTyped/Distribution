package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobExecutionRequest extends StObject {
  
  /**
    * Optional. A number that identifies a particular job execution on a particular device. If not specified, the latest job execution is returned.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined
  
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: DescribeJobExecutionJobId
  
  /**
    * The thing name associated with the device the job execution is running on.
    */
  var thingName: ThingName
}
object DescribeJobExecutionRequest {
  
  @scala.inline
  def apply(jobId: DescribeJobExecutionJobId, thingName: ThingName): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
  
  @scala.inline
  implicit class DescribeJobExecutionRequestMutableBuilder[Self <: DescribeJobExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
    @scala.inline
    def setIncludeJobDocument(value: IncludeJobDocument): Self = StObject.set(x, "includeJobDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeJobDocumentUndefined: Self = StObject.set(x, "includeJobDocument", js.undefined)
    
    @scala.inline
    def setJobId(value: DescribeJobExecutionJobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
