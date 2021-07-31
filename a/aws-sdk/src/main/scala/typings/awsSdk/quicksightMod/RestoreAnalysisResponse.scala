package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreAnalysisResponse extends StObject {
  
  /**
    * The ID of the analysis that you're restoring. 
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the analysis that you're restoring.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object RestoreAnalysisResponse {
  
  @scala.inline
  def apply(): RestoreAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreAnalysisResponse]
  }
  
  @scala.inline
  implicit class RestoreAnalysisResponseMutableBuilder[Self <: RestoreAnalysisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
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
