package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAnalysisPermissionsResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the analysis whose permissions you're describing.
    */
  var AnalysisArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the analysis whose permissions you're describing.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.native
  
  /**
    * A structure that describes the principals and the resource-level permissions on an analysis.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object DescribeAnalysisPermissionsResponse {
  
  @scala.inline
  def apply(): DescribeAnalysisPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnalysisPermissionsResponse]
  }
  
  @scala.inline
  implicit class DescribeAnalysisPermissionsResponseOps[Self <: DescribeAnalysisPermissionsResponse] (val x: Self) extends AnyVal {
    
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
    def setAnalysisArn(value: Arn): Self = this.set("AnalysisArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisArn: Self = this.set("AnalysisArn", js.undefined)
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = this.set("AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisId: Self = this.set("AnalysisId", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
