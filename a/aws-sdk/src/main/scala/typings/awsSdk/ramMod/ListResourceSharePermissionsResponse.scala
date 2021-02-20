package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceSharePermissionsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The permissions associated with the resource share.
    */
  var permissions: js.UndefOr[ResourceSharePermissionList] = js.native
}
object ListResourceSharePermissionsResponse {
  
  @scala.inline
  def apply(): ListResourceSharePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceSharePermissionsResponse]
  }
  
  @scala.inline
  implicit class ListResourceSharePermissionsResponseMutableBuilder[Self <: ListResourceSharePermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPermissions(value: ResourceSharePermissionList): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: ResourceSharePermissionSummary*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
