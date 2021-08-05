package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBulkPublishDetailsResponse extends StObject {
  
  /**
    * If BulkPublishStatus is SUCCEEDED, the time the last bulk publish operation completed.
    */
  var BulkPublishCompleteTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The date/time at which the last bulk publish was initiated.
    */
  var BulkPublishStartTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Status of the last bulk publish operation, valid values are: NOT_STARTED - No bulk publish has been requested for this identity pool IN_PROGRESS - Data is being published to the configured stream SUCCEEDED - All data for the identity pool has been published to the configured stream FAILED - Some portion of the data has failed to publish, check FailureMessage for the cause.
    */
  var BulkPublishStatus: js.UndefOr[typings.awsSdk.cognitosyncMod.BulkPublishStatus] = js.undefined
  
  /**
    * If BulkPublishStatus is FAILED this field will contain the error message that caused the bulk publish to fail.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.undefined
}
object GetBulkPublishDetailsResponse {
  
  inline def apply(): GetBulkPublishDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBulkPublishDetailsResponse]
  }
  
  extension [Self <: GetBulkPublishDetailsResponse](x: Self) {
    
    inline def setBulkPublishCompleteTime(value: Date): Self = StObject.set(x, "BulkPublishCompleteTime", value.asInstanceOf[js.Any])
    
    inline def setBulkPublishCompleteTimeUndefined: Self = StObject.set(x, "BulkPublishCompleteTime", js.undefined)
    
    inline def setBulkPublishStartTime(value: Date): Self = StObject.set(x, "BulkPublishStartTime", value.asInstanceOf[js.Any])
    
    inline def setBulkPublishStartTimeUndefined: Self = StObject.set(x, "BulkPublishStartTime", js.undefined)
    
    inline def setBulkPublishStatus(value: BulkPublishStatus): Self = StObject.set(x, "BulkPublishStatus", value.asInstanceOf[js.Any])
    
    inline def setBulkPublishStatusUndefined: Self = StObject.set(x, "BulkPublishStatus", js.undefined)
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
  }
}
