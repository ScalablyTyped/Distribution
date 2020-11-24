package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJobExecutionRequest extends js.Object {
  
  /**
    * Optional. A number that identifies a particular job execution on a particular device. If not specified, the latest job execution is returned.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.native
  
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: DescribeJobExecutionJobId = js.native
  
  /**
    * The thing name associated with the device the job execution is running on.
    */
  var thingName: ThingName = js.native
}
object DescribeJobExecutionRequest {
  
  @scala.inline
  def apply(jobId: DescribeJobExecutionJobId, thingName: ThingName): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
  
  @scala.inline
  implicit class DescribeJobExecutionRequestOps[Self <: DescribeJobExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobId(value: DescribeJobExecutionJobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = this.set("executionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionNumber: Self = this.set("executionNumber", js.undefined)
    
    @scala.inline
    def setIncludeJobDocument(value: IncludeJobDocument): Self = this.set("includeJobDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeJobDocument: Self = this.set("includeJobDocument", js.undefined)
  }
}
