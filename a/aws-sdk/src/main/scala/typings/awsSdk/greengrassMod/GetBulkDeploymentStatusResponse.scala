package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBulkDeploymentStatusResponse extends StObject {
  
  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  var BulkDeploymentMetrics: js.UndefOr[typings.awsSdk.greengrassMod.BulkDeploymentMetrics] = js.undefined
  
  /**
    * The status of the bulk deployment.
    */
  var BulkDeploymentStatus: js.UndefOr[typings.awsSdk.greengrassMod.BulkDeploymentStatus] = js.undefined
  
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * Error details
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.greengrassMod.ErrorDetails] = js.undefined
  
  /**
    * Error message
    */
  var ErrorMessage: js.UndefOr[string] = js.undefined
  
  /**
    * Tag(s) attached to the resource arn.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object GetBulkDeploymentStatusResponse {
  
  inline def apply(): GetBulkDeploymentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBulkDeploymentStatusResponse]
  }
  
  extension [Self <: GetBulkDeploymentStatusResponse](x: Self) {
    
    inline def setBulkDeploymentMetrics(value: BulkDeploymentMetrics): Self = StObject.set(x, "BulkDeploymentMetrics", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentMetricsUndefined: Self = StObject.set(x, "BulkDeploymentMetrics", js.undefined)
    
    inline def setBulkDeploymentStatus(value: BulkDeploymentStatus): Self = StObject.set(x, "BulkDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentStatusUndefined: Self = StObject.set(x, "BulkDeploymentStatus", js.undefined)
    
    inline def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setErrorDetailsVarargs(value: ErrorDetail*): Self = StObject.set(x, "ErrorDetails", js.Array(value :_*))
    
    inline def setErrorMessage(value: string): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
