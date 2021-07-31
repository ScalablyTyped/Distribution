package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysisResponse extends StObject {
  
  /**
    * The ID of the deleted analysis.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the deleted analysis.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The date and time that the analysis is scheduled to be deleted.
    */
  var DeletionTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DeleteAnalysisResponse {
  
  @scala.inline
  def apply(): DeleteAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAnalysisResponse]
  }
  
  @scala.inline
  implicit class DeleteAnalysisResponseMutableBuilder[Self <: DeleteAnalysisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setDeletionTime(value: Timestamp_): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
