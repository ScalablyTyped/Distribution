package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorldExportJobResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the world export job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world export job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The failure code of the world export job if it failed:  InternalServiceError  Internal service error.  LimitExceeded  The requested resource exceeds the maximum number allowed, or the number of concurrent stream requests exceeds the maximum number allowed.   ResourceNotFound  The specified resource could not be found.   RequestThrottled  The request was throttled.  InvalidInput  An input parameter in the request is not valid.  
    */
  var failureCode: js.UndefOr[WorldExportJobErrorCode] = js.native
  
  /**
    * The reason why the world export job failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  
  /**
    * The IAM role that the world export process uses to access the Amazon S3 bucket and put the export.
    */
  var iamRole: js.UndefOr[IamRole] = js.native
  
  var outputLocation: js.UndefOr[OutputLocation] = js.native
  
  /**
    * The status of the world export job.  Pending  The world export job request is pending.  Running  The world export job is running.   Completed  The world export job completed.   Failed  The world export job failed. See failureCode and failureReason for more information.   Canceled  The world export job was cancelled.  Canceling  The world export job is being cancelled.  
    */
  var status: js.UndefOr[WorldExportJobStatus] = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the world export job.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * A list of Amazon Resource Names (arns) that correspond to worlds to be exported.
    */
  var worlds: js.UndefOr[Arns] = js.native
}
object DescribeWorldExportJobResponse {
  
  @scala.inline
  def apply(): DescribeWorldExportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorldExportJobResponse]
  }
  
  @scala.inline
  implicit class DescribeWorldExportJobResponseOps[Self <: DescribeWorldExportJobResponse] (val x: Self) extends AnyVal {
    
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
    def setFailureCode(value: WorldExportJobErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setIamRole(value: IamRole): Self = this.set("iamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRole: Self = this.set("iamRole", js.undefined)
    
    @scala.inline
    def setOutputLocation(value: OutputLocation): Self = this.set("outputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLocation: Self = this.set("outputLocation", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldExportJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setWorldsVarargs(value: Arn*): Self = this.set("worlds", js.Array(value :_*))
    
    @scala.inline
    def setWorlds(value: Arns): Self = this.set("worlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorlds: Self = this.set("worlds", js.undefined)
  }
}
