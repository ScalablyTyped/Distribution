package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnalysisResponse extends js.Object {
  
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
  implicit class UpdateAnalysisResponseOps[Self <: UpdateAnalysisResponse] (val x: Self) extends AnyVal {
    
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
    def setAnalysisId(value: RestrictiveResourceId): Self = this.set("AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisId: Self = this.set("AnalysisId", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: ResourceStatus): Self = this.set("UpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateStatus: Self = this.set("UpdateStatus", js.undefined)
  }
}
