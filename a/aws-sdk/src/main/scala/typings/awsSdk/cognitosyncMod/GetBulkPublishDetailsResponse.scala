package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBulkPublishDetailsResponse extends js.Object {
  
  /**
    * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
    */
  var BulkPublishCompleteTime: js.UndefOr[Date] = js.native
  
  /**
    * The date/time at which the last bulk publish was initiated.
    */
  var BulkPublishStartTime: js.UndefOr[Date] = js.native
  
  /**
    * Status of the last bulk publish operation, valid values are: NOT_STARTED - No bulk publish has been requested for this identity pool IN_PROGRESS - Data is being published to the configured stream SUCCEEDED - All data for the identity pool has been published to the configured stream FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
    */
  var BulkPublishStatus: js.UndefOr[typings.awsSdk.cognitosyncMod.BulkPublishStatus] = js.native
  
  /**
    * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
    */
  var FailureMessage: js.UndefOr[String] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
}
object GetBulkPublishDetailsResponse {
  
  @scala.inline
  def apply(): GetBulkPublishDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBulkPublishDetailsResponse]
  }
  
  @scala.inline
  implicit class GetBulkPublishDetailsResponseOps[Self <: GetBulkPublishDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setBulkPublishCompleteTime(value: Date): Self = this.set("BulkPublishCompleteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkPublishCompleteTime: Self = this.set("BulkPublishCompleteTime", js.undefined)
    
    @scala.inline
    def setBulkPublishStartTime(value: Date): Self = this.set("BulkPublishStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkPublishStartTime: Self = this.set("BulkPublishStartTime", js.undefined)
    
    @scala.inline
    def setBulkPublishStatus(value: BulkPublishStatus): Self = this.set("BulkPublishStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkPublishStatus: Self = this.set("BulkPublishStatus", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
  }
}
