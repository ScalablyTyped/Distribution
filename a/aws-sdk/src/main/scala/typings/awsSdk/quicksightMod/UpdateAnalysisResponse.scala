package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnalysisResponse extends StObject {
  
  /**
    * The ID of the analysis.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * The ARN of the analysis that you're updating.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * The update status of the last update that was made to the analysis.
    */
  var UpdateStatus: js.UndefOr[ResourceStatus] = js.native
}
object UpdateAnalysisResponse {
  
  @scala.inline
  def apply(): UpdateAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAnalysisResponse]
  }
  
  @scala.inline
  implicit class UpdateAnalysisResponseMutableBuilder[Self <: UpdateAnalysisResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUpdateStatus(value: ResourceStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
