package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTemplatePermissionsResponse extends StObject {
  
  /**
    * A list of resource permissions to be set on the template. 
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var TemplateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID for the template.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined
}
object DescribeTemplatePermissionsResponse {
  
  @scala.inline
  def apply(): DescribeTemplatePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTemplatePermissionsResponse]
  }
  
  @scala.inline
  implicit class DescribeTemplatePermissionsResponseMutableBuilder[Self <: DescribeTemplatePermissionsResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTemplateArn(value: Arn): Self = StObject.set(x, "TemplateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateArnUndefined: Self = StObject.set(x, "TemplateArn", js.undefined)
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
