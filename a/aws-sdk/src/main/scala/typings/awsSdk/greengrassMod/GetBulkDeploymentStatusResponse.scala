package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBulkDeploymentStatusResponse extends js.Object {
  
  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  var BulkDeploymentMetrics: js.UndefOr[typings.awsSdk.greengrassMod.BulkDeploymentMetrics] = js.native
  
  /**
    * The status of the bulk deployment.
    */
  var BulkDeploymentStatus: js.UndefOr[typings.awsSdk.greengrassMod.BulkDeploymentStatus] = js.native
  
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.greengrassMod.ErrorDetails] = js.native
  
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  
  /**
    * Tag(s) attached to the resource arn.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object GetBulkDeploymentStatusResponse {
  
  @scala.inline
  def apply(): GetBulkDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBulkDeploymentStatusResponse]
  }
  
  @scala.inline
  implicit class GetBulkDeploymentStatusResponseOps[Self <: GetBulkDeploymentStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setBulkDeploymentMetrics(value: BulkDeploymentMetrics): Self = this.set("BulkDeploymentMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkDeploymentMetrics: Self = this.set("BulkDeploymentMetrics", js.undefined)
    
    @scala.inline
    def setBulkDeploymentStatus(value: BulkDeploymentStatus): Self = this.set("BulkDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkDeploymentStatus: Self = this.set("BulkDeploymentStatus", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: string): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(value: ErrorDetail*): Self = this.set("ErrorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = this.set("ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("ErrorDetails", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: string): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
