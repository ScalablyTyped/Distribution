package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorldGenerationJobResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the world generation job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world generation job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The failure code of the world generation job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldGenerationJobErrorCode] = js.native
  
  /**
    * The reason why the world generation job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  
  /**
    * Summary information about finished worlds.
    */
  var finishedWorldsSummary: js.UndefOr[FinishedWorldsSummary] = js.native
  
  /**
    * The status of the world generation job:  Pending  The world generation job request is pending.  Running  The world generation job is running.   Completed  The world generation job completed.   Failed  The world generation job failed. See failureCode for more information.   PartialFailed  Some worlds did not generate.  Canceled  The world generation job was cancelled.  Canceling  The world generation job is being cancelled.  
    */
  var status: js.UndefOr[WorldGenerationJobStatus] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world generation job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.native
  
  /**
    * Information about the world count.
    */
  var worldCount: js.UndefOr[WorldCount] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the generated worlds.
    */
  var worldTags: js.UndefOr[TagMap] = js.native
}
object DescribeWorldGenerationJobResponse {
  
  @scala.inline
  def apply(): DescribeWorldGenerationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorldGenerationJobResponse]
  }
  
  @scala.inline
  implicit class DescribeWorldGenerationJobResponseOps[Self <: DescribeWorldGenerationJobResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setFailureCode(value: WorldGenerationJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setFinishedWorldsSummary(value: FinishedWorldsSummary): Self = this.set("finishedWorldsSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishedWorldsSummary: Self = this.set("finishedWorldsSummary", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldGenerationJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setWorldCount(value: WorldCount): Self = this.set("worldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldCount: Self = this.set("worldCount", js.undefined)
    
    @scala.inline
    def setWorldTags(value: TagMap): Self = this.set("worldTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldTags: Self = this.set("worldTags", js.undefined)
  }
}
