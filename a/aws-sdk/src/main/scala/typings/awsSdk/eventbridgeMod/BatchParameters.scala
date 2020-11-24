package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchParameters extends js.Object {
  
  /**
    * The array properties for the submitted job, such as the size of the array. The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes an array job. This parameter is used only if the target is an AWS Batch job.
    */
  var ArrayProperties: js.UndefOr[BatchArrayProperties] = js.native
  
  /**
    * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
    */
  var JobDefinition: String = js.native
  
  /**
    * The name to use for this execution of the job, if the target is an AWS Batch job.
    */
  var JobName: String = js.native
  
  /**
    * The retry strategy to use for failed jobs, if the target is an AWS Batch job. The retry strategy is the number of times to retry the failed job execution. Valid values are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job definition.
    */
  var RetryStrategy: js.UndefOr[BatchRetryStrategy] = js.native
}
object BatchParameters {
  
  @scala.inline
  def apply(JobDefinition: String, JobName: String): BatchParameters = {
    val __obj = js.Dynamic.literal(JobDefinition = JobDefinition.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchParameters]
  }
  
  @scala.inline
  implicit class BatchParametersOps[Self <: BatchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobDefinition(value: String): Self = this.set("JobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayProperties(value: BatchArrayProperties): Self = this.set("ArrayProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayProperties: Self = this.set("ArrayProperties", js.undefined)
    
    @scala.inline
    def setRetryStrategy(value: BatchRetryStrategy): Self = this.set("RetryStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryStrategy: Self = this.set("RetryStrategy", js.undefined)
  }
}
