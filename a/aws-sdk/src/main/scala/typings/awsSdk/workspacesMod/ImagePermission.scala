package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePermission extends StObject {
  
  /**
    * The identifier of the AWS account that an image has been shared with.
    */
  var SharedAccountId: js.UndefOr[AwsAccount] = js.native
}
object ImagePermission {
  
  @scala.inline
  def apply(): ImagePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermission]
  }
  
  @scala.inline
  implicit class ImagePermissionMutableBuilder[Self <: ImagePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedAccountId(value: AwsAccount): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountIdUndefined: Self = StObject.set(x, "SharedAccountId", js.undefined)
  }
}
