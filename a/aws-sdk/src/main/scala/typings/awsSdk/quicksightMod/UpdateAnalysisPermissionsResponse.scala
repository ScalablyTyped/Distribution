package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAnalysisPermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the analysis that you updated.
    */
  var AnalysisArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the analysis that you updated permissions for.
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
object UpdateAnalysisPermissionsResponse {
  
  @scala.inline
  def apply(): UpdateAnalysisPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAnalysisPermissionsResponse]
  }
  
  @scala.inline
  implicit class UpdateAnalysisPermissionsResponseMutableBuilder[Self <: UpdateAnalysisPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisArn(value: Arn): Self = StObject.set(x, "AnalysisArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisArnUndefined: Self = StObject.set(x, "AnalysisArn", js.undefined)
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
    
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
