package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePermissionsResult extends StObject {
  
  /**
    * An array of Permission objects that describe the stack permissions.   If the request object contains only a stack ID, the array contains a Permission object with permissions for each of the stack IAM ARNs.   If the request object contains only an IAM ARN, the array contains a Permission object with permissions for each of the user's stack IDs.   If the request contains a stack ID and an IAM ARN, the array contains a single Permission object with permissions for the specified stack and IAM ARN.  
    */
  var Permissions: js.UndefOr[typings.awsSdk.opsworksMod.Permissions] = js.native
}
object DescribePermissionsResult {
  
  @scala.inline
  def apply(): DescribePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionsResult]
  }
  
  @scala.inline
  implicit class DescribePermissionsResultMutableBuilder[Self <: DescribePermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: Permissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
  }
}
