package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnalysisPermissionsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the analysis that you updated.
    */
  var AnalysisArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the analysis that you updated permissions for.
    */
  var AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * A structure that describes the principals and the resource-level permissions on an analysis.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object UpdateAnalysisPermissionsResponse {
  
  inline def apply(): UpdateAnalysisPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAnalysisPermissionsResponse]
  }
  
  extension [Self <: UpdateAnalysisPermissionsResponse](x: Self) {
    
    inline def setAnalysisArn(value: Arn): Self = StObject.set(x, "AnalysisArn", value.asInstanceOf[js.Any])
    
    inline def setAnalysisArnUndefined: Self = StObject.set(x, "AnalysisArn", js.undefined)
    
    inline def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAnalysisIdUndefined: Self = StObject.set(x, "AnalysisId", js.undefined)
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
