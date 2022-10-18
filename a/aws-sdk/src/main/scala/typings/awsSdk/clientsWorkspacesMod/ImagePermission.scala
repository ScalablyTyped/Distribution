package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePermission extends StObject {
  
  /**
    * The identifier of the Amazon Web Services account that an image has been shared with.
    */
  var SharedAccountId: js.UndefOr[AwsAccount] = js.undefined
}
object ImagePermission {
  
  inline def apply(): ImagePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermission]
  }
  
  extension [Self <: ImagePermission](x: Self) {
    
    inline def setSharedAccountId(value: AwsAccount): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountIdUndefined: Self = StObject.set(x, "SharedAccountId", js.undefined)
  }
}
