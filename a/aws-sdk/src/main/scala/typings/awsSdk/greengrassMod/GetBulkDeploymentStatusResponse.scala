package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBulkDeploymentStatusResponse extends StObject {
  
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
  implicit class GetBulkDeploymentStatusResponseMutableBuilder[Self <: GetBulkDeploymentStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkDeploymentMetrics(value: BulkDeploymentMetrics): Self = StObject.set(x, "BulkDeploymentMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkDeploymentMetricsUndefined: Self = StObject.set(x, "BulkDeploymentMetrics", js.undefined)
    
    @scala.inline
    def setBulkDeploymentStatus(value: BulkDeploymentStatus): Self = StObject.set(x, "BulkDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkDeploymentStatusUndefined: Self = StObject.set(x, "BulkDeploymentStatus", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(value: ErrorDetail*): Self = StObject.set(x, "ErrorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessage(value: string): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
